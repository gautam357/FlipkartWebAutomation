package com.flipkart.configReader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConFigReader {
	public static Properties prop;

	public static String configReader() {
		try {
			prop = new Properties();
			InputStream input = new FileInputStream(
					"/Users/drivezy/git/FlipkartWebAutomation/FlipkartWebAutomation/src/main/java/com/flipkart/config/config.properties");
			prop.load(input);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());

			System.out.println(exp.getCause());

			exp.printStackTrace();

		}
		return prop.getProperty("browser");
	}

	public static String getUrl() {
		return prop.getProperty("url");
	}

	public static String getLoginEmail() {
		return prop.getProperty("loginEmail");
	}

	public static String getLoginPassword() {
		return prop.getProperty("loginPassword");
	}

	public static String getLoginVerificationName() {
		return prop.getProperty("loginVerificationName");
	}
}
