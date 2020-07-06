package com.flipkarts.productsTesting;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.flipkart.base.TestBase;
import com.flipkart.products.Products;
import com.flipkart.utilities.ExcelReader;

public class ProductsTesting extends TestBase {

	Products contentObj;

	@BeforeTest
	public void setUp() {
		initialization();
		contentObj = new Products();
	}

	@Test
	public void testContentTypes() throws IOException, InterruptedException {
		contentObj.productTyps(ExcelReader.getProduct());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
