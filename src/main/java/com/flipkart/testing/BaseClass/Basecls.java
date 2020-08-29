package com.flipkart.testing.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;

public class Basecls {

	public static WebDriver driver;
	public static Properties prop;
	public static WebElement element;

	public Basecls() {
		try {
			prop= new Properties();
			FileInputStream id=new FileInputStream("D:\\Selenium\\com.flipkart.testing\\src\\main\\java\\com\\flipkart\\testing\\Properties\\flipProp");
			prop.load(id);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void intialization() {
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\com.flipkart.testing\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\com.flipkart.testing\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));

	}
	
	public void failed(String testMethod) {
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("D:\\Selenium\\com.flipkart.testing\\Fail_ScreenShot\\"+testMethod+"_"+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	public void initElement() {
		PageFactory.initElements(driver, this);
	}
	
	

}
