package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Cart;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Place_Order;
import com.flipkart.testing.Pages.Electronics.Computer_Accessories.ComputerAcceseries;
import com.flipkart.testing.Pages.Electronics.Computer_Accessories.ExternalHardDisk;
import com.flipkart.testing.Pages.Electronics.Computer_Accessories.Seagate;

public class SeagateTest extends Basecls{

	ExternalHardDisk ehd;
	Login login;
	ComputerAcceseries compas;
	Seagate sgt;
	Cart cart;
	Place_Order placeorder ;

	public SeagateTest() {
		super();

	}

	@BeforeTest
	public void setup() throws InterruptedException {
		intialization();
		sgt= new Seagate();
		ehd= new ExternalHardDisk();
		login= new Login();	
		compas= new ComputerAcceseries();
		cart= new Cart();
		placeorder= new Place_Order();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		compas.Harddisk();
		ehd.seagatePage();

	}

	@Test (priority = 1)
	public void PageTitleTest() throws InterruptedException {
		Thread.sleep(1000);
		String title= sgt.titleVerify();
		AssertJUnit.assertEquals(title, "Hard Disk | Buy 1TB/2TB External/Portable Hard Disk Online at Best Price in India | Flipkart.com");
	}

	@Test(priority = 2)
	public void PageTest() {
		String txt= sgt.pageVerify();
		AssertJUnit.assertEquals(txt, "External Hard Disks");
	}

	@Test(priority = 3)
	public void productSelectionTest() throws InterruptedException {
		sgt.productSelection();
		Thread.sleep(4000);
	}

	@Test(priority = 4)
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
	public void teardown() {
		driver.navigate().refresh();
		//System.out.println("Test Script complete");
		driver.quit();
	}

}
