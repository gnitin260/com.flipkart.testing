package com.flipkart.testing.TestPages.Men.Tshirts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Place_Order;
import com.flipkart.testing.Pages.Men.Men_Tshirts;
import com.flipkart.testing.Pages.Men.Wrangler;

public class Wrangler_TshirtTest extends Basecls{

	Login login;
	Menu menu;
	Men_Tshirts tshirt;
	Wrangler wrangler;
	Place_Order placeOrder;

	public Wrangler_TshirtTest() {
		super();

	}

	@BeforeTest
	public void SetUp() throws InterruptedException {
		intialization();
		login= new Login();
		menu= new Menu();
		tshirt= new Men_Tshirts();
		placeOrder= new Place_Order();
		wrangler= new Wrangler();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoMen_Tshirts();
		tshirt.navigatetoWrangler();
	}

	@Test(priority = 1)
	public void DetailVerify_Test() {
		String txt= wrangler.DetailVerify();
		Assert.assertEquals(txt, "We know! One can never say no to more T-shirts. For this very reason, Flipkart has a wide range of T-shirts for men "+""
				+ "from your preferred brands such as Wrangler, Levi’s, Lee, Tripr, Adidas, and Peter England. So, are you wondering what are the different "+""
				+ "types of tees you will need in your wardrobe? Well, for starters make sure you have a good collection of white-colored and black-colored t-shirts. These go well with almost all types of attires so it’s definitely a winner, all the time! Besides this, you can also opt for a few plain-coloured tees. Some of the in-trend colours are olive green, magenta, red, beige, baby pink, and lavender. The next set of tees that you can have are the colourful printed ones. You will come across abstract prints, floral prints, striped tees, and caricature ones too. You can also pick tees based on the sleeves, which are full-sleeved and half-sleeved ones. Oh, and if you are wondering where all the variety is then you must check out the different T-shirts online on Flipkart at best prices. You will definitely be in for a plethora of choices to choose from. The information you are reading has been last updated on 30-Aug-20");
	}

	@Test(priority = 2)
	public void pageDetailVerify() {
		String txt= wrangler.pageDetail();
		Assert.assertEquals(txt, "Men's T Shirts");
	}

	@Test(priority = 3)
	public void BrandVerify_Test() throws InterruptedException {
		wrangler.BrandVerify("Wrangler");
	}

	@Test(priority = 4)
	public void BuyProduct() throws InterruptedException {
		wrangler.ProductSelectionVerify();
		placeOrder.PlaceOrderClothing();
	}

	@Test(priority = 5)
	public void Levi_sSelectionTest() throws InterruptedException {
		wrangler.BrandSelection("Levi's");	
	}

	@Test(priority = 6)
	public void Levi_sBrandVerify_Test() throws InterruptedException {
		wrangler.BrandVerify("Levi's");
	}

	@Test(priority = 7)
	public void BuyLevi_s() throws InterruptedException {
		wrangler.ProductSelectionVerify();
		placeOrder.PlaceOrderClothing();
	}
	@Test(priority = 8)
	public void LevisSelectionTest() throws InterruptedException {
		wrangler.BrandSelection("Levis");	
	}

	@Test(priority = 9)
	public void LevisBrandVerify_Test() throws InterruptedException {
		wrangler.BrandVerify("Levis");
	}

	@Test(priority = 10)
	public void BuyLevis() throws InterruptedException {
		wrangler.ProductSelectionVerify();
		placeOrder.PlaceOrderClothing();
	}
	@Test(priority = 11)
	public void MuftiSelectionTest() throws InterruptedException {
		wrangler.BrandSelection("Mufti");	
	}

	@Test(priority = 12)
	public void MuftiBrandVerify_Test() throws InterruptedException {
		wrangler.BrandVerify("Mufti");
	}

	@Test(priority = 13)
	public void BuyMufti() throws InterruptedException {
		wrangler.ProductSelectionVerify();
		placeOrder.PlaceOrderClothing();
	}
	@Test(priority = 14)
	public void LeeSelectionTest() throws InterruptedException {
		wrangler.BrandSelection("Lee");	
	}

	@Test(priority = 15)
	public void LeeBrandVerify_Test() throws InterruptedException {
		wrangler.BrandVerify("Lee");
	}

	@Test(priority = 16)
	public void BuyLee() throws InterruptedException {
		wrangler.ProductSelectionVerify();
		placeOrder.PlaceOrderClothing();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
