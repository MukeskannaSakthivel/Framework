package org.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintAllDatas {
	public static void main(String[] args) throws IOException {
		File f = new File("src\\test\\resources\\sheet\\StudentsData.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet sheet = book.getSheet("Data");
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if(cellType == 1)
				{
					//to get a string value
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if(DateUtil.isCellDateFormatted(cell))
				{
					Date d = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd,MMMM,YYYY");
					String value = s.format(s);
					System.out.println(value);
				}
				else
				{
					double d = cell.getNumericCellValue();
					long l = (long)d;
					String value = String.valueOf(l);
					System.out.println(value);
				}
			}
		}
	}

}
