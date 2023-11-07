package org.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowsAndColums {
	public static void main(String[] args) throws IOException {
		File f = new File("src\\test\\resources\\sheet\\StudentsData.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		
		Sheet sheet = book.getSheet("Data");
		
		int totalRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Rows : "+totalRows);
		
		int totalCells=0;
		for(int i=0;i<totalRows;i++) {
			Row row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			totalCells += cells;
		}
		System.out.println("Total Cells :"+totalCells);
		
		
	}
}
