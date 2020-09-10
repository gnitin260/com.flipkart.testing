package com.flipkart.testing.Pages.AC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.testing.BaseClass.Basecls;

public class AC extends Basecls{

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div/div[1]/div/section[6]/div[2]/div[1]/div[1]/input")
	WebElement searchBrand;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div/div[1]/div/section[6]/div[2]/div[1]/div[2]/div/div/label")
	WebElement SelectBrand;
	
	
	public AC() {
	initElement();
	}

	public LG_AC navigatetoLG_AC() throws InterruptedException {
		Thread.sleep(5000);
		searchBrand.sendKeys("LG");
		Thread.sleep(2000);
		SelectBrand.click();
		return new LG_AC();
		
	}

}
