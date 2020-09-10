package com.flipkart.testing.Pages.AC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.testing.BaseClass.Basecls;

public class LG_AC extends Basecls {

	@FindBy(className  = "_2yAnYN")
	WebElement PageHeading;

	@FindBy(xpath = "//*[contains(text(),'Discount')]")
	WebElement Discount;

	public LG_AC() {
		initElement();
	}

	public String TitleVerify() {
		//	Thread.sleep(5000);
		return driver.getTitle();
	}
	public String PageVerify() throws InterruptedException {
		Thread.sleep(5000);
		return PageHeading.getText();
	}

	public void AmountVerify() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> amount=driver.findElements(By.className("_1vC4OE"));
		int listcount= amount.size();
		System.out.println(listcount);
		for (WebElement Amount : amount) {
			String price=Amount.getText();
		}


	}

	public void DiscountVerify() throws InterruptedException {
		Thread.sleep(2000);

		ArrayList<String> obtainedList= new ArrayList<String>();
		List<WebElement> amount=driver.findElements(By.className("VGWI6T"));
		int listcount= amount.size();
		System.out.println(listcount);
		for (WebElement amt : amount) {
			obtainedList.add(amt.getText());
		}
		ArrayList<String> sortedList= new ArrayList<String>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		Thread.sleep(2000);
		Collections.sort(sortedList);
		//	System.out.println(obtainedList);
		System.out.println(sortedList);
		ArrayList<String> actuallist= new ArrayList<String>();
		Discount.click();
		Thread.sleep(2000);
		List<WebElement> actualamount=driver.findElements(By.className("VGWI6T"));
		for (WebElement C : actualamount) {
			actuallist.add(C.getText());
		}
		System.out.println(actuallist);
	}
}
