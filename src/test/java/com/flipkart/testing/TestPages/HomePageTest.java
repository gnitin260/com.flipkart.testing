package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.HomePage;
import com.flipkart.testing.Pages.Login;

public class HomePageTest extends Basecls{

	HomePage home;
	Login log;
	public HomePageTest() {
		super();
	}

	@BeforeTest
	public void setup() throws InterruptedException {
		intialization();
		home= new HomePage();
		log= new Login();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test (priority = 1)
	public void titleTest() {
		String title= home.title();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	
	}

	@Test (priority = 2)
	public void logoTest() {
		boolean flag = home.logovalidate();
		Assert.assertTrue(flag);
	
	}

	@Test (priority = 3)
	public void ValidateHomepageImgTest() throws InterruptedException {
		Thread.sleep(1000);
		boolean gromm=home.groomingValidaion();
		Assert.assertTrue(gromm);
		Thread.sleep(1000);
		boolean bodycr= home.bodyCareValidaion();
		Assert.assertTrue(bodycr);
		Thread.sleep(1000);
		boolean homeEssen= home.homeEssentialValidaion();
		Assert.assertTrue(homeEssen);
		Thread.sleep(1000);
		boolean bookandpet = home.petandbookValidaion();
		Assert.assertTrue(bookandpet);

	}

	@Test (priority = 4)
	public void AboutusValidationTest() throws InterruptedException {
		Thread.sleep(2000);
		home.AboutusbtnValidation();
	
	}

	@Test (priority = 5)
	public void contactUsValidationTest() throws InterruptedException {
		Thread.sleep(3000);
		home.contactUsValidation();
	}

	
	@AfterTest
	public void tearDown() {
		 driver.close();
		 
	}
}
