package com.flipkart.testing.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class Place_Order extends Basecls {

	@FindBy (xpath ="//*[contains(text(),'Deliver Here')]")
	WebElement deliveraddressBnt;

	@FindBy (xpath = "//*[contains(text(),'CONTINUE')]")
	WebElement ordersummaryContinueBtn;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]")
	WebElement placeOrder;


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

	public void PlaceOrder() throws InterruptedException {
		String MainWindow=driver.getWindowHandle();		

		// To handle all new opened window.				
		Set<String> s1=driver.getWindowHandles();		
		Iterator<String> i1=s1.iterator();		

		while(i1.hasNext())			
		{		
			String ChildWindow=i1.next();		

			if(!MainWindow.equalsIgnoreCase(ChildWindow))			
			{    		
				Thread.sleep(8000);
				placeOrder.click();  
				Thread.sleep(2000);
				deliveraddressBnt.click();
				Thread.sleep(4000);
				ordersummaryContinueBtn.click();
				Thread.sleep(4000);
				driver.close();		
			}		
		}		
		driver.switchTo().window(MainWindow);				
	}
}


