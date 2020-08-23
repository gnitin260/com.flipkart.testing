package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Electronics.Computer_Accessories.ComputerAcceseries;
import com.flipkart.testing.Pages.Electronics.Computer_Accessories.ExternalHardDisk;

public class HardDiskTest extends Basecls{

	ExternalHardDisk ehd;
	Login login;
	ComputerAcceseries compas;
	
	public HardDiskTest() {
		super();
	}
	
	@BeforeTest
	public void setup() throws InterruptedException {
		intialization();
		ehd= new ExternalHardDisk();
		login= new Login();	
		compas= new ComputerAcceseries();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		compas.Harddisk();
	}
	
	@Test (priority = 1)
	public void PageTitleVerificationTest() throws InterruptedException {
		Thread.sleep(7000);
		String title= ehd.titleVerification();
		Assert.assertEquals(title, "External Hard Disks - Buy External Hard Disks and SSDs Online at Best Prices | Flipkart.com");
	
	}
	
	@Test (priority = 2)
	public void PageVerifyTest() throws InterruptedException {
		String pageHeading= ehd.pageVerify();
		Thread.sleep(2000);
		Assert.assertEquals(pageHeading, "External Hard Disks and SSDs");
	}
	
	@Test (priority = 3)
	public void WDTest() {
		
	}
	
	
	@AfterTest
	public void teardown() {
	//	driver.quit();
	}
	
}
