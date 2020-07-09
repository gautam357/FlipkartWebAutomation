package com.flipkart.mobileTestCase;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.flipkart.base.TestBase;
import com.flipkart.mobiles.SamsungMob;
import com.flipkart.utilities.ExcelReader;

public class SamsungMobTestCases extends TestBase {

	SamsungMob objSamsungMob;

	@BeforeTest
	public void setUp() {
		initialization();
		objSamsungMob = new SamsungMob();
	}

	/*
	 * This is test case for open the samsung mobile page
	 */
	@Test
	public void testcaseOpenSmasungPage() throws InterruptedException, IOException {

		if (objSamsungMob.openSamsungMobPage().equalsIgnoreCase(ExcelReader.getSamsungPageVerificationMessages())) {
			Assert.assertEquals(objSamsungMob.openSamsungMobPage(), ExcelReader.getSamsungPageVerificationMessages(),
					"Samsung Mbile Page is not open");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
