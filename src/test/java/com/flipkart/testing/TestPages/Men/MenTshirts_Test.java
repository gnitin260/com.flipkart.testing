package com.flipkart.testing.TestPages.Men;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Men.Men_Tshirts;

public class MenTshirts_Test extends Basecls{

	Login login;
	Menu menu;
	Men_Tshirts tshirt;

	public MenTshirts_Test() {
		super();
	}

	@BeforeTest
	public void Setup() throws InterruptedException {
		intialization();
		login= new Login();
		menu= new Menu();
		tshirt= new Men_Tshirts();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoMen_Tshirts();
	}

	@Test(priority = 1)
	public void TitleVerify_Test() throws InterruptedException {
		String txt= tshirt.TitleVerify();
		Assert.assertEquals(txt, "T-Shirts (?? ????) - Buy Branded Men's T-shirts Online at Best Prices in India | Flipkart.com");
	}

	@Test(priority = 2)
	public void PageVerify_Test() {
		String txt= tshirt.PageVerify();
		Assert.assertEquals(txt, "Men's T Shirts");
	}

	@Test(priority = 3)
	public void PageDetailVerify_Test() {
		String txt= tshirt.PageDetail_Verify();
		Assert.assertEquals(txt, "We know! One can never say no to more T-shirts. For this very reason, Flipkart has a wide range of T-shirts for men from your preferred brands such as Wrangler, Levi’s, Lee, Tripr, Adidas, and Peter England. So, are you wondering what are the different types of tees you will need in your wardrobe? Well,"+
		" for starters make sure you have a good collection of white-colored and black-colored t-shirts. These go well with almost all types of attires so it’s definitely a winner, all the time! Besides this, you can also opt for a few plain-coloured tees. Some of the in-trend colours are olive green, magenta, red, beige, baby pink, and lavender. The next set of tees that you can have are the colourful printed ones. You will come across abstract prints, floral prints, striped tees, and caricature ones too. You can also pick tees based on the sleeves, which are full-sleeved and half-sleeved ones. Oh, and if you are wondering where all the variety is then you must check out the different T-shirts online on Flipkart at best prices."+
		" You will definitely be in for a plethora of choices to choose from. The information you are reading has been last updated on 29-Aug-20");
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

