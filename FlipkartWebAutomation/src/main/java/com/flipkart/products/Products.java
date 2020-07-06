package com.flipkart.products;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.flipkart.base.TestBase;
import com.flipkart.login.LoginWithEmail;
import com.flipkart.utilities.TestUtility;

public class Products extends TestBase {

	@FindBy(xpath = "//div[@class=\"_3zdbog _3Ed3Ub\"]//ul//li[@class='Wbt_B2 _1YVU3_']")
	List<WebElement> listDataTyps;

	public Products() {
		PageFactory.initElements(driver, this);
	}

	public void contentTyps(String actualContentName) throws InterruptedException {
		LoginWithEmail loginWithId = new LoginWithEmail();
		loginWithId.getLogin();
		int cotentSize = listDataTyps.size();
		System.out.println(cotentSize);
		System.out.println(actualContentName);

		for (WebElement listDataTyp : listDataTyps) {
			String contentNameFromList = listDataTyp.getText();

			System.out.println(contentNameFromList);

			if (contentNameFromList.equalsIgnoreCase(actualContentName)) {
				TestUtility.moveToElement(listDataTyp);
			}
		}
	}

}
