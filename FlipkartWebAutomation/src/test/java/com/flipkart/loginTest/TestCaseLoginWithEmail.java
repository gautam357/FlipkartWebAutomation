package com.flipkart.loginTest;

import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.flipkart.base.TestBase;
import com.flipkart.configReader.ConfigReader;
import com.flipkart.login.LoginWithEmail;
import com.flipkart.utilities.ExcelReader;
import junit.framework.Assert;

public class TestCaseLoginWithEmail extends TestBase {

	static LoginWithEmail objLoginWithEMail;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		initialization();
		objLoginWithEMail = new LoginWithEmail();
	}

	@Test(priority = 1)
	public void testCaseOfWrongEmailPAssword() throws InterruptedException, IOException {
		String str1 = ExcelReader.getMessagesForWrongEmailPass();
		String str2 = objLoginWithEMail.wrongEmailPassword(ExcelReader.getWrongEmail(), ExcelReader.getWrongPassword(),
				ConfigReader.getLoginVerificationName());
		if (str1.equalsIgnoreCase(str2)) {
			Assert.assertEquals("Login page is not an open", str1, str2);
			System.out.println("Test case1 done");
		}
	}

	@Test(priority = 2)
	public void testCaseCloseLoginForm() {

		Assert.assertEquals("Login", objLoginWithEMail.closeLoginForm());
		System.out.println("Test case2 done");
	}

	@Test(priority = 3)
	public void testCaseOpenLoginForm() {

		Assert.assertEquals("Login page is not an open", objLoginWithEMail.openLoginPage(), "Login");
		System.out.println("Test case3 done");

	}

	@Test(priority = 4)
	public void testCaseOfLoginWithEmail() throws InterruptedException {

		String validationName = objLoginWithEMail.loginWithEmail(ConfigReader.getLoginEmail(),
				ConfigReader.getLoginPassword(), ConfigReader.getLoginVerificationName());
		Assert.assertEquals("login is not ", ConfigReader.getLoginVerificationName(), validationName);
		System.out.println("Test case4 done");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
