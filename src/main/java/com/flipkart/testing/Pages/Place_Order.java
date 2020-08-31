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

	@FindBy(className = "_7UHT_c")
	WebElement placeOrder;

	@FindBy(xpath = "//*[@id=\"swatch-0-size\"]/a")
	WebElement sizeSelectionBtn;

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


		String mainWindow=driver.getWindowHandle();
		Set<String> set =driver.getWindowHandles();
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();
			if(!mainWindow.equals(childWindow)){
				driver.switchTo().window(childWindow);
				Thread.sleep(5000);
				placeOrder.click();
				Thread.sleep(3000);
				deliveraddressBnt.click();
				Thread.sleep(4000);
				ordersummaryContinueBtn.click();

				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);


		//		String MainWindow=driver.getWindowHandle();		
		//		Set<String> s1=driver.getWindowHandles();		
		//		Iterator<String> i1=s1.iterator();		
		//
		//		while(i1.hasNext())			
		//		{		
		//			String ChildWindow=i1.next();		
		//
		//			if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		//			{    		
		//				Thread.sleep(8000);
		//				placeOrder.click();  
		//				Thread.sleep(2000);
		//				deliveraddressBnt.click();
		//				Thread.sleep(4000);
		//				ordersummaryContinueBtn.click();
		//				Thread.sleep(4000);
		//				driver.close();		
		//			}		
		//		}		
		//		driver.switchTo().window(MainWindow);				
	}

	public void PlaceOrderClothing() throws InterruptedException {
		String mainWindow=driver.getWindowHandle();
		Set<String> set =driver.getWindowHandles();
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();
			if(!mainWindow.equals(childWindow)){
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				sizeSelectionBtn.click();
				Thread.sleep(2000);
				placeOrder.click();
				Thread.sleep(2000);
				deliveraddressBnt.click();
				Thread.sleep(2000);
				ordersummaryContinueBtn.click();

				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);


	}
}


