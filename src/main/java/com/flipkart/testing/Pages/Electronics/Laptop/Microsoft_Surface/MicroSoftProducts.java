package com.flipkart.testing.Pages.Electronics.Laptop.Microsoft_Surface;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Utility.TestUtil;

public class MicroSoftProducts extends Basecls{

	@FindBy(xpath = "/html/body/div/div/div[3]/div[2]")
	WebElement pageHeading;
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[1]/div/div[1]/div/div/a/div/img[1]")
	WebElement Surface7ProImg;
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/a/div/img[1]")
	WebElement AllSurfaceImg;
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[1]/div/div[2]/div[2]/div/a/div/img[1]")
	WebElement Surface7ProImg2;
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[3]/div/div/div/img[1]")
	WebElement ServicesMicrosoftImg;
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div[4]/div/div/div/img[1]")
	WebElement AboutMicroSoftImg;
	
	public MicroSoftProducts() {
		PageFactory.initElements(driver, this);
	}
	
	public String TitleVerify() throws InterruptedException {
		Thread.sleep(5000);
	return driver.getTitle();
	}
	
	public String PageVerify() {
		return pageHeading.getText();
	}
	public boolean SurfacePro7ImgVerify() throws IOException, InterruptedException {
		TestUtil.TakeScreenShot(Surface7ProImg,"SurfacePro7Actual", "SurfacePro7");
		return Surface7ProImg.isDisplayed();
	}
	public boolean AllSurfaceImgVerify() throws IOException, InterruptedException {
		TestUtil.TakeScreenShot(AllSurfaceImg,"AllSurfaceActual", "AllSurface");
		return AllSurfaceImg.isDisplayed();
	}
	
	public boolean Surface7ProImg2Verify() throws IOException, InterruptedException {
		TestUtil.TakeScreenShot(Surface7ProImg2,"Surface7ProActual", "Surface7Pro");
		return Surface7ProImg.isDisplayed();
	}
	
	public boolean ServicesMicrosoftImgVerify() throws IOException, InterruptedException {
		TestUtil.ScrolltoElement(ServicesMicrosoftImg);
		TestUtil.TakeScreenShot(ServicesMicrosoftImg,"ServicesMicrosoftActual", "ServicesMicrosoft");
		return ServicesMicrosoftImg.isDisplayed();
	}
	public boolean AboutMicroSoftImgVerify() throws IOException, InterruptedException {
		TestUtil.TakeScreenShot(AboutMicroSoftImg,"AboutMicroSoftActual", "AboutMicroSoft");
		return AboutMicroSoftImg.isDisplayed();
	}
}
