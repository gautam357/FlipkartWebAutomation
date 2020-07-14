package BestBatteryPhonesTestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;

import BestBatteryPhonesProduct.BestBatteryPhones;

public class BestBatteryPhoneTest extends TestBase {

	BestBatteryPhones bestBetryPhoneObj;

	@BeforeTest
	public void setUp() {
		initialization();
		bestBetryPhoneObj = new BestBatteryPhones();
	}

	@Test
	public void testClickOnProduct() throws IOException, InterruptedException {
		bestBetryPhoneObj.clickOnProduct();

	}
}
