package com.flipkart.testing.TestPages.Women.WesternMaterilTest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Place_Order;
import com.flipkart.testing.Pages.Women.WesternMaterial.Dresses;
import com.flipkart.testing.Utility.CustomeListner;
@Listeners(CustomeListner.class)

public class DressesTest extends Basecls {

	Login login;
	Menu menu;
	Dresses dress;
	Place_Order placeOrder;

	public DressesTest() {
		super();
	}

	@BeforeTest
	public void SetUp() throws InterruptedException {
		intialization();
		login= new Login();
		menu= new Menu();
		placeOrder=new Place_Order();
		dress= new Dresses();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoWomen_Dressess();

	}

	@Test(priority = 1)
	public void TitleVerify_Test() throws InterruptedException {
		String txt= dress .TitleVerify();
		Assert.assertEquals(txt, "Dresses Online (???????) - Buy Stylish Dresses For Women Online on Sale | Party Wear & Western Dresses - Flipkart");
	}

	@Test(priority = 2)
	public void PageVerify_Test() {
		String txt=dress.PageVerify();
		Assert.assertEquals(txt, "Women's Dresses");
	}
	@Test(priority = 3)
	public void DetailVerify_Test() {
		String txt= dress.detailVerify();
		Assert.assertEquals(txt, "Dresses are a girl’s best friend, you would agree with us. Are you wondering what you're going to wear for a weekend date night or a cocktail party? Be ready to make"+""
				+ " heads turn for all the right reasons by buying stylish dresses from your favorite online shopping site Flipkart. These clothes not only make you look stylish, chic, and sophisticated but they are also easy and comfortable to wear. Buy the best dresses online"+""
				+ " for women and sway your way through parties and date nights. You can buy these trendy western dresses in several types, like maxi dresses, sheaths, bodycons, blousons, floral, skater, cocktail, gowns & party dresses among other figure-flattering designs. Flaunt these"+""
						+ " stylish and trendy women’s wear for upcoming events and look effortlessly stylish wherever you go. So, buy women's dresses from big brands including Vero Moda, Tokyo Talkies, Harpa  and Eavan. The information you are reading has been last updated on 01-Sep-20.");
	}
	@Test(priority = 4)
	public void BrandVerify_Test() throws InterruptedException {
		dress.BrandSelection_Ist("W");
		dress.BrandSelection("W");	
		dress.BrandVerify("W");
	}

	@Test(priority = 4)
	public void BuyProduct() throws InterruptedException {
		dress.ProductSelectionVerify();
		placeOrder.PlaceOrderClothing();
	}

	@Test(priority = 5)
	public void Levi_sSelectionTest() throws InterruptedException {
		dress.BrandSelection("Levi's");	
	}

	@Test(priority = 6)
	public void Levi_sBrandVerify_Test() throws InterruptedException {
		dress.BrandVerify("Levi's");
	}

	@Test(priority = 7)
	public void BuyLevi_s() throws InterruptedException {
		dress.ProductSelectionVerify();
		placeOrder.PlaceOrderClothing();
	}
	@Test(priority = 8)
	public void LevisSelectionTest() throws InterruptedException {
		dress.BrandSelection("Levis");	
	}

	@Test(priority = 9)
	public void LevisBrandVerify_Test() throws InterruptedException {
		dress.BrandVerify("Levis");
	}

	@Test(priority = 10)
	public void BuyLevis() throws InterruptedException {
		dress.ProductSelectionVerify();
		placeOrder.PlaceOrderClothing();
	}
	@Test(priority = 11)
	public void LibasSelectionTest() throws InterruptedException {
		dress.BrandSelection("Libas");	
	}

	@Test(priority = 12)
	public void LibasBrandVerify_Test() throws InterruptedException {
		dress.BrandVerify("Libas");
	}

	@Test(priority = 13)
	public void BuyLibas() throws InterruptedException {
		dress.ProductSelectionVerify();
		placeOrder.PlaceOrderClothing();
	}
	@Test(priority = 14)
	public void LeeSelectionTest() throws InterruptedException {
		dress.BrandSelection("Lee");	
	}

	@Test(priority = 15)
	public void LeeBrandVerify_Test() throws InterruptedException {
		dress.BrandVerify("Lee");
	}

	@Test(priority = 16)
	public void BuyLee() throws InterruptedException {
		dress.ProductSelectionVerify();
		placeOrder.PlaceOrderClothing();
	}
}
