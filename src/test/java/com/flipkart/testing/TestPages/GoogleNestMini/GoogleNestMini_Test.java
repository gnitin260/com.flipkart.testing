package com.flipkart.testing.TestPages.GoogleNestMini;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Menu;
import com.flipkart.testing.Pages.Electronics.Google_Nest.Google_Nest_Mini;
import com.flipkart.testing.Utility.CustomeListner;

@Listeners(CustomeListner.class)
public class GoogleNestMini_Test extends Basecls{

	Login log;
	Menu menu;
	Google_Nest_Mini nest;

	public GoogleNestMini_Test() {
		super();
	}

	@BeforeTest
	public void Setup() throws InterruptedException {
		intialization();
		log= new Login();
		menu= new Menu();
		nest= new Google_Nest_Mini();
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		menu.navigatetoGoogleNestMini();

	}

	@Test(priority = 1)
	public void TitleVerify_Test() throws InterruptedException {
		String txt= nest.titltVerify();

		Assert.assertEquals(txt, "Google Nest Mini Store Online - Buy Google Nest Mini Online at Best Price in India | Flipkart.com");
	}

	@Test(priority = 2)
	public void PageVeifyTest() {
		String txt= nest.PageHeadingVerify();
		Assert.assertEquals(txt, "Google Nest Mini");
	}

	@Test(priority = 3)
	public void googleNestminiImg1VerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestminiImg1Verify();
		Assert.assertTrue(flg);

	}

	@Test(priority = 4)
	public void googleNestminiFeatureImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestminiFeatureImgVerify();
		Assert.assertTrue(flg);

	}

	@Test(priority = 5)

	public void googleNestDetailImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestDetailImgVerify();
		Assert.assertTrue(flg);

	}

	@Test(priority = 6)

	public void googleNestGaanaImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestGaanaImgVerify();
		Assert.assertTrue(flg);

	}

	@Test(priority = 7)

	public void smartHomeSet_UpKitImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.smartHomeSet_UpKitImgVerify();
		Assert.assertTrue(flg);

	}
	
	@Test(priority = 8)

	public void smartHomeStarter_KitImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.smartHomeStarter_KitImgVerify();
		Assert.assertTrue(flg);

	}

	@Test(priority = 9)

	public void googleNestOkGoogleImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestOkGoogleImgVerify();
		Assert.assertTrue(flg);

	}
	
	@Test(priority = 10)

	public void googleNestMusicPartnerImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestMusicPartnerImgVerify();
		Assert.assertTrue(flg);

	}
	
	@Test(priority = 11)

	public void googleNestDimLightImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestDimLightImgVerify();
		Assert.assertTrue(flg);

	}
	
	
	@Test(priority = 12)

	public void googleNestControlHomeVoiceImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestControlHomeVoiceImgVerify();
		Assert.assertTrue(flg);

	}
	
	
	@Test(priority = 13)

	public void googleNestControlHomeDevicePartnerImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestControlHomeDevicePartnerImgVerify();
		Assert.assertTrue(flg);

	}
	
	@Test(priority = 14)

	public void googleNestRoomImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestRoomImgVerify();
		Assert.assertTrue(flg);

	}
	
	@Test(priority = 15)

	public void googleNestRoom2ImgVerifyTest() throws IOException, InterruptedException {
		boolean flg= nest.googleNestRoom2ImgVerify();
		Assert.assertTrue(flg);

	}
	
	@Test(priority = 16)

	public void googleNestFindRightHelpImgVerify() throws IOException, InterruptedException {
		boolean flg= nest.googleNestFindRightHelpImgVerify();
		Assert.assertTrue(flg);

	}
	
	
	@Test(priority = 17)

	public void googleNestFindRightHelp2ImgVerify() throws IOException, InterruptedException {
		boolean flg= nest.googleNestFindRightHelp2ImgVerify();
		Assert.assertTrue(flg);

	}
	
	@Test(priority = 18)

	public void googleNestTerm_and_ConditionsImgVerify() throws IOException, InterruptedException {
		boolean flg= nest.googleNestTerm_and_ConditionsImgVerify();
		Assert.assertTrue(flg);

	}



	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
