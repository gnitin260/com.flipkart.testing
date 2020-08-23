package com.flipkart.testing.Pages.Electronics.Mobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class IpadPro extends Basecls{
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/h1")
	WebElement titlePage;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]")
	WebElement PageElements;
	
	
	public IpadPro() {
		PageFactory.initElements(driver, this);
	}
	
	public String TitleVerifaction() {
		return driver.getTitle();
	}
	
	public String PageTitleVerify() {
		return titlePage.getText();
	}

	public boolean PageElementVerify() {
		return PageElements.isDisplayed();
	}
	
}
