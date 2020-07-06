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

	public static String getProductTypeVerification() throws IOException {
		return ExcelDataProvider.getExelData("productTypeVerification", "TestingData").get(1);
	}

	public static String getProduct() throws IOException {
		return ExcelDataProvider.getExelData("productName", "TestingData").get(1);
	}
	
	public static String getProductType() throws IOException{
		return ExcelDataProvider.getExelData("productTypeName", "TestingData").get(1);
	}

}
