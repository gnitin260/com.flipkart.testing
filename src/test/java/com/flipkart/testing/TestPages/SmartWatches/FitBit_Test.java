package com.flipkart.testing.TestPages.SmartWatches;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Cart;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Place_Order;
import com.flipkart.testing.Pages.Electronics.SmartWatchWearable.FitBit;
import com.flipkart.testing.Pages.Electronics.SmartWatchWearable.SmartWatchs;

public class FitBit_Test extends Basecls{

	Login log;
	Menu menu;
	SmartWatchs smart;
	FitBit fitbit;
	Cart cart;
	Place_Order placeOrder;

	public FitBit_Test() {
		super();
	}

	@BeforeTest
	public void Setup() throws InterruptedException {
		intialization();
		log= new Login();
		menu= new Menu();
		smart= new SmartWatchs();
		fitbit= new FitBit();
		cart= new Cart();
		placeOrder= new Place_Order();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetosmartWatch();
		smart.navigatetoFitBit();
	}

	@Test(priority = 1)
	public void TitleVerify_Test() throws InterruptedException {
		String txt= fitbit.TitleVerify();
		Assert.assertEquals(txt, "All Categories - Buy Products Online at Best Price in India - All Categories | Flipkart.com");
	}

	@Test(priority = 2)
	public void PageVerify_Test() {
		String txt= fitbit.PageVerify();
		Assert.assertEquals(txt, "Smart Watches");
	}

	@Test(priority = 3)
	public void BuyProduct() throws InterruptedException {
		fitbit.ProductSelection_Verify();
		placeOrder.PlaceOrder();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
