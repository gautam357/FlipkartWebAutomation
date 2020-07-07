package com.flipkart.productTypes;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;
import com.flipkart.configReader.ConfigReader;
import com.flipkart.login.LoginWithEmail;
import com.flipkart.products.Products;
import com.flipkart.utilities.ExcelReader;
import com.flipkart.utilities.TestUtility;

public class ProductType extends TestBase {

	@FindBy(xpath = "//ul[@class='QPOmNK']//li[@class='_1KCOnI _3ZgIXy']//a")
	static List<WebElement> productTypes;

	@FindBy(xpath = "//li[@class=\"_1KCOnI _2BfSTw _1h5QLb _3ZgIXy\"]/a[@title='Mobiles']")
	WebElement verificationOfListType;

	public ProductType() {
		PageFactory.initElements(driver, this);
	}

	public <T> Object productType(String productName, Object productTypeClass)
			throws InterruptedException, IOException {
		Products product = new Products();
		product.productTyps(ExcelReader.getProduct());
		for (WebElement productType : productTypes) {
			String productTypeListName = productType.getText();
			if (productTypeListName.equalsIgnoreCase(productName)) {
				productType.click();
				break;
			}
		}
		return productTypeClass;
	}

}
