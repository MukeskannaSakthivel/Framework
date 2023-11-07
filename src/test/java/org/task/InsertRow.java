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

public class InsertRow {
	public static void main(String[] args) throws IOException {
File f = new File("src\\test\\resources\\sheet\\StudentsData.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		
		Sheet sheet = book.getSheet("Data");
		
		int totalRows = sheet.getPhysicalNumberOfRows();
		
		Row row = sheet.createRow(totalRows-1);
		Cell c = row.createCell(0);
		Cell c1 = row.createCell(1);
		
		c.setCellValue("Kavin");
		c1.setCellValue("nodejs");
		
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
	}
}
