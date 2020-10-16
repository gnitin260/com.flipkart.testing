package com.flipkart.testing.Utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.flipkart.testing.BaseClass.Basecls;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class TestUtil extends Basecls{

	public static long PAGE_LOAD_TIMEOOUT=40;
	public static long IMPLICIT_WAIT=20;

	public static void ScrolltoElement(WebElement element) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
	}

	public static  void TakeScreenShot(WebElement element, String actualImages ,String expectedImages) throws IOException, InterruptedException {
		File file= ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\Selenium\\com.flipkart.testing\\ExpectedImage\\ScreenShot\\"+actualImages+".png"));
		Thread.sleep(2000);
		BufferedImage actualImage = ImageIO.read(new File("D:\\Selenium\\com.flipkart.testing\\ExpectedImage\\ScreenShot\\"+actualImages+".png"));
		BufferedImage expectedImage =  ImageIO.read(new File("D:\\Selenium\\com.flipkart.testing\\ExpectedImage\\ScreenShot\\"+expectedImages+".png"));

		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
		Assert.assertFalse(diff.hasDiff(),"Images are Same");

	}

	//	public  static void flipkartStroyimgshot(WebElement element, String actualImages ,String expectedImages) throws IOException, InterruptedException {
	//		File file= ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
	//		FileUtils.copyFile(file, new File("D:\\Selenium\\com.flipkart.testing\\ExpectedImage\\ScreenShot\\"+actualImages+".png"));
	//		Thread.sleep(2000);
	//		BufferedImage actualImage = ImageIO.read(new File("D:\\Selenium\\com.flipkart.testing\\ExpectedImage\\ScreenShot\\"+actualImages+".png"));
	//		BufferedImage expectedImage =  ImageIO.read(new File("D:\\Selenium\\com.flipkart.testing\\ExpectedImage\\ScreenShot\\"+expectedImages+".png"));
	//
	//		ImageDiffer imgDiff = new ImageDiffer();
	//		ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
	//		Assert.assertFalse(diff.hasDiff(),"Images are Same");
	//
	//	}

	


}

