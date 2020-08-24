package com.flipkart.testing.TestPages.MicroSoft_Product;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Electronics.Laptop.Microsoft_Surface.MicroSoftProducts;
import com.flipkart.testing.Utility.CustomeListner;
@Listeners(CustomeListner.class)

public class MicroSoft_product_Test extends Basecls{

	Login log;
	Menu menu;
	MicroSoftProducts microsoft;

	public MicroSoft_product_Test() {
		super();
	}

	@BeforeTest
	public void Setup() throws InterruptedException {
		intialization();
		log= new Login();
		menu= new Menu();
		microsoft= new MicroSoftProducts();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoMicroSoft_Product();
	}
	
	@Test(priority = 1)
	public void TitleTest() throws InterruptedException {
		String txt= microsoft.TitleVerify();
		Assert.assertEquals(txt, "Microsoft Store Online - Buy Microsoft Online at Best Price in India | Flipkart.com");
	}

	@Test(priority = 2)
	public void PageVerifyTest() throws InterruptedException {
		String txt= microsoft.PageVerify();
		Assert.assertEquals(txt, "Microsoft Store");
	}
	
	@Test(priority = 3)
	public void Surface7ProImgVerify_Test() throws IOException, InterruptedException {
	boolean flg= microsoft.SurfacePro7ImgVerify();
	Assert.assertTrue(flg);
	}
	
	@Test(priority = 4)
	public void AllSurfaceImgVerify_Test() throws IOException, InterruptedException {
	boolean flg= microsoft.AllSurfaceImgVerify();
	Assert.assertTrue(flg);
	}
	
	@Test(priority = 5)
	public void Surface7ProImg2Verify_Test() throws IOException, InterruptedException {
	boolean flg= microsoft.Surface7ProImg2Verify();
	Assert.assertTrue(flg);
	}
	
	@Test(priority = 6)
	public void ServicesMicrosoftImgVerify_Test() throws IOException, InterruptedException {
	boolean flg= microsoft.ServicesMicrosoftImgVerify();
	Assert.assertTrue(flg);
	}
	
	@Test(priority = 7)
	public void AboutMicroSoftImgVerify_Test() throws IOException, InterruptedException {
	boolean flg= microsoft.AboutMicroSoftImgVerify();
	Assert.assertTrue(flg);
	}
	
	
	
	
	
	@AfterTest
	public void tesrdown() {
		driver.quit();
	}



}
