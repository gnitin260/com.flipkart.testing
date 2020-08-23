package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Electronics.Mobile.Apple;
import com.flipkart.testing.Pages.Electronics.Mobile.Mobile;

public class AppleTest extends Basecls{

	Apple iphone;
	Mobile mob;
	Login log;

	public AppleTest() {
		super();
	}

	
	@BeforeTest
	public void setUp() throws InterruptedException {
		intialization();
		iphone = new Apple();
		mob = new Mobile();
		log = new Login();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		mob.NavigatetoIphone();
	}

	@Test (priority = 1)
	public void TitleTest() throws InterruptedException {
		Thread.sleep(5000);
		String title = iphone.titleVerification();
		Assert.assertEquals(title, "Apple Products Store Online - Buy Apple Products Online at Best Price in India | Flipkart.com");

	}

	@Test (priority = 2)
	public void PageVerification() throws InterruptedException {
		String txt = iphone.PageVerification();
		Assert.assertEquals(txt, "Apple Store");
	}

	@Test(priority = 3)
	public void Iphone8PlusTest() {
		boolean flag=iphone.iphone8plusVerify();
		Assert.assertTrue(flag);

	}

	@Test(priority = 4)
	public void Iphone8Test() {
		boolean flag=iphone.iphone8Verify();
		Assert.assertTrue(flag);

	}

	@Test(priority = 5)
	public void Iphone7Test() {
		boolean flag=iphone.iphone7Verify();
		Assert.assertTrue(flag);

	}

	@Test(priority = 6)
	public void ipadTest() throws InterruptedException {
		boolean flag= iphone.ipadprobnrVerify();
		Assert.assertTrue(flag);
		Thread.sleep(500);
//		boolean flag2= iphone.ipadproVerify();
//		Assert.assertTrue(flag2);
//		Thread.sleep(500);
//		boolean flag3= iphone.ipadMiniVerify();
//		Assert.assertTrue(flag3);
//		Thread.sleep(500);
//		boolean flag4= iphone.ipadVerify();
//		Assert.assertTrue(flag4);
//		Thread.sleep(500);
	}


//	@Test(priority = 7)
//	public void MacBookbnrTest() throws InterruptedException {
//		boolean flag= iphone.MacBookAirbnrverify();
//		Assert.assertTrue(flag);
//		Thread.sleep(500);
//		
//	}
	@Test(priority = 8)
	public void MacbookofferTest() throws InterruptedException {
		boolean flag2= iphone.MacBookOfferverify();
		Assert.assertTrue(flag2);
		Thread.sleep(500);
		
	}
	
	@Test(priority = 9)
	public void MacbookAssesTest() throws InterruptedException {
		boolean flag2= iphone.MacBookOfferverify();
		Assert.assertTrue(flag2);
		Thread.sleep(500);
		
	}
	@Test(priority = 10)
	public void MacbookAirTest() throws InterruptedException {
		boolean flag4= iphone.MacBookAir();
		Assert.assertTrue(flag4);
		Thread.sleep(500);
		
	}

	@Test(priority = 11)
	public void AppleWatchTest() throws InterruptedException {
		boolean flag = iphone.ApplewatchVerify();
		Assert.assertTrue(flag);
	}

	
	@AfterTest
	public void tearDown() {
		driver.quit();
	
	}

}
