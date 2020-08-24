package com.flipkart.testing.Pages.Electronics.Laptop.Microsoft_Surface;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class MicroSoft_Surface_6 extends Basecls{

	@FindBy(className  = "_3wU53n")
	WebElement Product_1st;
	
	public MicroSoft_Surface_6() {
		PageFactory.initElements(driver, this);
	}
	
	public String TitleVerify() throws InterruptedException {
		Thread.sleep(5000);
		return driver.getTitle();
	}
	
	public String Product_1st_Verify() {
		return Product_1st.getText();
	}
	
}
