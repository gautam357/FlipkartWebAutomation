package com.flipkart.utilities;

import java.io.IOException;
import java.util.ArrayList;

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

	public static String getProductSamsung() throws IOException {
		return ExcelDataProvider.getExelData("productTypeName", "TestingData").get(1);
	}

	public static String getSamsungPageVerificationMessages() throws IOException {
		return ExcelDataProvider.getExelData("samsungPageVerificationMessage", "TestingData").get(1);
	}

	public static String getProductApple() throws IOException {
		return ExcelDataProvider.getExelData("productTypeName", "TestingData").get(2);
	}
	
	public static String getApplePageVerificationMessage() throws IOException {
		return ExcelDataProvider.getExelData("AppleMobPageVerificationMessage", "TestingData").get(1); 
	}
	
	public static ArrayList<String> getBestBatteryPhones() throws IOException{
		ArrayList<String> phoneList = new ArrayList<String>();
		for(int i=0; i<5; i++) {
			phoneList.add(ExcelDataProvider.getExelData("bestBatteryPhones", "TestingData").get(i));
		}
		return 	phoneList;
	}
}
