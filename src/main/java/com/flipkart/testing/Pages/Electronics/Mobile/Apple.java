package com.flipkart.testing.Pages.Electronics.Mobile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class Apple extends Basecls{

	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/h1")
	WebElement pagetitleTxt;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[1]/div/div/div[1]/a[1]/div/img[1]")
	WebElement bannerimg1;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[1]/div/div/div[1]/a[2]/div/img[1]")
	WebElement bannerimg2;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div/div[1]/a/div/img[1]")
	WebElement iphone8plusimg;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div/div[2]/a/div/img[1]")
	WebElement iphone8img;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div/div[3]/a/div/img[1]")
	WebElement iphone7img;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[3]/div/div[1]/a/div/img[1]")
	WebElement ipadProbnnr;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/div[4]/div/div[1]/a/div/img[1]")
	WebElement ipad;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[4]/div/div[2]/a/div/img[1]")
	WebElement ipadPro;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[4]/div/div[3]/a/div/img[1]")
	WebElement ipadMini;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[5]/div/div[1]/a/div/img[1]")
	WebElement MacBookAirbnr;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[3]/div/div[1]/a/div/img[1]")
	WebElement MacBookOffer;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[6]/div/div[2]/a/div/img[1]")
	WebElement Accessories;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[4]/div/div[2]/a/div/img[1]")
	WebElement MacBookAir;

	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[3]/div/div[1]/a")
	WebElement AppleWatch;

	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[3]/div/div[1]/a")
	WebElement Apllewatchsec;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Apple() {
		PageFactory.initElements(driver, this);
	}

	public String titleVerification() {
		return driver.getTitle();
	}

	public String PageVerification() {
		return pagetitleTxt.getText();
	}

	public boolean iphone8plusVerify() {
		return iphone8plusimg.isDisplayed();

	}

	public boolean iphone8Verify() {
		return iphone8img.isDisplayed();

	}

	public boolean iphone7Verify() {
		return iphone7img.isDisplayed();

	}

	public boolean ipadprobnrVerify() throws InterruptedException {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", ipadProbnnr);
		Thread.sleep(500);
		return ipadProbnnr.isDisplayed();

	}

	public boolean ipadproVerify() throws InterruptedException {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", ipadPro);
		Thread.sleep(500);
		return ipadPro.isDisplayed();

	}

	public boolean ipadMiniVerify() throws InterruptedException {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", ipadMini);
		Thread.sleep(500);
		return ipadMini.isDisplayed();

	}

	public boolean ipadVerify() throws InterruptedException {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", ipad);
		Thread.sleep(500);
		return ipad.isDisplayed();

	}

	public boolean MacBookAirbnrverify() throws InterruptedException {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", MacBookAirbnr);
		Thread.sleep(500);
		return MacBookAirbnr.isDisplayed();
	}

	public boolean MacBookOfferverify() throws InterruptedException {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", MacBookOffer);
		Thread.sleep(500);
		return MacBookOffer.isDisplayed();
	}

	public boolean MacBookAccessoriesverify() throws InterruptedException {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", Accessories);
		Thread.sleep(500);
		return Accessories.isDisplayed();
	}

	public boolean MacBookAir() throws InterruptedException {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", MacBookAir);
		Thread.sleep(500);
		return MacBookAir.isDisplayed();
	}

	public boolean ApplewatchVerify() throws InterruptedException {
		Thread.sleep(100);
		js.executeScript("arguments[0].scrollIntoView();", AppleWatch);
		Thread.sleep(100);
		return AppleWatch.isDisplayed();
	}

	public IpadPro IpadPro() throws InterruptedException{
		js.executeScript("arguments[0].scrollIntoView();", ipadPro);
		Thread.sleep(2000);
		ipadPro.click();
		return new IpadPro();
	}

	public MacBookAir MacBookAir2020(){
		MacBookAirbnr.click();
		return new MacBookAir();
	}

	public AppleWatch AppleWatch() throws InterruptedException{
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView();", AppleWatch);
		Thread.sleep(2000);
		Apllewatchsec.sendKeys(Keys.ENTER);
		return new AppleWatch();

	}



}
