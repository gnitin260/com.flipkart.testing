package com.flipkart.testing.Pages.Electronics.Mobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class AppleWatch extends Basecls{

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/h1")
	WebElement titletxt;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[1]/div[1]/div[2]")
	WebElement ClearAllBtn;

	@FindBy(xpath = "//div[contains(text(),'Price -- Low to High')]")
	WebElement Low_high;

	@FindBy(xpath = "//div[contains(text(),'Price -- High to Low')]")
	WebElement high_low;

	@FindBy(xpath = "//div[contains(text(),'Popularity')]")
	WebElement popularty;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement verify_filterData;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]")
	WebElement productselectbtn;


	public AppleWatch() {
		PageFactory.initElements(driver, this);
	}

	public String titleVerify() {
		return driver.getTitle();
	}

	public String PageVerify() {
		return titletxt.getText();
	}

	public boolean ClearBtn() {
		return ClearAllBtn.isDisplayed();
	}

	public void ClearallBtn(){
		ClearAllBtn.click();
	}

	public String populartyFilter() throws InterruptedException
	{
		popularty.click();
		return	verify_filterData.getText();

	}
	public String low_highFilter() throws InterruptedException
	{
		Low_high.click();
		return	verify_filterData.getText();

	}
	public String high_lowFilter() throws InterruptedException
	{
		Thread.sleep(1000);
		high_low.click();
		return	verify_filterData.getText();

	}

	public void productselection() {
		productselectbtn.click();
	}
}
