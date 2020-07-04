package com.flipkart.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static ArrayList<String> getExelData(String testData, String sheetName) throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		// This is for path for excel file
		FileInputStream inputfile = new FileInputStream(
				"/Users/drivezy/git/FlipkartWebAutomation/FlipkartWebAutomation/src/main/java/com/flipkart/testdata/TestingData.xlsx");

		// Get the all Sheets
		// Count the Sheets
		// Loops for the Sheets
		XSSFWorkbook objworkbook = new XSSFWorkbook(inputfile);
		int sheetCount = objworkbook.getNumberOfSheets();

		for (int i = 0; i < sheetCount; i++) {

			if (objworkbook.getSheetName(i).equalsIgnoreCase(sheetName)) {

				// Get the one sheet in the sheet
				// Identify column by scanning form first Row
				XSSFSheet sheet = objworkbook.getSheetAt(i); // XSSFSheet: Is a class representing a sheet in an XLSX
																// file.
				Iterator<Row> rows = sheet.iterator();
				/**
				 * get the one row. get the all column in the first row in the columns
				 * variables. check the Condition next column or not. get the one column. check
				 * the condition for column.
				 * 
				 */
				Row firstRow = rows.next();
				Iterator<Cell> columns = firstRow.cellIterator();
				int k = 0;
				int columnNumber = 0;
				while (columns.hasNext()) {
					Cell column = columns.next();
					if (column.getStringCellValue().equalsIgnoreCase("testData")) {
						columnNumber = k;
					}
					k++;
				}
				// Once column is identified then scan entry test case column to identify
				while (rows.hasNext()) {
					Row row = rows.next();
					if (row.getCell(columnNumber).getStringCellValue().equalsIgnoreCase(testData)) {
						// After you grab particular column row = pull all the data of that row and feed
						// into test
						Iterator<Cell> cv = row.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellType() == Cell.CELL_TYPE_STRING) {
								al.add(c.getStringCellValue());

							} else {
								al.add(NumberToTextConverter.toText(c.getNumericCellValue()));

							}

						}
					}
				}
			}
		}
		return al;
	}
}
