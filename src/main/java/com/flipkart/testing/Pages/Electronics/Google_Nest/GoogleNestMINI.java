package com.flipkart.testing.Pages.Electronics.Google_Nest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class GoogleNestMINI extends Basecls{

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1")
	WebElement GoogleNestMini_Verify;

	
	
	@FindBy(id = "swatch-1-color")
	WebElement ColorSelection;


	public GoogleNestMINI() {
		PageFactory.initElements(driver, this);
	}

	public String TitleVerify() throws InterruptedException  {
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public String GoogleNestMiniHeadingVerify() {
		return GoogleNestMini_Verify.getText();
	}
	
	public String ColorSelectionVerify() throws InterruptedException {
		ColorSelection.click();
		Thread.sleep(2000);
		return GoogleNestMini_Verify.getText();
		
	}

}
