package com.flipkart.testing.Pages.Electronics.Computer_Accessories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class ExternalHardDisk extends Basecls{
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/h1")
	WebElement PageHeading;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div/div[2]/div[1]/div/div[1]/div/a/div")
	WebElement _1TB;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div/div[2]/div[1]/div/div/div[1]/div/div[2]/div/a")
	WebElement WD;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div/div[2]/div[1]/div/div/div[1]/div/div[3]/div/a")
	WebElement Samsung;
	
	
	
	public ExternalHardDisk() {
		PageFactory.initElements(driver, this);
	}

	public String titleVerification() {
		return driver.getTitle();
	}
	
	public String pageVerify() {
		return PageHeading.getText();
		}
	
	public Seagate seagatePage() throws InterruptedException {
		Thread.sleep(5000);
		_1TB.click();
		return new Seagate();
		
	}
}
