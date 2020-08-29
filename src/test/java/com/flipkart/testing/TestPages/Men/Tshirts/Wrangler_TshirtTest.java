package com.flipkart.testing.TestPages.Men.Tshirts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Men.Men_Tshirts;
import com.flipkart.testing.Pages.Men.Wrangler;

public class Wrangler_TshirtTest extends Basecls{

	Login login;
	Menu menu;
	Men_Tshirts tshirt;
	Wrangler wrangler;
	
	
	public Wrangler_TshirtTest() {
		super();
		
	}
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		intialization();
		login= new Login();
		menu= new Menu();
		tshirt= new Men_Tshirts();
		wrangler= new Wrangler();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoMen_Tshirts();
		tshirt.navigatetoWrangler();
	}
	
	
	@Test
	public void BrandVerify_Test() throws InterruptedException {
		wrangler.BrandVerify();
	}
}
