package com.app.clist.project.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.clist.project.dao.*;
import com.app.clist.project.entities.AbstractUser;
import com.app.clist.project.entities.Description;
import com.app.clist.project.entities.Identification;
import com.app.clist.project.entities.ProductJobs;
import com.app.clist.project.entities.UserAdmin;
import com.app.clist.project.entities.UserClient;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestingDeleteMethods {
	
	//DAO INJECTION
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
	
	@Test
	public void testDelete() {
		
//	AbstractUser au = abstractUserDao.find(84L);	
//	AbstractUser au2 = abstractUserDao.find(88L);	
//	AbstractUser au3 = abstractUserDao.find(90L);
//	
//	UserClient cu = userClientDao.find(84L);
//	UserClient cu2 = userClientDao.find(88L);
//	UserAdmin ua = userAdminDao.find(90L);
//	Description des = descriptionDao.find(87L);
//	ProductJobs pj = productJobsDao.find(94L);
//	Identification id = identificationDao.find(85L);
//	
//	productJobsDao.delete(pj);
//	//userClientDao.delete(cu2);	
	}
}
