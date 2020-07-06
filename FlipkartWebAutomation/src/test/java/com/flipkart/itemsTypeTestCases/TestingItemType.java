package com.flipkart.itemsTypeTestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.itemsType.ItemsType;
import com.flipkart.utilities.ExcelReader;

import junit.framework.Assert;

public class TestingItemType extends TestBase {

	ItemsType item;

	@BeforeTest
	public void setUp() {
		initialization();
		item = new ItemsType();
	}

	@Test
	public void test() throws IOException, InterruptedException {
		
		Assert.assertEquals("Item is not there", ExcelReader.getItemsTypeVErification(),
				item.listType(ExcelReader.getItemTypeName()));
	}

	public void tearDown() {
		driver.quit();
	}
}
