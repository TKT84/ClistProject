package com.app.clist.project.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.clist.project.dao.AbstractUserDao;
import com.app.clist.project.dao.DescriptionDao;
import com.app.clist.project.dao.IdentificationDao;
import com.app.clist.project.dao.ProductDao;
import com.app.clist.project.dao.ProductForSaleDao;
import com.app.clist.project.dao.ProductGigsDao;
import com.app.clist.project.dao.ProductHousingDao;
import com.app.clist.project.dao.ProductJobsDao;
import com.app.clist.project.dao.UserAdminDao;
import com.app.clist.project.dao.UserClientDao;
import com.app.clist.project.entities.UserAdmin;
import com.app.clist.project.exception.AdminAlreadyExists;
import com.app.clist.project.exception.AdminIsNotFoundException;


@Service
public class UserAdminServices {
	
	@Autowired
	AbstractUserDao abstractUserDao;
	@Autowired
	UserAdminDao userAdminDao;
	@Autowired
	UserClientDao userClientDao;
	@Autowired
	IdentificationDao identificationDao;
	@Autowired
	DescriptionDao descriptionDao;
	@Autowired
	ProductDao productDao;
	@Autowired
	ProductForSaleDao productForSaleDao;
	@Autowired
	ProductGigsDao productGigsDao;
	@Autowired
	ProductHousingDao productHousingDao;
	@Autowired
	ProductJobsDao productJobsDao;
	
	// TO LOGIN  - GOOD
		public UserAdmin signIn(String username, String password) throws AdminIsNotFoundException {

			UserAdmin ua = userAdminDao.findByIdentification(username, password);

			if (ua == null) {

				throw new AdminIsNotFoundException(
						"The Authentication that you entered does not match the information we have on file");

			} else {
				return ua;
			}
		}

		// TO LOGOUT - GOOD
		public void signOut(HttpServletRequest request, UserAdmin userAdminLoggedin) {
			//adminClientLoggedin = adminClientDao.find(adminClientLoggedin.getId());
			HttpSession session = request.getSession();
			session.invalidate();
		}

		// TO SIGN UP - GOOD
		public UserAdmin signUp(UserAdmin ua) throws AdminAlreadyExists {
			if (userAdminDao.findByEmail(ua.getEmail()) != null) {
				throw new AdminAlreadyExists("The Authentication information that you entered already exists");
			} else {
				return userAdminDao.create(ua);
			}
		}

		// MODIFY USERCLIENT - GOOD
		public UserAdmin modifyUserAdmin(UserAdmin userAdmin) {
			return userAdminDao.update(userAdmin);

		};
	
	
}
