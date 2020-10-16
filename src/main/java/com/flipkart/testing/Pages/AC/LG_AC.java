package com.flipkart.testing.Pages.AC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class LG_AC extends Basecls {

	@FindBy(className  = "_2yAnYN")
	WebElement PageHeading;

	@FindBy(xpath = "//[@class='_1xHtJz']")
	WebElement Discount;



	@FindBy(xpath = "/html/body/div/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[9]/div/div")
	WebElement TypeBtn;

	@FindBy(xpath = "/html/body/div/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[9]/div[2]/div/div[2]/div/div/label/div[2]")
	WebElement WindowsBtn;





	public LG_AC() {
		PageFactory.initElements(driver, this);
	}

	public String TitleVerify() {
		//	Thread.sleep(5000);
		return driver.getTitle();
	}
	public String PageVerify() throws InterruptedException {
		Thread.sleep(5000);
		return PageHeading.getText();
	}

	public void AllAmountVerify()   {
		//Thread.sleep(2000);
		List<String> obtainedList= new ArrayList<String>();
		List<WebElement> amount=driver.findElements(By.className("_1vC4OE"));
		int listcount= amount.size();
		System.out.println(listcount);
		for (WebElement Amount : amount) {
			obtainedList.add(Amount.getText());

		}
		System.out.println(obtainedList);
	}

	public void AllDiscountVerify() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Pagination_Next_btn=  driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
		//	WebElement Pagination_Next_btn=  driver.findElements(By.xpath(""));
		List<String> obtainedList= new ArrayList<String>();
		List<WebElement> discount=driver.findElements(By.xpath("//*[@class='_2cLu-l']"));

		for (WebElement amt : discount) {
			obtainedList.add(amt.getText());
		}
		while(true) {
			Thread.sleep(2000);
			Pagination_Next_btn.click();
			Thread.sleep(500);
			//TestUtil.ScrolltoElement(Pagination_Next_btn);
			discount=driver.findElements(By.xpath("//*[@class='_2cLu-l']"));
			for (WebElement amt : discount) {
				obtainedList.add(amt.getText());
			}
			try {
				Pagination_Next_btn=  driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
			}
			catch (Exception e) {
				System.out.println("NO MORE ITEMS");
				break;
			}
		}


		System.out.println(obtainedList);
		int listcount= discount.size();
		System.out.println(listcount);

		//		ArrayList<String> sortedList= new ArrayList<String>();
		//		for (String s : obtainedList) {
		//			sortedList.add(s);
		//		}
		//	System.out.println(obtainedList);
		Thread.sleep(2000);
		//Collections.sort(obtainedList);
		driver.navigate().refresh();
	}

	public void discountBtn() throws InterruptedException {
		
		Thread.sleep(5000);
		Discount.click();
		Thread.sleep(2000);
	}

	public void DiscountVerify() throws InterruptedException {

		WebElement Pagination_Next_btn=  driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
		//	WebElement Pagination_Next_btn=  driver.findElements(By.xpath(""));
		List<String> ActualList= new ArrayList<String>();
		List<WebElement>discount=driver.findElements(By.xpath("//*[@class='_2cLu-l']"));

		for (WebElement amt1 : discount) {
			ActualList.add(amt1.getText());
		}
		while(true) {
			Thread.sleep(2000);
			Pagination_Next_btn.click();
			Thread.sleep(500);
			//	TestUtil.ScrolltoElement(Pagination_Next_btn);
			discount=driver.findElements(By.xpath("//*[@class='_2cLu-l']"));
			for (WebElement amt : discount) {
				ActualList.add(amt.getText());
			}
			try {
				Pagination_Next_btn=  driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
			}
			catch (Exception e) {
				System.out.println("NO MORE ITEMS");
				break;
			}
		}

		System.out.println(ActualList);
	}

	public void WindowDiscount_Verify() throws InterruptedException {
		Thread.sleep(3000);
		//	TestUtil.ScrolltoElement(TypeBtn);
		TypeBtn.click();

		WindowsBtn.click();
		Thread.sleep(2000);
		List<String>obtainedList= new ArrayList<String>();
		List<WebElement> discount=driver.findElements(By.className("VGWI6T"));
		for (WebElement Discount : discount) {
			obtainedList.add(Discount.getText());
		}
		System.out.println(obtainedList);
		Thread.sleep(2000);
		Collections.reverse(obtainedList);
		System.out.println(obtainedList);
	}
	public void DiscountAmountVerify() throws InterruptedException {
		Discount.click();
		Thread.sleep(3000);
		List<String> actualList= new ArrayList<String>();
		List<WebElement> discount1=driver.findElements(By.className("VGWI6T"));
		for (WebElement Actual : discount1) {
			actualList.add(Actual.getText());
		}
		System.out.println(actualList);
	}
}

