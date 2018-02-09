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
public class TestingFindAndFindAllMethods {
	
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
	public void testFind() {
		
//	AbstractUser au = abstractUserDao.find(84L);	
//	AbstractUser au2 = abstractUserDao.find(88L);	
//	AbstractUser au3 = abstractUserDao.find(90L);
//	
//	UserClient cu = userClientDao.find(84L);
//	UserClient cu2 = userClientDao.find(88L);
//	UserAdmin ua = userAdminDao.find(90L);
//	Description des = descriptionDao.find(87L);
//	ProductJobs pj = productJobsDao.find(86L);
//	Identification id = identificationDao.find(85L);
//	
//	Assert.assertTrue(au.getId().equals(84L));
//	Assert.assertTrue(au2.getId().equals(88L));
//	Assert.assertTrue(au3.getId().equals(90L));
//	Assert.assertTrue(cu.getId().equals(84L));
//	Assert.assertTrue(cu2.getId().equals(88L));
//	Assert.assertTrue(ua.getId().equals(90L));
//	Assert.assertTrue(des.getId().equals(87L));
//	Assert.assertTrue(pj.getId().equals(86L));
//	Assert.assertTrue(id.getId().equals(85L));
//	
//	Assert.assertTrue(au.getAddress().getLandmark().equals("zimbo"));
//	
	}

}
