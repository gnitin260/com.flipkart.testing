package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Electronics.Mobile.Apple;
import com.flipkart.testing.Pages.Electronics.Mobile.IpadPro;
import com.flipkart.testing.Pages.Electronics.Mobile.Mobile;

public class IpadProTest extends Basecls{

	IpadPro ipad;
	Login log;
	Mobile mob;
	Apple apple;
	
	
	public IpadProTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		intialization();
		ipad = new IpadPro();
		log= new Login();
		mob = new Mobile();
		apple= new Apple();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		mob.NavigatetoIphone();
		apple.IpadPro();
	}
	
	@Test(priority = 1)
	public void TitleVerificationTest() {
		String txt= ipad.TitleVerifaction();
		Assert.assertEquals(txt, "");
	}

	@Test(priority = 2)
	public void PageTitleTest() {
		String txt= ipad.PageTitleVerify();
		Assert.assertEquals(txt, "Apple iPad Pro");
	}
	
	@Test (priority = 3)
	public void PageElementTest() {
		boolean flg= ipad.PageElementVerify();
		Assert.assertTrue(flg);
	}
}








