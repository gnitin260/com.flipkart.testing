package com.flipkart.testing.Pages.Electronics.Google_Nest;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Utility.TestUtil;

public class Google_Nest_Mini extends Basecls{


	@FindBy(css = "._30P0WS")
	WebElement pageTitleHead;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[2]/div/div[1]/a/div/img[1]")
	WebElement googleNestminiImg1;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[3]/div/div[1]/a/div/img[1]")
	WebElement googleNestminiFeatureImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[4]/div/div[1]/a/div/img[1]")
	WebElement googleNestGoogleAssistentImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[5]/div/div[1]/a/div/img[1]")
	WebElement googleNestDetailImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[6]/div/a/div/div/img[1]")
	WebElement googleNestGaanaImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[8]/div/div[1]/a/div/img[1]")
	WebElement smartHomeSet_UpKitImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[9]/div/div[1]/a/div/img[1]")
	WebElement smartHomeStarter_KitImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[10]/div/div[1]/a/div/img[1]")
	WebElement googleNestOkGoogleImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[11]/div/div[1]/a/div/img[1]")
	WebElement googleNestMusicPartnerImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[12]/div/div[1]/a/div/img[1]")
	WebElement googleNestDimLightImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[13]/div/div[1]/a/div/img[1]")
	WebElement googleNestControlHomeVoiceImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[14]/div/div[1]/a/div/img[1]")
	WebElement googleNestControlHomeDevicePartnerImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[15]/div/div[1]/a/div/img[1]")
	WebElement googleNestRoomImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[16]/div/div[1]/a/div/img[1]")
	WebElement googleNestRoom2Img;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[17]/div/div[1]/a/div/img[1]")
	WebElement googleNestFindRightHelpImg;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[18]/div/div[1]/a/div/img[1]")
	WebElement googleNestFindRightHelp2Img;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[19]/div/div[1]/span/div/img[1]")
	WebElement googleNestTerm_and_ConditionsImg;

	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[2]/div/div[1]/a")
	WebElement googleNestminiImg1_LINK;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[3]/div/div[1]/a")
	WebElement googleNestminiFeatureImgLink;

	public Google_Nest_Mini(){
		PageFactory.initElements(driver, this);
	}

	public String titltVerify() throws InterruptedException {
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public String PageHeadingVerify() {
		return pageTitleHead.getText();
	}

	public boolean googleNestminiImg1Verify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestminiImg1);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestminiImg1, "googleNestminiImg1ActualActual", "googleNestminiImg1");
		return googleNestminiImg1.isDisplayed();
	}

	public boolean googleNestminiFeatureImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestGoogleAssistentImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestGoogleAssistentImg, "googleNestGoogleAssistentImgActualActual", "googleNestGoogleAssistentImg");
		return googleNestGoogleAssistentImg.isDisplayed();
	}
	public boolean googleNestDetailImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestDetailImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestDetailImg, "googleNestDetailImgActual", "googleNestDetailImg");
		return googleNestDetailImg.isDisplayed();
	}
	public boolean googleNestGaanaImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestGaanaImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestGaanaImg, "googleNestGaanaImgActual", "googleNestGaanaImg");
		return googleNestGaanaImg.isDisplayed();
	}
	public boolean smartHomeSet_UpKitImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(smartHomeSet_UpKitImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(smartHomeSet_UpKitImg, "smartHomeSet_UpKitImgActual", "smartHomeSet_UpKitImg");
		return smartHomeSet_UpKitImg.isDisplayed();
	}
	public boolean smartHomeStarter_KitImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(smartHomeStarter_KitImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(smartHomeStarter_KitImg,"smartHomeStarter_KitImgActual", "smartHomeStarter_KitImg");
		return smartHomeStarter_KitImg.isDisplayed();
	}
	public boolean googleNestOkGoogleImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestOkGoogleImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestOkGoogleImg, "googleNestOkGoogleImgActual", "googleNestOkGoogleImg");
		return googleNestOkGoogleImg.isDisplayed();
	}

	public boolean googleNestMusicPartnerImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestMusicPartnerImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestMusicPartnerImg, "googleNestMusicPartnerImgActual", "googleNestMusicPartnerImg");
		return googleNestMusicPartnerImg.isDisplayed();
	}

	public boolean googleNestDimLightImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestDimLightImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestDimLightImg, "googleNestDimLightImgActual", "googleNestDimLightImg");
		return googleNestDimLightImg.isDisplayed();
	}

	public boolean googleNestControlHomeVoiceImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestControlHomeVoiceImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestControlHomeVoiceImg, "googleNestControlHomeVoiceImgActual", "googleNestControlHomeVoiceImg");
		return googleNestControlHomeVoiceImg.isDisplayed();
	}

	public boolean googleNestControlHomeDevicePartnerImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestControlHomeDevicePartnerImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestControlHomeDevicePartnerImg, "googleNestControlHomeDevicePartnerImgActual", "googleNestControlHomeDevicePartnerImg");
		return googleNestControlHomeDevicePartnerImg.isDisplayed();
	}

	public boolean googleNestRoomImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestRoomImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestRoomImg, "googleNestRoomImgActual", "googleNestRoomImg");
		return googleNestRoomImg.isDisplayed();
	}

	public boolean googleNestRoom2ImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestRoom2Img);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestRoom2Img, "googleNestRoom2ImgActual", "googleNestRoom2Img");
		return googleNestRoom2Img.isDisplayed();
	}

	public boolean googleNestFindRightHelpImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestFindRightHelpImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestFindRightHelpImg, "googleNestFindRightHelpImgActual", "googleNestFindRightHelpImg");
		return googleNestFindRightHelpImg.isDisplayed();
	}

	public boolean googleNestFindRightHelp2ImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestFindRightHelp2Img);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestFindRightHelp2Img, "googleNestFindRightHelp2ImgActual", "googleNestFindRightHelp2Img");
		return googleNestFindRightHelp2Img.isDisplayed();
	}

	public boolean googleNestTerm_and_ConditionsImgVerify() throws IOException, InterruptedException  {
		TestUtil.ScrolltoElement(googleNestTerm_and_ConditionsImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(googleNestTerm_and_ConditionsImg, "googleNestTerm_and_ConditionsImgActual", "googleNestTerm_and_ConditionsImg");
		return googleNestTerm_and_ConditionsImg.isDisplayed();
	}

	public GoogleNestMINI navigatetoGoogleNestMINI() throws InterruptedException {
		//	driver.navigate().refresh();
		Thread.sleep(3000);
		TestUtil.ScrolltoElement(googleNestminiImg1);
		Thread.sleep(2000);
		googleNestminiImg1_LINK.click();
		return new GoogleNestMINI();
	}
	
	public GoogleNestMINI navigatetoGoogleNestMINI_BY_googleNestminiFeatureImgVerify() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();	
		Thread.sleep(3000);
		TestUtil.ScrolltoElement(googleNestminiFeatureImg);
		Thread.sleep(2000);
		googleNestminiFeatureImgLink.click();
		return new GoogleNestMINI();
	}

}

