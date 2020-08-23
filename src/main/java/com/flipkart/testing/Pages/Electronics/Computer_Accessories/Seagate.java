package com.flipkart.testing.Pages.Electronics.Computer_Accessories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class Seagate extends Basecls{
	
	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[1]/div/div/h1")
	WebElement pageVerifyheading;
	
	@FindBy(className = "col-7-12")
	WebElement productSelect;
	
	
	
	public Seagate() {
		PageFactory.initElements(driver, this);
	}

	public String titleVerify() {

		return driver.getTitle();
	}
	
	public String pageVerify() {
		
		return pageVerifyheading.getText();
		
	}
	
	public void productSelection() {
		productSelect.click();
	}

}
