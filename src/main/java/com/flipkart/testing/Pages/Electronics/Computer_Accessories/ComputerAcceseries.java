package com.flipkart.testing.Pages.Electronics.Computer_Accessories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class ComputerAcceseries extends Basecls{



	@FindBy(xpath = "/html/body/div/div/div[2]/div/ul/li[1]/span")
	WebElement elc;
	

	@FindBy(xpath = "//*[contains(text(),'External Hard Disks')]")
	WebElement HDDbtn;



	public ComputerAcceseries() {
		PageFactory.initElements(driver, this);
	}

	public ExternalHardDisk Harddisk() throws InterruptedException {
		Thread.sleep(5000);
		elc.click();
		Thread.sleep(1500);
		HDDbtn.click();
		return new ExternalHardDisk();
	}
}
