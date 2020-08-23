package com.flipkart.testing.Pages.Electronics.SmartWatchWearable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class SmartWatch extends Basecls{

	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/h1")
	WebElement pagetitle;

	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div[3]/div/div[2]/div[1]/div/div[1]/div[2]/a")
	WebElement viewallBtn;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[4]/div[2]/div/div[9]/div/div/label/div[2]")
	WebElement applewatch;
	
	@FindBy(xpath = "//*[contains(text(),'Popularity')]")
	WebElement popularBtn;
	
	@FindBy(xpath= "//*[contains(text(),'Price -- Low to High')]")
	WebElement lowtohighBtn;

	@FindBy(xpath= "//*[contains(text(),'Price -- High to Low')]")
	WebElement hightolow;
	
	

	public SmartWatch() {
		PageFactory.initElements(driver, this);
		
	}

	public String pageTitleVerification() throws InterruptedException {
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public String PageVerify() {
		return pagetitle.getText();

	}
	
	public String viewallVerify() throws InterruptedException {
		viewallBtn.click();
		Thread.sleep(2000);
		return driver.getTitle();
	}
	
	public void selectionbtn() {
		applewatch.click();
	}
	
	public void popularVerify() throws InterruptedException {
		popularBtn.click();
		Thread.sleep(3000);
	
	}
	public void lowtohighVerify() throws InterruptedException {
		lowtohighBtn.click();
		Thread.sleep(3000);
	}
	public void hightolowVerrify() throws InterruptedException {
		hightolow.click();
		Thread.sleep(3000);
	}
	


}
