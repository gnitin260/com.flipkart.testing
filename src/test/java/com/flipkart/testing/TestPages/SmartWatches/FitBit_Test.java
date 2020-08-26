package com.flipkart.testing.TestPages.SmartWatches;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Electronics.SmartWatchWearable.SmartWatchs;

public class FitBit_Test extends Basecls{

	Login log;
	Menu menu;
	SmartWatchs smart;
	public FitBit_Test() {
		super();
	}

	@BeforeTest
	public void Setup() throws InterruptedException {
		intialization();
		log= new Login();
		menu= new Menu();
		smart= new SmartWatchs();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetosmartWatch();
		smart.navigatetoFitBit();
	}

	@Test
	public void TitleVerify_Test() {
		System.out.println("Done");
	}
}
