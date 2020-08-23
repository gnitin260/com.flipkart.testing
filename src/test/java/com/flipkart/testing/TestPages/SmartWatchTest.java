package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Electronics.SmartWatchWearable.SmartWatch;
import com.flipkart.testing.Utility.CustomeListner;

@Listeners(CustomeListner.class)
public class SmartWatchTest extends Basecls {

	Login login;
	Menu menu;
	SmartWatch smart;
	public SmartWatchTest() {
		super();

	}

	@BeforeTest
	public void Setup() throws InterruptedException {
		intialization();
		login= new Login();
		menu= new Menu();
		smart= new SmartWatch();
		login.loginpage(prop.getProperty("username"), (prop.getProperty("password")));
		menu.smartWatch();
	}
	@Test(priority = 1)
	public void titleTest() throws InterruptedException {
		String txt= smart.pageTitleVerification();
		Assert.assertEquals(txt, "Smartwatches Store Online - Buy Smartwatches Online at Best Price in India | Flipkart.com");
	}

	@Test(priority = 2)
	public void PageTest() {
		String txt= smart.PageVerify();
		Assert.assertEquals(txt, "Smartwatches");
	}

	@Test(priority = 3)
	public void AllviewTest() throws InterruptedException {
		String txt= smart.viewallVerify();
		Assert.assertEquals(txt, "Top Rated Wearables - Buy Top Rated Wearables Online at Low Prices In India | Flipkart.com");
	}
	
	@Test(priority = 4)
	public void LowtoHighTest() throws InterruptedException {
		smart.selectionbtn();
		smart.popularVerify();
		
		List<WebElement> amount=driver.findElements(By.className("_2rQ-NK"));

		String[] beforeSort= new String[amount.size()];
		for(int i=0;i<amount.size();i++) {
			beforeSort[i] = amount.get(i).getText().trim();
			
		}
		System.out.println(beforeSort);
		System.out.println("******************");
		Arrays.sort(beforeSort);
		System.out.println(beforeSort);
		
		smart.lowtohighVerify();
		List<WebElement> amount1=driver.findElements(By.className("_2rQ-NK"));
		String[] afterSort= new String[amount1.size()];
		for(int i=0;i<amount1.size();i++) {
			afterSort[i] = amount1.get(i).getText().trim();
		
		}
		
		Assert.assertEquals(afterSort, beforeSort);
		System.out.println("Sorting is done");
		
	}
	
	@Test(priority = 5)
	public void HightoLowTest() throws InterruptedException {
	//	smart.selectionbtn();
		smart.popularVerify();
		Thread.sleep(2000);
		
		List<WebElement> amount=driver.findElements(By.className("_2rQ-NK"));

		String[] beforeSort= new String[amount.size()];
		for(int i=0;i<amount.size();i++) {
			beforeSort[i] = amount.get(i).getText().trim();
		}
		Arrays.sort(beforeSort,Collections.reverseOrder());
		
		smart.hightolowVerrify();
		Thread.sleep(2000);
		List<WebElement> amount1=driver.findElements(By.className("_2rQ-NK"));
		String[] afterSort= new String[amount1.size()];
		for(int i=0;i<amount1.size();i++) {
			afterSort[i] = amount1.get(i).getText().trim();
		}
		
		Assert.assertEquals(afterSort, beforeSort);
		System.out.println("Sorting is done");
		
	}
	

	@AfterTest
	public void tearDown() {
		// driver.quit();
	}

}
