package com.flipkart.testing.Pages.Men;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.flipkart.testing.BaseClass.Basecls;

public class Men_Tshirts extends Basecls{
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/h1")
	WebElement PageTitle;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div/p")
	WebElement PageDetail;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/section[5]/div[2]/div[1]/div[1]/input")
	WebElement searchBrand;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/section[5]/div[2]/div[1]/div[2]/div/div/label")
	WebElement SelectBrand;
		
	
	public Men_Tshirts() {
		initElement();
	}
	
	public String TitleVerify() throws InterruptedException {
		Thread.sleep(5000);
		return driver.getTitle();
		
	}

	public String PageVerify() {
		return PageTitle.getText();
		
	}
	
	public String PageDetail_Verify() {
		return PageDetail.getText();
		
	}
	
	public Wrangler navigatetoWrangler() throws InterruptedException {
		Thread.sleep(5000);
		searchBrand.sendKeys("Wrangler");
		Thread.sleep(2000);
		SelectBrand.click();
		return new Wrangler();
	}
	

}
