package com.flipkart.testing.TestPages;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.AboutUs;
import com.flipkart.testing.Pages.HomePage;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Utility.CustomeListner;

@Listeners(CustomeListner.class)
public class AboutUsTest extends Basecls {

	AboutUs about;
	HomePage home;
	Login log;
	
	public AboutUsTest() {
		super();
	}

	
	@BeforeTest
	public void setUp() throws InterruptedException {
		intialization();
		about= new AboutUs();
		home= new HomePage();
		log= new Login();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		home.AboutusbtnValidation();
	}

	@Test (priority = 1)
	public void aboutUsTitleTest() throws InterruptedException {
		Thread.sleep(0000);
		String title= about.aboutUsTitle();
		AssertJUnit.assertEquals(title, "About Us");
	}
	
	@Test (priority = 2)

	public void flipkartStoryImgTest() throws InterruptedException, IOException {
		Thread.sleep(0000);
		boolean flash= about.flipkartStroyimg();
		AssertJUnit.assertTrue(flash);
	}
	
	@Test (priority = 3)
	public void launchDetailImgTest() throws IOException, InterruptedException {
		boolean flag= about.launchDetailimg();
		Thread.sleep(0000);
		AssertJUnit.assertTrue(flag);
	}
	@Test (priority = 4)
	public void objimgTest() throws InterruptedException, IOException {
		boolean flag= about.objImg();
		Thread.sleep(0000);
		AssertJUnit.assertTrue(flag);
	}
	@Test (priority = 5)
	public void startBy2ImgTest() throws InterruptedException, IOException {
		boolean flag= about.startby2Img();
		Thread.sleep(0000);
		AssertJUnit.assertTrue(flag);
	}
	
	@Test (priority = 6)
	public void detaiImgTest() throws InterruptedException, IOException {
		boolean flag= about.detailimg();
		Thread.sleep(0000);
		AssertJUnit.assertTrue(flag);
	}
	
	@Test (priority = 7)
	public void growthImgTest() throws InterruptedException, IOException {
		boolean flag= about.growthimg();
		Thread.sleep(0000);
		AssertJUnit.assertTrue(flag);
	}
	
	@Test (priority = 8)
	public void globalImgTest() throws InterruptedException, IOException {
		boolean flag= about.globalimg();
		Thread.sleep(0000);
		AssertJUnit.assertTrue(flag);
	}
	
	@Test (priority = 9)
	public void mailUsTest() throws InterruptedException {
		String data= about.mailUsdetailvalidation();
		Thread.sleep(0000);
		AssertJUnit.assertEquals(data, "Mail Us:\n" + 
				"Flipkart Internet Private Limited,\n" + 
				"Buildings Alyssa, Begonia &\n" + 
				"Clove Embassy Tech Village,\n" + 
				"Outer Ring Road, Devarabeesanahalli Village,\n" + 
				"Bengaluru, 560103,\n" + 
				"Karnataka, India");
		
	}
	

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
