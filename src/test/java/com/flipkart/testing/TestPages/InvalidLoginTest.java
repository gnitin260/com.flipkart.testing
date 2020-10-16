package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Utility.CustomeListner;

@Listeners(CustomeListner.class)
public class InvalidLoginTest extends Basecls {

	
	Login inlog;
	public InvalidLoginTest() {
		super();
	}


	@BeforeMethod
	public void setUp() {
		intialization();
		inlog =new Login();
	}

	@Test (priority = 1)
	public void invalidTest1() throws InterruptedException  {
		driver.navigate().refresh();
		inlog.loginpage(prop.getProperty("invalidusername"),prop.getProperty("invalidpassword"));
		String errormsg= inlog.errormsg();
		Assert.assertEquals(errormsg, "Please enter valid Email ID/Mobile number");
	}
	@Test(priority = 2)
	public void invalidTest2() throws InterruptedException {
		driver.navigate().refresh();
		inlog.loginpage(prop.getProperty("invalidusername"),prop.getProperty("password"));
		String errormsg= inlog.errormsg();
		Assert.assertEquals(errormsg, "Please enter valid Email ID/Mobile number");
	}

	@Test (priority = 3)
	public void invalidTest3() throws InterruptedException {
		driver.navigate().refresh();
		inlog.loginpage(prop.getProperty("username"),prop.getProperty("invalidpassword"));
		String errormsg= inlog.errormsg();
		Assert.assertEquals(errormsg, "Your username or password is incorrect");
	}

	@Test (priority = 4)
	public void invalidTest4() throws InterruptedException {
		driver.navigate().refresh();
		inlog.loginpage(prop.getProperty("invalidusername"),prop.getProperty("blankpassword"));
		String errormsg= inlog.errormsg();
		Assert.assertEquals(errormsg, "Please enter valid Email ID/Mobile number");
	}

	@Test (priority = 5)
	public void invalidTest5() throws InterruptedException {
		driver.navigate().refresh();
		inlog.loginpage(prop.getProperty("blankusername"),prop.getProperty("password"));
		String errormsg= inlog.errormsg();
		Assert.assertEquals(errormsg, "Please enter valid Email ID/Mobile number");
	}

	@Test (priority = 6)
	public void invalidTest6() throws InterruptedException {
		driver.navigate().refresh();
		inlog.loginpage(prop.getProperty("blankusername"),prop.getProperty("blankusername"));
		String errormsgpsd= inlog.errormsg();
		Assert.assertEquals(errormsgpsd, "Please enter valid Email ID/Mobile number");
	}

	
}
