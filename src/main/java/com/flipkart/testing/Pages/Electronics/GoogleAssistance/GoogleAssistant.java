package com.flipkart.testing.Pages.Electronics.GoogleAssistance;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Utility.TestUtil;

public class GoogleAssistant extends Basecls{

	@FindBy(xpath = "/html/body/div/div/div[3]/div[2]/h1")
	WebElement pageHeading;

	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[1]/div/div[1]/span/div/img[1]")
	WebElement googleAssistantImg;

	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[2]/div/div[1]/span/div/img[1]")
	WebElement googleAssistant_DeviceImg;

	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[3]/div/div[1]/span/div/img[1]")
	WebElement googleLanguageImg;

	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[4]/div/div[1]/span/div/img[1]")
	WebElement googleLanguageImg2;

	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[5]/div/div[1]/span/div/img[1]")
	WebElement googleAssistant_SmartPhoneImg;

	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[6]/div/div[1]/a/div/img[1]")
	WebElement googleAssistant_SmartPhoneImg2;

	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[7]/div/div[1]/a/div/img[1]")
	WebElement googleAssistant_SmartPhoneImg3;
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[8]/div/div[1]/a/div/img[1]")
	WebElement googleAssistanta_SmartTV;
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[8]/div/div[1]/a/div/img[1]")
	WebElement googleAssistanta_SmartTV2;
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[11]/div/div[1]/span/div/img[1]")
	WebElement googleAssistant_Term_ConditonsImg;
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[11]/div/div[1]/span/div/img[1]")
	WebElement googleAssistant_Term_ConditonsImg2;
	
	public GoogleAssistant() {
		PageFactory.initElements(driver, this);
	}

	public String TitleVerify() throws InterruptedException {
		Thread.sleep(5000);
		return driver.getTitle();
	}

	public String PageVerify() {
		return pageHeading.getText();
	}
	public boolean googleAssistantImg_Verify() throws IOException, InterruptedException{
		TestUtil.TakeScreenShot(googleAssistantImg, "googleAssistantImgActual", "googleAssistantImg");
		return googleAssistantImg.isDisplayed();
	}

	public boolean googleAssistant_DeviceImg_Verify() throws IOException, InterruptedException{
		TestUtil.TakeScreenShot(googleAssistant_DeviceImg, "googleAssistant_DeviceImgActual", "googleAssistant_DeviceImg");
		return googleAssistant_DeviceImg.isDisplayed();
	}

	public boolean googleLanguageImg_Verify() throws IOException, InterruptedException{
		TestUtil.TakeScreenShot(googleLanguageImg, "googleLanguageImgActual", "googleLanguageImg");
		return googleLanguageImg.isDisplayed();
	}

	public boolean googleLanguageImg2_Verify() throws IOException, InterruptedException{
		TestUtil.TakeScreenShot(googleLanguageImg2, "googleLanguageImg2Actual", "googleLanguageImg2");
		return googleLanguageImg2.isDisplayed();
	}

	public boolean googleAssistant_SmartPhoneImg_Verify() throws IOException, InterruptedException{
	TestUtil.ScrolltoElement(googleAssistant_SmartPhoneImg);
		TestUtil.TakeScreenShot(googleAssistant_SmartPhoneImg, "googleAssistant_SmartPhoneImgActual", "googleAssistant_SmartPhoneImg");
		return googleAssistant_SmartPhoneImg.isDisplayed();
	}

	public boolean googleAssistant_SmartPhoneImg2_Verify() throws IOException, InterruptedException{
		TestUtil.ScrolltoElement(googleAssistant_SmartPhoneImg2);
		Thread.sleep(2000);
		TestUtil.TakeScreenShot(googleAssistant_SmartPhoneImg2, "googleAssistant_SmartPhoneImg2Actual", "googleAssistant_SmartPhoneImg2");
		return googleAssistant_SmartPhoneImg2.isDisplayed();
	}

	public boolean googleAssistant_SmartPhoneImg3_Verify() throws IOException, InterruptedException{
		TestUtil.ScrolltoElement(googleAssistant_SmartPhoneImg3);
		TestUtil.TakeScreenShot(googleAssistant_SmartPhoneImg3, "googleAssistant_SmartPhoneImg3Actual", "googleAssistant_SmartPhoneImg3");
		return googleAssistant_SmartPhoneImg3.isDisplayed();
	}
	
	public boolean googleAssistanta_SmartTV_Verify() throws IOException, InterruptedException{
		TestUtil.ScrolltoElement(googleAssistanta_SmartTV);
		TestUtil.TakeScreenShot(googleAssistanta_SmartTV, "googleAssistanta_SmartTVActual", "googleAssistanta_SmartTV");
		return googleAssistanta_SmartTV.isDisplayed();
	}
	
	public boolean googleAssistanta_SmartTV2_Verify() throws IOException, InterruptedException{
		TestUtil.ScrolltoElement(googleAssistanta_SmartTV);
		TestUtil.TakeScreenShot(googleAssistanta_SmartTV, "googleAssistanta_SmartTVActual", "googleAssistanta_SmartTV");
		return googleAssistanta_SmartTV.isDisplayed();
	}
	
	public boolean googleAssistant_Term_ConditonsImg_Verify() throws IOException, InterruptedException{
		TestUtil.ScrolltoElement(googleAssistant_Term_ConditonsImg);
		TestUtil.TakeScreenShot(googleAssistant_Term_ConditonsImg, "googleAssistant_Term_ConditonsImgActual", "googleAssistant_Term_ConditonsImg");
		return googleAssistant_Term_ConditonsImg.isDisplayed();
	}
	
	public boolean googleAssistant_Term_ConditonsImg2_Verify() throws IOException, InterruptedException{
		TestUtil.ScrolltoElement(googleAssistant_Term_ConditonsImg2);
		TestUtil.TakeScreenShot(googleAssistant_Term_ConditonsImg2, "googleAssistant_Term_ConditonsImg2Actual", "googleAssistant_Term_ConditonsImg2");
		return googleAssistant_Term_ConditonsImg2.isDisplayed();
	}
}
