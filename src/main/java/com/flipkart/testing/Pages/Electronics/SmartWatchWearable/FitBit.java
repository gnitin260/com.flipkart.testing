package com.flipkart.testing.Pages.Electronics.SmartWatchWearable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class FitBit extends Basecls{

	@FindBy(className = "_2yAnYN")
	WebElement PageHEading;
	
	@FindBy(className = "_3wU53n")
	WebElement productSelection;
	
	public FitBit() {
		PageFactory.initElements(driver, this);
	}
	
	public String TitleVerify() throws InterruptedException {
		Thread.sleep(5000);
		return driver.getTitle();
	}

	public String PageVerify() {
		return PageHEading.getText();
	}
	
	public void ProductSelection_Verify() {
		productSelection.click();
	}
}
