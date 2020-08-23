package com.flipkart.testing.TestPages.GoogleNestMini;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Cart;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Place_Order;
import com.flipkart.testing.Pages.Electronics.Google_Nest.GoogleNestMINI;
import com.flipkart.testing.Pages.Electronics.Google_Nest.Google_Nest_Mini;
import com.flipkart.testing.Utility.CustomeListner;
@Listeners(CustomeListner.class)

public class GoogleNestMINIProductTest extends Basecls{

	GoogleNestMINI mini;
	Login log;
	Menu menu;
	Google_Nest_Mini nest;
	Cart cart;
	Place_Order placeorder;

	public GoogleNestMINIProductTest() {
		super();
	}

	@BeforeTest
	public void Setup() throws InterruptedException {
		intialization();
		log= new Login();
		menu= new Menu();
		nest= new Google_Nest_Mini();
		mini = new GoogleNestMINI();
		cart= new Cart();
		placeorder= new Place_Order();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoGoogleNestMini();
		
	}

	@Test(priority = 1)
	public void TitleVerifyTest() throws InterruptedException  {
		nest.navigatetoGoogleNestMINI();
		String txt= mini.TitleVerify();
		Assert.assertEquals(txt, "Google Nest Mini (2nd Gen) Price in India - Buy Google Nest Mini (2nd Gen) online at Flipkart.com");
	}


	@Test(priority = 2)
	public void pageVerify() throws InterruptedException {

		String txt=mini.GoogleNestMiniHeadingVerify();
		Assert.assertEquals(txt, "Google Nest Mini (2nd Gen)  (Chalk)");
		
	}

	@Test(priority = 3)
	public void ColorSelectionTest() throws InterruptedException {
		String txt= mini.ColorSelectionVerify();
		Assert.assertEquals(txt, "Google Nest Mini (2nd Gen)  (Charcoal)");
		driver.navigate().back();
	}
	
	@Test(priority = 4)
	public void googleNestminiFeatureImgProductVerifyTest() throws InterruptedException {
		nest.navigatetoGoogleNestMINI_BY_googleNestminiFeatureImgVerify();
		String txt= mini.TitleVerify();
		Assert.assertEquals(txt, "Google Nest Mini (2nd Gen) Price in India - Buy Google Nest Mini (2nd Gen) online at Flipkart.com");
	}
	@Test(priority = 5)
	public void pageVerifygoogleNestminiFeatureImgProductVerifyTest() throws InterruptedException {

		String txt=mini.GoogleNestMiniHeadingVerify();
		Assert.assertEquals(txt, "Google Nest Mini (2nd Gen)  (Chalk)");
		
	}
	
	@Test(priority = 6)
	public void ColorSelectiongoogleNestminiFeatureImgProductVerifyTest() throws InterruptedException {
		String txt= mini.ColorSelectionVerify();
		Assert.assertEquals(txt, "Google Nest Mini (2nd Gen)  (Charcoal)");
	
	}
	@Test(priority = 7)
	public void BuyProduct_googleNestminiVerifyTest() throws InterruptedException {
		Thread.sleep(2000);
		cart.placeOrder();
		Thread.sleep(2000);
		placeorder.placeorderVerify();
	
	}


	@AfterTest
	public void tearDown() {
		//	driver.quit();
	}

}

