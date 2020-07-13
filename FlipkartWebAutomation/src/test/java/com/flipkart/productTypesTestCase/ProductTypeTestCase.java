package com.flipkart.productTypesTestCase;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.flipkart.base.TestBase;
import com.flipkart.productTypes.ProductType;
import com.flipkart.utilities.ExcelReader;
import junit.framework.Assert;

public class ProductTypeTestCase extends TestBase {

	ProductType item;

	@BeforeTest
	public void setUp() {
		initialization();
		item = new ProductType();
	}

	@Test
	public void testCaseProductType() throws IOException, InterruptedException, ClassNotFoundException {
		Object productTypeObject = item.productType(ExcelReader.getProductSamsung(),
				(Object) (ExcelReader.getProductSamsung()));
		Assert.assertEquals(productTypeObject, (Object) (ExcelReader.getProductSamsung()));

	}

	public void tearDown() {
		driver.quit();
	}
}
