package com.flipkart.testing.Pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.flipkart.testing.BaseClass.Basecls;

public class Login extends Basecls {

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")
	WebElement loginbtm;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement userinput;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement passwordinput;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	WebElement loginbtn;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/span[2]/span")
	WebElement errortext_username;

	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/span[2]/span")
	WebElement errortest_Password;


	public Login() {
		PageFactory.initElements(driver, this);
	}

	public void loginpage(String uname, String pswd) throws InterruptedException {
		userinput.clear();
		userinput.sendKeys(uname);
		passwordinput.clear();
		passwordinput.sendKeys(pswd);
		loginbtn.click();
		Thread.sleep(1000);
	}

	public String errormsg() {
		
		return errortext_username.getText();
		
	}
	public String erropasswrd() {

		return errortest_Password.getText();
	}

	public HomePage login(String uname, String pswd) throws InterruptedException {

		userinput.clear();
		userinput.sendKeys(uname);
		passwordinput.clear();
		passwordinput.sendKeys(pswd);
		Thread.sleep(1000);
		loginbtn.click();
		return new HomePage();

	}



}
