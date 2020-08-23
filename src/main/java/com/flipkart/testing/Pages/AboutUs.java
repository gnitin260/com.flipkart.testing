package com.flipkart.testing.Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Utility.TestUtil;

public class AboutUs extends Basecls{

	JavascriptExecutor js=(JavascriptExecutor) driver;

	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div/div[1]")
	WebElement flipkartStoryImg;

	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div/div[2]/img")
	WebElement launchDetailImg;

	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div/div[3]/img")

	WebElement objimg;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[4]/img")
	WebElement startby2img;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[5]/img")
	WebElement detailImg;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[6]/img")
	WebElement growthImg;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[7]/img")
	WebElement globalImg;

	@FindBy (xpath = "/html/body/div[1]/div/footer/div/div[2]/div[1]/div[5]/div")
	WebElement mailUsdetail;


	public AboutUs() {
		PageFactory.initElements(driver, this);
	}

	public String aboutUsTitle()
	{
		return driver.getTitle();
	}

	public boolean flipkartStroyimg() throws IOException, InterruptedException {
	//	js.executeScript("arguments[0].scrollIntoView();", flipkartStoryImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(flipkartStoryImg, "flipkartStory_ImageActual", "flipkartStory_Image");
		return flipkartStoryImg.isDisplayed();
	}
	

	public boolean launchDetailimg() throws IOException, InterruptedException {
	//	js.executeScript("arguments[0].scrollIntoView();", launchDetailImg);
		TestUtil.TakeScreenShot(launchDetailImg, "launchDetail_ImageActual", "launchDetail_Image");
		return launchDetailImg.isDisplayed();
	}
	
	
	public boolean objImg() throws IOException, InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", launchDetailImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(objimg,"obj_ImageActual", "obj_Image");
		return objimg.isDisplayed();
	}
	
	
	public boolean startby2Img() throws IOException, InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", objimg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(startby2img,"startby2_ImageActual", "startby2_Image");
		return startby2img.isDisplayed();
	}

	public boolean detailimg() throws IOException, InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", startby2img);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(detailImg,"detail_ImageActual", "detail_Image");
		return detailImg.isDisplayed();
	}
	public boolean growthimg() throws IOException, InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", growthImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(growthImg,"growth_ImageActual", "growth_Image");
		return growthImg.isDisplayed();
	}

	public boolean globalimg() throws IOException, InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", globalImg);
		Thread.sleep(1000);
		TestUtil.TakeScreenShot(globalImg,"global_ImageActual", "global_Image");
		return globalImg.isDisplayed();
	}

	public String mailUsdetailvalidation() {
		return mailUsdetail.getText();
	}



}
