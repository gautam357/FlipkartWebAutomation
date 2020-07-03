package com.flipkart.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.flipkart.configReader.ConFigReader;
import com.flipkart.utilities.TestUtility;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static String baseURL;
	public static String nodeURL;

	public static void initialization() {
		String browserName = ConFigReader.configReader();
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/drivezy/git/AutomationWebProject/AutomationWebProject/driver/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/drivezy/git/FlipkartWebAutomation/FlipkartWebAutomation/driver/geckodriver ");
			driver = new FirefoxDriver();
		} else {
			System.out.println("driver is not found");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(ConFigReader.getUrl());
	}
}
