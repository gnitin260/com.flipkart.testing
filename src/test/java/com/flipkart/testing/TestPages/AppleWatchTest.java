package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Cart;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Place_Order;
import com.flipkart.testing.Pages.Electronics.Mobile.Apple;
import com.flipkart.testing.Pages.Electronics.Mobile.AppleWatch;
import com.flipkart.testing.Pages.Electronics.Mobile.Mobile;

public class AppleWatchTest extends Basecls{

	Login login;
	Mobile mob;
	Apple iphone;
	AppleWatch aw;
	Place_Order placeorder;
	Cart cart;

	public AppleWatchTest() {
		super();
	}

	
	@BeforeTest
	public void setUp() throws InterruptedException {
		intialization();
		login =new Login();	
		mob=new Mobile();
		iphone=new Apple();	
		aw = new AppleWatch();
		cart =new Cart();
		placeorder =new Place_Order();
		login.loginpage(prop.getProperty("username"), (prop.getProperty("password")));
		mob.NavigatetoIphone();
		Thread.sleep(2000);
		iphone.AppleWatch();

	}

	@Test(priority = 1)
	public void titleTest() throws InterruptedException {
		String title= aw.titleVerify();
		Thread.sleep(1000);
		Assert.assertEquals(title, "Apple Products Store Online - Buy Apple Products Online at Best Price in India | Flipkart.com");
	}

	@Test(priority = 2)
	public void pageVerifyTest() throws InterruptedException {
		Thread.sleep(1000);
		String txt = aw.PageVerify();
		Assert.assertEquals(txt, "Apple Watch Series 4 Smart Watches");
	}

	//	@Test(priority = 3)
	//	public void clearfilterTest() {
	//		if(aw.ClearBtn()) {
	//			aw.ClearallBtn();
	//		}
	//		else {
	//			System.out.println("Item not avillable");
	//		}
	//		
	//	}

	@Test(priority = 6)
	public void populartyfilterTest() throws InterruptedException {
		Thread.sleep(2000);
		String txt2=aw.populartyFilter();
		Thread.sleep(2000);
		Assert.assertEquals(txt2, "Apple Watch Series 4 GPS + Cellular, 44 mm Gold Aluminium Case with Pink Sand Sport Loop");
	}

	@Test(priority = 4)
	public void high_lowfilterTest() throws InterruptedException {
		Thread.sleep(1000);
		String txt1=aw.high_lowFilter();
		Thread.sleep(2000);
		Assert.assertEquals(txt1, "Apple Watch Series 4 GPS + Cellular, 44 mm Gold Aluminium Case with Pink Sand Sport Loop");
	}

	@Test(priority = 5)
	public void low_highfilterTest() throws InterruptedException {
		Thread.sleep(2000);
		String txt=aw.low_highFilter();
		Thread.sleep(2000);
		Assert.assertEquals(txt, "Apple Watch Series 4 GPS, 40 mm Space Grey Aluminium Case with Black Sport Band");
	}

	@Test(priority = 7)
	public void placeorder() throws InterruptedException {
		aw.productselection();
		Thread.sleep(4000);
	}

	@Test(priority = 8)
	public void addtoCartTest() throws InterruptedException {
		String mainWindow=driver.getWindowHandle();
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set =driver.getWindowHandles();
		// Using Iterator to iterate with in windows
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();
			// Compare whether the main windows is not equal to child window. If not equal, we will close.
			if(!mainWindow.equals(childWindow)){
				driver.switchTo().window(childWindow);
				cart.gotocartBtn() ;
				Thread.sleep(4000);
				cart.placeOrder();
				placeorder.placeorderVerify();
				driver.close();
				driver.switchTo().window(mainWindow);
			}
		}
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		driver.navigate().refresh();
		driver.quit();
		
	}


}
