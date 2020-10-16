package com.flipkart.testing.TestPages.AC;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.AC.AC;
import com.flipkart.testing.Pages.AC.LG_AC;

public class LG_AC_Test extends Basecls{

	Login login;
	Menu menu;
	LG_AC lg;
	AC ac;

	public LG_AC_Test() {
		super();
	}

	@BeforeTest
	public void SetUp() throws InterruptedException {
		intialization();
		login= new Login();
		menu= new Menu();
		lg= new LG_AC();
		ac=new AC();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoAC();
		ac.navigatetoLG_AC();
	}

	@Test(priority = 1)
	public void PagetVerify_Test()  throws InterruptedException{
		String txt= lg.PageVerify();
		Assert.assertEquals(txt, "Air Conditioners");

	}

	@Test(priority = 2)
	public void TitleVerify_Test() {
		String txt=lg.TitleVerify();
		Assert.assertEquals(txt, "All Categories - Buy Products Online "+""
				+ "at Best Price in India - All Categories | Flipkart.com");
	}

	@Test(priority = 3)
	public void AmountVerify_Test() throws InterruptedException {
		lg.AllAmountVerify();
	}

	@Test(priority = 4)
	public void DiscountVerify_Test() throws InterruptedException  {
		lg.AllDiscountVerify();
		lg.discountBtn();
		lg.DiscountVerify();
	}

	@Test(priority = 5)
	public void WindowLG_AC_Test() throws InterruptedException {
		lg.WindowDiscount_Verify();
		lg.DiscountAmountVerify();
	}


	@AfterTest
	public void Teardown() throws InterruptedException {
		Thread.sleep(5000);
		//	driver.quit();

	}
}
