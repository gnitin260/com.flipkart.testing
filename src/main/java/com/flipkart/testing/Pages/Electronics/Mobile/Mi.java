package com.flipkart.testing.Pages.Electronics.Mobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testing.BaseClass.Basecls;

public class Mi extends Basecls{


	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/h1")
	WebElement MiCompany;

	//Filter By RAM

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[4]/div[2]/div/div[1]/div/div/label/div[2]")
	WebElement RAM6GB ;

	@FindBy(xpath = "//div[contains(text(),'4 GB')]")
	WebElement RAM4GB ;

	@FindBy(xpath = "//div[contains(text(),'3 GB')]")
	WebElement RAM3GB;

	@FindBy(xpath = "//div[contains(text(),'2 GB')]")
	WebElement RAM2GB;

	@FindBy(xpath = "//div[contains(text(),'1 GB')]")
	WebElement RAM1GB;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[4]/div[2]/div/div[1]/div[1]")
	WebElement clickallRAM;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/ul/li[1]")
	WebElement RAM6GBVerify;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/ul/li[1]")
	WebElement RAM4GBVerify;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/ul/li[1]")
	WebElement RAM3GBVerify;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/ul/li[1]")
	WebElement RAM2GBVerify;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/ul/li[1]")
	WebElement RAM1GBVerify;


	@FindBy(xpath = "//div[contains(text(),'Internal Storage')]")
	WebElement Dropinternalstorage;

	@FindBy(xpath = "//div[contains(text(),'256 GB & Above')]")
	WebElement Storge256GB;

	@FindBy(xpath = "//div[contains(text(),'128 - 255.9 GB')]")
	WebElement Storge128GB;

	@FindBy(xpath = "//div[contains(text(),'64 - 127.9 GB')]")
	WebElement Storge64GB;

	@FindBy(xpath = "//div[contains(text(),'32 - 63.9 GB')]")
	WebElement Storge32GB;

	@FindBy(xpath = "//div[contains(text(),'16 - 31.9 GB')]")
	WebElement Storge16GB;

	@FindBy(xpath = "//div[contains(text(),'8 - 15.9 GB')]")
	WebElement Storge8GB;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/ul/li[1]")
	WebElement MemoryGBVerify;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[1]/div[1]/div[2]")
	WebElement clearallFil;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[3]/div[2]")
	WebElement low_high;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[3]/div[3]")
	WebElement high_low;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[3]/div[4]")
	WebElement newest;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement filterdata;





	public Mi() {
		PageFactory.initElements(driver, this);
	}

	public String TitleVerify() {
		return driver.getTitle();

	}
	public String MiCompanyVerification() {
		return MiCompany.getText();
	}

	public void ClearallRAMfilter() {
		clickallRAM.click();

	}

	public String Mi6GBRAMverification() throws InterruptedException {
		RAM6GB.click();
		Thread.sleep(2000);
		return RAM6GBVerify.getText();

	}

	public String RAM4GBVerification() throws InterruptedException {
		RAM4GB.click();
		Thread.sleep(2000);
		return RAM4GBVerify.getText();

	}

	public String Mi3GBRAMverification() throws InterruptedException {
		RAM3GB.click();
		Thread.sleep(2000);
		return RAM3GBVerify.getText();

	}

	public String Mi2GBRAMverification() throws InterruptedException {
		RAM2GB.click();
		Thread.sleep(2000);
		return RAM2GBVerify.getText();

	}

	public String Mi1GBRAMverification() throws InterruptedException {
		RAM1GB.click();
		Thread.sleep(2000);
		return RAM1GBVerify.getText();

	}

	public void dropdownclick() {
		Dropinternalstorage.click();
	}

	public String Mi256GBROMverification() throws InterruptedException {
		Storge256GB.click();
		Thread.sleep(2000);
		return MemoryGBVerify.getText();

	}

	public String Mi128GBROMverification() throws InterruptedException {
		Thread.sleep(1500);
		Storge128GB.click();
		Thread.sleep(2000);
		return MemoryGBVerify.getText();

	}

	public String Mi64GBROMverification() throws InterruptedException {
		Storge64GB.click();
		Thread.sleep(2000);
		return MemoryGBVerify.getText();

	}


	public String Mi32GBROMverification() throws InterruptedException {
		Storge32GB.click();
		Thread.sleep(2000);
		return MemoryGBVerify.getText();

	}


	public String Mi16GBROMverification() throws InterruptedException {
		Storge16GB.click();
		Thread.sleep(2000);
		return MemoryGBVerify.getText();

	}

	public String Mi8GBROMverification() throws InterruptedException {
		Storge8GB.click();
		Thread.sleep(2000);
		return MemoryGBVerify.getText();

	}

	public void clearfilterveri() throws InterruptedException {
		clearallFil.click();
		Thread.sleep(1500);
	}

	public String low_highVerification() throws InterruptedException {	
		low_high.click();
		Thread.sleep(1500);
		return filterdata.getText();

	}

	public String high_lowVerification() throws InterruptedException {	
		high_low.click();
		Thread.sleep(1500);
		return filterdata.getText();

	}

	public String newestVerification() throws InterruptedException {	
		newest.click();
		Thread.sleep(1500);
		return filterdata.getText();

	}



}
