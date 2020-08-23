package com.flipkart.testing.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class HomePage extends Basecls {
	JavascriptExecutor js =(JavascriptExecutor) driver;

	
	@FindBy(xpath = "//img[contains(@class,'_1e_EAo')]")
	WebElement logo;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[6]/div/a/div/div/img[2]")
	WebElement foodEsential;
	
	@FindBy(xpath ="/html/body/div[1]/div/div[3]/div[7]/div/a/div/div/img[2]")
	WebElement gromming;
	

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[10]/div/div/div/img[2]")
	WebElement bodycare;
	

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[12]/div/div/div/img[2]")
	WebElement homeEssential;	
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[14]/div/div/div/img[2]")
	WebElement bookAndpets;
	
	
	@FindBy(xpath = "/html/body/div[1]/div/footer/div/div[3]/div[1]/div[1]/a[2]")
	WebElement Aboutus;
	
	@FindBy(xpath = "/html/body/div[1]/div/footer/div/div[3]/div[1]/div[1]/a[1]")
	WebElement Contactus ;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String title(){
		return driver.getTitle();
		
	}
	public boolean logovalidate() {
		return logo.isDisplayed();	
	}
	public boolean groomingValidaion() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", gromming);
		Thread.sleep(3000);
		return gromming.isDisplayed();	
	}
	
	public boolean bodyCareValidaion() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", bodycare);
		Thread.sleep(3000);
		return bodycare.isDisplayed();	
	}
	public boolean homeEssentialValidaion() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", homeEssential);
		Thread.sleep(3000);
		return homeEssential.isDisplayed();	
	}
	public boolean petandbookValidaion() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", bookAndpets);
		Thread.sleep(3000);
		return bookAndpets.isDisplayed();
	}
	
	public AboutUs AboutusbtnValidation() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", Aboutus);
		Thread.sleep(2000);
		Aboutus.click();
		return new AboutUs(); 
	}
	
	public ContactUs contactUsValidation() {
		js.executeScript("arguments[0].scrollIntoView();", Contactus);
		Contactus.click();
		return new ContactUs();
	}

	
	
	
}
