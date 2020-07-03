package com.flipkart.loginTest;

import java.io.IOException;
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
	public void setUp() {
		initialization();
		objLoginWithEMail = new LoginWithEmail();
	}

	@Test(priority = 1)
	public void testCaseOfWrongEmailPAssword() throws InterruptedException, IOException {
		Assert.assertEquals("Message is not showing", ExcelReader.getMessagesForWrongEmailPass(),
				objLoginWithEMail.wrongEmailPassword(ExcelReader.getWrongEmail(), ExcelReader.getWrongPassword(),
						ConfigReader.getLoginVerificationName()));
	}

	@Test(priority = 2)
	public void testCaseCloseLoginForm() {

		Assert.assertEquals("Login", objLoginWithEMail.closeLoginForm());
	}

	@Test(priority = 3)
	public void testCaseOpenLoginForm() {
		
		Assert.assertEquals("Login page is not an open", objLoginWithEMail.openLoginPage(), "Login");

	}

	@Test(priority = 4)
	public void testCaseOfLoginWithEmail() {

		String validationName = objLoginWithEMail.tsetCaseLoginWithEmail(ConfigReader.getLoginEmail(),
				ConfigReader.getLoginPassword(), ConfigReader.getLoginVerificationName());
		Assert.assertEquals("login is not ", ConfigReader.getLoginVerificationName(), validationName);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
