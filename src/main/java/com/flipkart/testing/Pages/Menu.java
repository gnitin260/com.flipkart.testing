package com.flipkart.testing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.AC.AC;
import com.flipkart.testing.Pages.Electronics.GoogleAssistance.GoogleAssistant;
import com.flipkart.testing.Pages.Electronics.Google_Nest.Google_Nest_Mini;
import com.flipkart.testing.Pages.Electronics.Laptop.Microsoft_Surface.MicroSoftProducts;
import com.flipkart.testing.Pages.Electronics.SmartWatchWearable.SmartWatchs;
import com.flipkart.testing.Pages.Men.Men_Tshirts;
import com.flipkart.testing.Pages.Women.WesternMaterial.Dresses;

public class Menu extends Basecls{

	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/ul/li[1]")
	WebElement ElectronicsBtn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/span[2]")
	WebElement TV_Applinces_Btn;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/ul/li[3]")
	WebElement MenBtn;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/ul/li[4]")
	WebElement WomenBtn;
	
	@FindBy(xpath ="//*[contains(text(),'Smart Watches')]")
	WebElement smartWatchBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Google Nest')]")
	WebElement GoogleNestMiniBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Microsoft Store')]")
	WebElement MicroSoft_ProductBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Google Assistant Store')]")
	WebElement Google_Assistant_StoreBtn;
	
	@FindBy(xpath = "//*[contains(text(),'T-Shirts')]")
	WebElement TshirtsBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Dresses')]")
	WebElement DresseBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Air Conditioners')]")
	WebElement ACBtn;
	
	
	
	public Menu() {
		PageFactory.initElements(driver, this);
	}
	
	public SmartWatchs navigatetosmartWatch() throws InterruptedException {
		Thread.sleep(5000);
		ElectronicsBtn.click();
		Thread.sleep(2000);
		smartWatchBtn.click();
		return new SmartWatchs();
		
	}
	
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
	
	public Men_Tshirts navigatetoMen_Tshirts() throws InterruptedException {
		Thread.sleep(6000);
		MenBtn.click();
		Thread.sleep(2000);
		TshirtsBtn.click();
		return new Men_Tshirts();
	}
	public Dresses navigatetoWomen_Dressess() throws InterruptedException {
		Thread.sleep(6000);
		WomenBtn.click();
		Thread.sleep(4000);
		DresseBtn.click();
		return new Dresses();
	}

	public AC navigatetoAC() throws InterruptedException {
		Thread.sleep(5000);
		TV_Applinces_Btn.click();
		Thread.sleep(2000);
		ACBtn.click();
		return new AC();
		
	}
}
