package com.flipkart.testing.TestPages.GoogleAssistant;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Electronics.GoogleAssistance.GoogleAssistant;

public class Google_Assistant_Test extends Basecls{

	Login log;
	Menu menu;
	GoogleAssistant googleassis;

	public Google_Assistant_Test() {
		super();
	}

	@BeforeTest
	public void SetUp() throws InterruptedException {
		intialization();
		log= new Login();
		menu= new Menu();
		googleassis= new GoogleAssistant();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoGoogleAssistant();
	}

	@Test(priority = 1)
	public void TitleVerify_Test() throws InterruptedException {
		String txt= googleassis.TitleVerify();
		Assert.assertEquals(txt, "Google Assistant 122019 Store Online - Buy Google Assistant 122019 Online at Best Price in India | Flipkart.com");

	}

	@Test(priority = 2)
	public void PageVerify() throws InterruptedException {
		String txt= googleassis.PageVerify();
		Assert.assertEquals(txt, "Google Assistant");

	}

	@Test(priority = 3)
	public void googleAssistantImg_Verify_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleAssistantImg_Verify();
		Assert.assertTrue(flg);
	}

	@Test(priority = 4)
	public void googleAssistant_DeviceImg_Verify_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleAssistant_DeviceImg_Verify();
		Assert.assertTrue(flg);
	}
	
	@Test(priority = 5)
	public void googleLanguageImg_Verify_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleLanguageImg_Verify();
		Assert.assertTrue(flg);
	}
	
	@Test(priority = 6)
	public void googleLanguageImg2_Verify_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleLanguageImg2_Verify();
		Assert.assertTrue(flg);
	}
	
	@Test(priority = 7)
	public void googleAssistant_SmartPhoneImg_Verify_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleAssistant_SmartPhoneImg_Verify();
		Assert.assertTrue(flg);
	}
	
	@Test(priority = 8)
	public void googleAssistant_SmartPhoneImg2_Verify_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleAssistant_SmartPhoneImg2_Verify();
		Assert.assertTrue(flg);
	}
	
	
	@Test(priority = 9)
	public void googleAssistant_SmartPhoneImg3_Verify_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleAssistant_SmartPhoneImg3_Verify();
		Assert.assertTrue(flg);
	}
	
	@Test(priority = 10)
	public void googleAssistanta_SmartTV_Verify_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleAssistanta_SmartTV_Verify();
		Assert.assertTrue(flg);
	}
	
	@Test(priority = 11)
	public void googleAssistanta_SmartTV2_Verify_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleAssistanta_SmartTV2_Verify();
		Assert.assertTrue(flg);
	}	
	
	@Test(priority = 12)
	public void googleAssistant_Term_ConditonsImg_Verify_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleAssistant_Term_ConditonsImg_Verify();
		Assert.assertTrue(flg);
	}	
	
	@Test(priority = 13)
	public void googleAssistant_Term_ConditonsImg2_Test() throws IOException, InterruptedException {
		boolean flg= googleassis.googleAssistant_Term_ConditonsImg2_Verify();
		Assert.assertTrue(flg);
	}	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
