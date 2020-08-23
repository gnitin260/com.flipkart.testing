package com.flipkart.testing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class Place_Order extends Basecls {

	@FindBy (xpath ="//*[contains(text(),'Deliver Here')]")
	WebElement deliveraddressBnt;

	@FindBy (xpath = "//*[contains(text(),'CONTINUE')]")
	WebElement ordersummaryContinueBtn;


	public Place_Order() {
		PageFactory.initElements(driver, this);

	}

	public String titleVerify() {
		return driver.getTitle();

	}

	public void placeorderVerify() throws InterruptedException {
		Thread.sleep(2000);
		deliveraddressBnt.click();
		Thread.sleep(4000);
		ordersummaryContinueBtn.click();
	}



}
