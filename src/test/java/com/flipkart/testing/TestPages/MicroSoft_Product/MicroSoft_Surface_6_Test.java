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
import com.flipkart.testing.Pages.Electronics.Laptop.Microsoft_Surface.MicroSoft_Surface_6;
import com.flipkart.testing.Utility.CustomeListner;
@Listeners(CustomeListner.class)

public class MicroSoft_Surface_6_Test extends Basecls{

	Login log;
	Menu menu;
	MicroSoftProducts microsoft;
	MicroSoft_Surface_6 surface6;

	public MicroSoft_Surface_6_Test() {
		super();

	}
	@BeforeTest
	public void Setup() throws InterruptedException {
		intialization();
		log= new Login();
		menu= new Menu();
		surface6= new MicroSoft_Surface_6();
		microsoft= new MicroSoftProducts();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoMicroSoft_Product();
		microsoft.navigatetoMicroSoft_6_Pro();

	}

	@Test
	public void TitleVerify_Test() throws InterruptedException {
		String txt= surface6.TitleVerify();
		Assert.assertEquals(txt, "Festive Sale Microsoft Surface - Buy Festive Sale Microsoft Surface Online at Low Prices In India | Flipkart.com");
	}

	@Test
	public void ProductVerify_Test() {
		String txt= surface6.Product_1st_Verify();
		Assert.assertEquals(txt, "Microsoft Surface Pro 6 Core i7 8th Gen - (8 GB/256 GB SSD/Windows 10 Home) 1796 2 in 1 Laptop");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}


