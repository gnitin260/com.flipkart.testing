package com.flipkart.testing.Pages.Men;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.flipkart.testing.BaseClass.Basecls;

public class Wrangler extends Basecls{

	public Wrangler() {
		initElement();
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
}
