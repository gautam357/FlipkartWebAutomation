package com.flipkart.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;
import com.flipkart.configReader.ConfigReader;

public class LoginWithEmail extends TestBase {

	@FindBy(xpath = "//a[@class='_3Ep39l']")
	WebElement clickOnLoginForm;

	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	WebElement closeLoginForm;

	@FindBy(xpath = "//span[@class='_1hgiYz']//span[contains(text(),'Login')]")
	WebElement openLoginPageVerification;

	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	static
	WebElement inputLoginUsername;

	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	static
	WebElement inputLoginPassword;

	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	static
	WebElement loginSubmit;

	@FindBy(xpath = "//span[contains(text(),'Please enter valid Email ID')]")
	WebElement WrongEmailPasswordMessages;

	public static String dynomicLoginVerification(String userName) {
		return driver.findElement(By.xpath("//div[contains(text(),'" + userName + "')]")).getText();
	}

	public LoginWithEmail() {
		PageFactory.initElements(driver, this);
	}

	public String closeLoginForm() {
		closeLoginForm.click();
		return clickOnLoginForm.getText();

	}

	public String openLoginPage() {
		clickOnLoginForm.click();
		return openLoginPageVerification.getText();
	}

	private String loginWithEmail(String loginEmail, String pwd, String loginverificationName) throws InterruptedException {
		Thread.sleep(2000);
		inputLoginUsername.sendKeys(loginEmail);
		inputLoginPassword.sendKeys(pwd);
		loginSubmit.click();
		return dynomicLoginVerification(loginverificationName);
	}

	public String wrongEmailPassword(String loginEmail, String pwd, String loginverificationName) throws InterruptedException {
		Thread.sleep(2000);
		inputLoginUsername.sendKeys(loginEmail);
		inputLoginPassword.sendKeys(pwd);
		loginSubmit.click();
		return WrongEmailPasswordMessages.getText();
	}
	
	public void getLogin() throws InterruptedException {
		loginWithEmail(ConfigReader.getLoginEmail(), ConfigReader.getLoginPassword(),
				ConfigReader.getLoginVerificationName());
	}
}
