package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Electronics.Mobile.Mobile;

public class MobileTest extends Basecls{
	
	Mobile mob;
	Login log;
	
	public MobileTest() {
		super();

	}

	
	@BeforeTest
	public void setUp() throws InterruptedException {
		intialization();
		mob = new Mobile();
		log = new Login();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void test() throws InterruptedException  {
		Thread.sleep(5000);
		mob.NavigatetoMi();
		
	}
	
	@Test
	public void IphonenavigationTest() throws InterruptedException {
		Thread.sleep(5000);
		mob.NavigatetoIphone();
	}
	
	
	@AfterTest
	public void teardown() {
		//driver.quit();
	}
}
