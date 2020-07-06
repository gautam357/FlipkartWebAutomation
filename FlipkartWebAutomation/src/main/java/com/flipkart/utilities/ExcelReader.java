package com.flipkart.utilities;

import java.io.IOException;

public class ExcelReader {

	public static String getWrongEmail() throws IOException {
		return ExcelDataProvider.getExelData("wrongEmail", "TestingData").get(1);
	}

	public static String getWrongPassword() throws IOException {
		return ExcelDataProvider.getExelData("wrongPassForPass", "TestingData").get(1);
	}

	public static String getMessagesForWrongEmailPass() throws IOException {

		return ExcelDataProvider.getExelData("wrongMessagesShowing", "TestingData").get(1);
	}

	public static String getItemTypeName() throws IOException {
		return ExcelDataProvider.getExelData("itemTypeName", "TestingData").get(1);
	}

	public static String getItemsTypeVErification() throws IOException {
		return ExcelDataProvider.getExelData("itemsTypeVerification", "TestingData").get(1);
	}

	public static String getContentType() throws IOException {
		return ExcelDataProvider.getExelData("productName", "TestingData").get(1);
	}

}
