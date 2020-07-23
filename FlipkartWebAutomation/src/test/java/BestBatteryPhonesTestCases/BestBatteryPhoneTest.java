package BestBatteryPhonesTestCases;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.flipkart.base.TestBase;
import BestBatteryPhonesProduct.BestBatteryPhones;
import junit.framework.Assert;

public class BestBatteryPhoneTest extends TestBase {

	BestBatteryPhones bestBetryPhoneObj;

	@BeforeTest
	public void setUp() {
		initialization();
		bestBetryPhoneObj = new BestBatteryPhones();
	}

	@Test
	public void testClickOnProduct() throws IOException, InterruptedException {

		Assert.assertEquals("New Windows is not opend ", bestBetryPhoneObj.clickOnProduct(),
				bestBetryPhoneObj.openNewWindos());

	}

	@AfterTest 
	public void tearDown() {
		driver.quit();
	}
}
