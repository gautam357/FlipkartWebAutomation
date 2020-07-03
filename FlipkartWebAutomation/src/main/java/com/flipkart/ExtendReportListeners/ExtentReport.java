package com.flipkart.ExtendReportListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	private static final String OUTPUT_FOLDER = "./Reports/";
	private static final String FILE_NAME = "Extent1.html";
	static ExtentReports extent;

	public static ExtentReports extentReport() {
		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(OUTPUT_FOLDER + FILE_NAME);
		extent = new ExtentReports();
		htmlReporter.config().setReportName("Web Automation Results");
		htmlReporter.config().setDocumentTitle("Test Results");
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Tester", "Rahul Shetty");
		return extent;
	}
}
