package com.flipkart.mobiles;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;
import com.flipkart.productTypes.ProductType;
import com.flipkart.utilities.ExcelReader;

public class AppleMob extends TestBase {

	@FindBy(xpath = "//h1[@class='_30P0WS'][contains(text(),'Apple Store')]")
	WebElement messageOpenAppleMobPage;

	/*
	 * Initialize the WebElament variable
	 */
	public AppleMob() {

		PageFactory.initElements(driver, this);
	}

	/*
	 * click on the Apple mob button and It will return message of Apple page
	 */
	public String openAppleMobilePage() throws InterruptedException, IOException {
		ProductType objProdType = new ProductType();
		objProdType.openProduct(ExcelReader.getProductApple());
		return messageOpenAppleMobPage.getText();
	}
}
