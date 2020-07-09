package com.flipkart.mobileTestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.flipkart.base.TestBase;
import com.flipkart.mobiles.AppleMob;
import com.flipkart.utilities.ExcelReader;

public class AppleMobTestCase extends TestBase {

	AppleMob objAppleMob;

	@BeforeTest
	public void setUp() {
		initialization();
		objAppleMob = new AppleMob();
	}

	@Test
	public void testCaseOpenPage() throws InterruptedException, IOException {

		Assert.assertEquals(objAppleMob.openAppleMobilePage(), ExcelReader.getApplePageVerificationMessage(),
				"Apple moble is not open");
	}

	@AfterTest
	public void tesrDown() {
		driver.quit();
	}
}
