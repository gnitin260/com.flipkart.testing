package com.flipkart.testing.Pages.Electronics.SmartWatchWearable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class SmartWatchs extends Basecls{

	@FindBy(className = "_3vKPvR")
	WebElement InputBrand;

	@FindBy(xpath = "/html/body/div/div/div[3]/div[3]/div/div[1]/div/section[4]/div[2]/div[1]/div[2]")
	WebElement BrandSelection;




	public SmartWatchs() {
		PageFactory.initElements(driver, this);
	}

	public String TtitleVerify() {
		return  driver.getTitle();
	}

	public FitBit navigatetoFitBit() throws InterruptedException {
		Thread.sleep(5000);
		InputBrand.sendKeys("Fitbit");
		Thread.sleep(2000);
		BrandSelection.click();
		return new FitBit();
	}
}
