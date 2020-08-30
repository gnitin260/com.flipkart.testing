package com.flipkart.testing.Pages.Men;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Utility.CustomeListner;

@Listeners(CustomeListner.class)
public class Wrangler extends Basecls{

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[1]/div/a")
	WebElement ProductSelect;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[1]/div/div/h1")
	WebElement pageDetail;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/p")
	WebElement WranglerDetail;
	
	public Wrangler() {
		initElement();
	}
	
	public String pageDetail() {
		return pageDetail.getText();
	}
	
	public String DetailVerify() {
		return WranglerDetail.getText();
	}

	public void BrandVerify() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> brand_Name= driver.findElements(By.className("_2B_pmu"));
		for (WebElement Brand_Name : brand_Name) {
			String txt= Brand_Name.getText();
			//System.out.println(txt);
			Assert.assertEquals(txt, "Wrangler");
		}

	}
	
	public void ProductSelectionVerify() throws InterruptedException {
		Thread.sleep(2000);
		ProductSelect.click();
	}
}
