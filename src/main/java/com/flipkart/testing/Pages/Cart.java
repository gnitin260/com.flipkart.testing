package com.flipkart.testing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class Cart extends Basecls {

	@FindBy (className = "_2MWPVK")
	WebElement gotocartBtn;

	@FindBy(className = "_7UHT_c")
	WebElement placeOrder;


	public Cart() {
		PageFactory.initElements(driver, this);
	}


	public String PageTitle() {
		return driver.getTitle();
	}

	public Cart gotocartBtn() {
		gotocartBtn.click();
		return new Cart();

	}


	public Place_Order placeOrder() {
		placeOrder.click();
		return new Place_Order();
	}
	
}
