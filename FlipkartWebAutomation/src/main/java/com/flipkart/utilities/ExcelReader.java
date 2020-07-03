package com.flipkart.utilities;

import java.io.IOException;

import com.flipkart.configReader.ConfigReader;

public class ExcelReader {

	public static String getWrongEmail() throws IOException {
		return ExcelDataProvider.getExelData("wrongEmail", ConfigReader.getSeetName()).get(1);
	}

	public static String getWrongPassword() throws IOException {
		return ExcelDataProvider.getExelData("wrongPassForPass", ConfigReader.getSeetName()).get(1);
	}

	public static String getMessagesForWrongEmailPass() throws IOException {

		return ExcelDataProvider.getExelData("wrongMessagesShowing", ConfigReader.getSeetName()).get(1);
	}

	public static String getItemTypeName() throws IOException {
		return ExcelDataProvider.getExelData("itemTypeName", ConfigReader.getSeetName()).get(1);
	}

	public static String getItemsTypeVErification() throws IOException {
		return ExcelDataProvider.getExelData("itemsTypeVerification", ConfigReader.getSeetName()).get(1);
	}
}
