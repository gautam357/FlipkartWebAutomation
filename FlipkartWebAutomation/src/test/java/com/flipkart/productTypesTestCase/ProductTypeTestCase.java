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
	public void testCaseProductType() throws IOException, InterruptedException {
		item.productType(ExcelReader.getProductType());
//		Assert.assertEquals("Item is not there", ExcelReader.getProductType(),
//				item.productType(ExcelReader.getProductType()));
	}

//	public void tearDown() {
//		driver.quit();
//	}
}
