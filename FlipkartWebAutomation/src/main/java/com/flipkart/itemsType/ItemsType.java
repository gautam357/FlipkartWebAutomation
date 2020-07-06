package com.flipkart.itemsType;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;
import com.flipkart.configReader.ConfigReader;
import com.flipkart.login.LoginWithEmail;

public class ItemsType extends TestBase {

	@FindBy(xpath = "//div[@class='_3zdbog _3Ed3Ub']//ul//li[@class='Wbt_B2 _1YVU3_']")
	List<WebElement> itemsType;

	@FindBy(xpath = "//li[@class=\"_1KCOnI _2BfSTw _1h5QLb _3ZgIXy\"]/a[@title='Mobiles']")
	WebElement verificationOfListType;

	public ItemsType() {
		PageFactory.initElements(driver, this);
	}

	public String listType(String itemTypeName) throws InterruptedException {
		LoginWithEmail loginWithId = new LoginWithEmail();
		loginWithId. getLogin();
		List<WebElement> lists = itemsType;
		for (WebElement list : lists) {
			String str = list.getText();
			if (str.equalsIgnoreCase(itemTypeName)) {
				Actions act = new Actions(driver);
				act.moveToElement(list).build().perform();
			}
		}
		return verificationOfListType.getText();
	}

}
