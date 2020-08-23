package com.flipkart.testing.Pages.Electronics.Mobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.flipkart.testing.BaseClass.Basecls;

public class Mobile extends Basecls {

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/ul/li[1]")
	WebElement ElectronicsBtn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a")
	WebElement miBtn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[7]/a")
	WebElement IphoneBtn;


	public Mobile() {
		PageFactory.initElements(driver, this);
	}

	public void NavigatetoMi() throws InterruptedException{
		ElectronicsBtn.click();
		Thread.sleep(2000);
		miBtn.click();

	}

	public Apple NavigatetoIphone() throws InterruptedException{
		Thread.sleep(3000);
		ElectronicsBtn.click();
		Thread.sleep(2000);
		IphoneBtn.click();
		return new Apple();

	}



}

