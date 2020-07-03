package com.flipkart.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.base.TestBase;

public class TestUtility extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 2000;
	public static long IMPLICIT_WAIT = 10;
	
	public static String takeScreenShort(String testCaseName) throws IOException {

		TakesScreenshot screen = (TakesScreenshot) driver;
		System.out.println("this is screenshort page");
		File source = screen.getScreenshotAs(OutputType.FILE);
		String str = "./ScreenShorts/" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(str));
		return str;
	}
}
