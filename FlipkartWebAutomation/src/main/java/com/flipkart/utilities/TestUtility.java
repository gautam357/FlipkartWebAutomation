package com.flipkart.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.base.TestBase;

public class TestUtility extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 2000;
	public static long IMPLICIT_WAIT = 10;
	static Actions action = new Actions(driver);
	// This is for take the screenshot
	public static String takeScreenShort(String testCaseName) throws IOException {

		TakesScreenshot screen = (TakesScreenshot) driver;
		System.out.println("this is screenshort page");
		File source = screen.getScreenshotAs(OutputType.FILE);
		String str = "./ScreenShorts/" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(str));
		return str;
	}

	// This if for move the cursor
	public static void moveToElement(WebElement element) {
		
		action.moveToElement(element).build().perform();
	}

	// Full page scrolling
	public static void scrollingDownFullPage() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1100)");
	}

	// Sub page scrolling
	public static void subPageScrolling(WebElement elm) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		je.executeScript("arguments[0].scrollIntoView(true);", elm);
	}

	//Handle multiple window
	public static void handleMultipleWindows() {
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> itr = allwindows.iterator();
		String parentWindow = null;
		String childWindor = null;
		while (itr.hasNext()) {
			parentWindow = itr.next();
			childWindor = itr.next();
		}
		driver.switchTo().window(childWindor);
	}
	
	//This is for drag and drop 
	public static void dragAndDrop(String sourcePath, String targetPath) {
		WebElement source = driver.findElement(By.xpath(sourcePath));
		WebElement target = driver.findElement(By.xpath(targetPath));
		action.dragAndDrop(source, target).build().perform();
	}
}
