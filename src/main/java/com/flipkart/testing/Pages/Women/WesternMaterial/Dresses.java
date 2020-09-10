package com.flipkart.testing.Pages.Women.WesternMaterial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.flipkart.testing.BaseClass.Basecls;

public class Dresses extends Basecls{

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/h1")
	WebElement pageHeading;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div/p")
	WebElement detailData;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div/div/section[1]/div[1]/div[2]/span")
	WebElement ClearAllBtn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/section[5]/div[2]/div[1]/div[1]/input")
	WebElement searchBrand;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/section[5]/div[2]/div[1]/div[2]/div/div/label")
	WebElement SelectBrand;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[1]/div/a")
	WebElement ProductSelect;

	public Dresses() {
		initElement();
	}

	public String TitleVerify() throws InterruptedException {
		Thread.sleep(5000);
		return driver.getTitle();
	}

	public String PageVerify() {
		return pageHeading.getText();
	}

	public String detailVerify() {
		return detailData.getText();
	}
	public void ProductSelectionVerify() throws InterruptedException {
		Thread.sleep(2000);
		ProductSelect.click();
	}
	public  void  BrandSelection_Ist(String Brand)throws InterruptedException {
		Thread.sleep(5000);
		searchBrand.sendKeys(Brand);
		Thread.sleep(2000);
		SelectBrand.click();
		
	}

	public void BrandVerify(String expexted) throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> brand_Name= driver.findElements(By.className("_2B_pmu"));
		for (WebElement Brand_Name : brand_Name) {
			String txt= Brand_Name.getText();
			//System.out.println(txt);
			Assert.assertEquals(txt, expexted);
		}
	}

	public void BrandSelection(String Brand) throws InterruptedException {
		Thread.sleep(3000);
		ClearAllBtn.click();
		Thread.sleep(2000);
		searchBrand.sendKeys(Brand);
		Thread.sleep(2000);
		SelectBrand.click();
	}
}
