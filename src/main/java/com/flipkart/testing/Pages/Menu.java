package com.flipkart.testing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Electronics.Google_Nest.Google_Nest_Mini;
import com.flipkart.testing.Pages.Electronics.SmartWatchWearable.SmartWatch;

public class Menu extends Basecls{

	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/ul/li[1]")
	WebElement ElectronicsBtn;
	
	@FindBy(xpath ="//*[contains(text(),'Smart Watches')]")
	WebElement smartWatchBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Google Nest')]")
	WebElement GoogleNestMiniBtn;

	
	public Menu() {
		PageFactory.initElements(driver, this);
	}
	
	public SmartWatch smartWatch() throws InterruptedException {
		Thread.sleep(5000);
		ElectronicsBtn.click();
		Thread.sleep(2000);
		smartWatchBtn.click();
		return new SmartWatch();
		
	}
	
	public Google_Nest_Mini navigatetoGoogleNestMini() throws InterruptedException {
		Thread.sleep(5000);
		ElectronicsBtn.click();
		Thread.sleep(2000);
		GoogleNestMiniBtn.click();
		return new Google_Nest_Mini();
		
	}
}
