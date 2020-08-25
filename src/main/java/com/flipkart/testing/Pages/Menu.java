package com.flipkart.testing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Electronics.GoogleAssistance.GoogleAssistant;
import com.flipkart.testing.Pages.Electronics.Google_Nest.Google_Nest_Mini;
import com.flipkart.testing.Pages.Electronics.Laptop.Microsoft_Surface.MicroSoftProducts;

public class Menu extends Basecls{

	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/ul/li[1]")
	WebElement ElectronicsBtn;
	
	@FindBy(xpath ="//*[contains(text(),'Smart Watches')]")
	WebElement smartWatchBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Google Nest')]")
	WebElement GoogleNestMiniBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Microsoft Store')]")
	WebElement MicroSoft_ProductBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Google Assistant Store')]")
	WebElement Google_Assistant_StoreBtn;

	
	public Menu() {
		PageFactory.initElements(driver, this);
	}
	
//	public SmartWatch smartWatch() throws InterruptedException {
//		Thread.sleep(5000);
//		ElectronicsBtn.click();
//		Thread.sleep(2000);
//		smartWatchBtn.click();
//		return new SmartWatch();
//		
//	}
	
	public Google_Nest_Mini navigatetoGoogleNestMini() throws InterruptedException {
		Thread.sleep(5000);
		ElectronicsBtn.click();
		Thread.sleep(2000);
		GoogleNestMiniBtn.click();
		return new Google_Nest_Mini();
		
	}
	
	public MicroSoftProducts navigatetoMicroSoft_Product() throws InterruptedException {
		Thread.sleep(5000);
		ElectronicsBtn.click();
		Thread.sleep(2000);
		MicroSoft_ProductBtn.click();
		return new MicroSoftProducts();
	}
	
	public GoogleAssistant navigatetoGoogleAssistant() throws InterruptedException {
		Thread.sleep(5000);
		ElectronicsBtn.click();
		Thread.sleep(2000);
		Google_Assistant_StoreBtn.click();
		return new GoogleAssistant();
	}
}
