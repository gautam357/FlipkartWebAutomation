package com.flipkart.mobiles;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;
import com.flipkart.productTypes.ProductType;
import com.flipkart.utilities.ExcelReader;

public class SamsungMob extends TestBase {
	@FindBy(xpath = "//h1[@class='_30P0WS'][contains(text(),'Samsung Mobile Phone')]")
	WebElement samsungOpenPageMessage;

	public SamsungMob() {
		PageFactory.initElements(driver, this);
	}

	public String openSamsungMobPage() throws InterruptedException, IOException {
		ProductType objProdType = new ProductType();
		objProdType.openProduct(ExcelReader.getProductSamsung());
		System.out.println(samsungOpenPageMessage.getText());
		return samsungOpenPageMessage.getText();
	}
}
