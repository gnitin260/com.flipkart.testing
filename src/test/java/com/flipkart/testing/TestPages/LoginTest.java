package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;

public class LoginTest extends Basecls {

	Login log;
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		log= new Login();
		
	}
	@Test
	public void loginTest() throws InterruptedException {
		log.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
}
