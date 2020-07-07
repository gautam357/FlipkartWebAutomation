package com.flipkart.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void getData() throws IOException {

		FileInputStream fl = new FileInputStream(
				"/Users/drivezy/git/FlipkartWebAutomation/FlipkartWebAutomation/src/main/java/com/flipkart/testdata/TestingData.xlsx");
		XSSFWorkbook objexcel = new XSSFWorkbook(fl);
		int numberOfSheet = objexcel.getNumberOfSheets();
		for (int i = 0; i < numberOfSheet; i++) {
			if (objexcel.getSheetName(i).equalsIgnoreCase("TestingData")) {

				XSSFSheet sheet = objexcel.getSheetAt(i);
				Iterator<Row> rowSheet = sheet.iterator();
				Row firstRow = rowSheet.next();
				Iterator<Cell> colIterator = firstRow.iterator();
				
				int k = 0;
//				while (colIterator.hasNext()) {
//					System.out.println(colIterator.next());
//					k++;
//				}
				
				while(rowSheet.hasNext()) {
					
					Iterator<Cell> cells = firstRow.iterator();
					
					
					while(cells.hasNext()) {
						
						System.out.println(cells.next());
					}
				}

			}
		}
	}

	public static void main(String[] args) throws IOException {
		getData();
	}
}
