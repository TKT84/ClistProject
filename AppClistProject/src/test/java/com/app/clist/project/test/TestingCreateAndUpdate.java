package com.app.clist.project.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.app.clist.project.dao.*;
import com.app.clist.project.entities.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestingCreateAndUpdate {

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
	public void testCreateAndUpdate() throws ParseException {
		
		Identification id = new Identification("thierry", "12345");
		Identification id2 = new Identification("annah", "12345");
		Identification id3 = new Identification("jeremy", "12345");
		Identification id4 = new Identification("dan", "12345");
		
		Address address = new Address(1, "rue de la reine", "zimbo", "quartier simba","luebo");
		Address address1 = new Address(1, "rue de la reine1", "zimbo2", "quartier simba3","luebo4");
		Address address2 = new Address(1, "rue de la reine", "zimbo", "quartier simba","luebo");
		Address address3 = new Address(1, "rue de la reine14", "zimbo2", "quartier simba3","luebo4");
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date hD1 = sdf.parse( "02/05/1980" );
        Date hD2 = sdf.parse( "02/05/1980" );
        
        
        
        
        UserClient uc1 = new UserClient("lolo@gmail.com",address, 1234564453544L, id);
        UserClient uc2 = new UserClient("logo@gmail.com",address2, 1234564453544L, id2);
        UserClient uc3 = new UserClient("lodo@gmail.com",address1, 1234564453544L, id3);
        
        
        UserAdmin ua1 = new UserAdmin("lalo@gmail.com",address3, 123456445456744L, id4);
        
        Description des = new Description("selling some drugs", 20.00, address);
        Description des1 = new Description("selling some drugs", 20.00, address);
        Description des2 = new Description("selling some drugs", 20.00, address);
        Description des3 = new Description("selling some drugs", 20.00, address);
        Description des4 = new Description("selling some drugs", 20.00, address);
        Description des5 = new Description("selling some drugs", 20.00, address);
        
        ProductJobs prod = new ProductJobs("drugs for sale",des, uc1, Jobs.ADMINISTRATIONOFFICE);
        ProductJobs prod1 = new ProductJobs("drugs for sale1",des1, uc1, Jobs.ADMINISTRATIONOFFICE);
        ProductForSale fs2 = new ProductForSale("drugs for sale2",des2, uc1, ForSale.ANTIQUES);
        ProductJobs prod3 = new ProductJobs("drugs for sale3",des3, uc2, Jobs.ADMINISTRATIONOFFICE);
        ProductJobs prod4 = new ProductJobs("drugs for sale4",des4, uc2, Jobs.ADMINISTRATIONOFFICE);
        ProductJobs prod5 = new ProductJobs("drugs for sale5",des5, uc2, Jobs.ADMINISTRATIONOFFICE);
        
        
        
        //CREATE
        userClientDao.create(uc1);  
        userClientDao.create(uc3);
        userClientDao.create(uc2); 
        userAdminDao.create(ua1);
        productJobsDao.create(prod);
        productJobsDao.create(prod1);
        productForSaleDao.create(fs2);
        productJobsDao.create(prod3);
        productJobsDao.create(prod4);
        productJobsDao.create(prod5);
       
        
        //UPDATE
        prod.setJobType(Jobs.ACCOUNTINGFINANCE);
        des.setDescription("selling arms");
        //identificationDao.create(id);
        productJobsDao.update(prod);
        descriptionDao.update(des);
        
        
	}
	
}
