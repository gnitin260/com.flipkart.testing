package com.flipkart.testing.TestPages.MicroSoft_Product;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Electronics.Laptop.Microsoft_Surface.MicroSoftProducts;
import com.flipkart.testing.Pages.Electronics.Laptop.Microsoft_Surface.MicroSoft_SurfacePro_7;
import com.flipkart.testing.Utility.CustomeListner;

@Listeners(CustomeListner.class)
public class MicroSoft_Surface_7_Test extends Basecls{

	Login log;
	Menu menu;
	MicroSoftProducts microsoft;
	MicroSoft_SurfacePro_7 surface7;

	public MicroSoft_Surface_7_Test() {
		super();

	}
	@BeforeTest
	public void Setup() throws InterruptedException {
		intialization();
		log= new Login();
		menu= new Menu();
		surface7= new MicroSoft_SurfacePro_7();
		microsoft= new MicroSoftProducts();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoMicroSoft_Product();
		microsoft.navigatetoMicroSoft_7_Pro();

	}

	@Test
	public void TitleVerify_Test() throws InterruptedException {
		String txt= surface7.TitleVerify();
		Assert.assertEquals(txt, "Surface 7 FSNs - Buy Surface 7 FSNs Online at Low Prices In India | Flipkart.com");
	}

	@Test
	public void ProductVerify_Test() {
		String txt= surface7.Product_1st_Verify();
		Assert.assertEquals(txt, "Microsoft Surface Pro 7 Core i5 10th Gen - (8 GB/128 GB SSD/Windows 10 Home) 1866 2 in 1 Laptop");
	}
	
	
	@AfterTest
	public void tearDown() {
	//	driver.quit();
	}
}
