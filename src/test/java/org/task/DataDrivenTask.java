package org.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTask {
	public static void main(String[] args) throws IOException {
		List<String> studentName = new ArrayList<String>();
		studentName.add("mukes");
		studentName.add("santhosh");
		studentName.add("praveen");
		studentName.add("saravana");
		studentName.add("naren");
		studentName.add("dheepak");
		studentName.add("karthi");
		studentName.add("thiru");
		studentName.add("Suriya");
		
		List<String> course = new ArrayList<String>();
		course.add("course");
		course.add("sql");
		course.add("java");
		course.add("python");
		course.add("ruby");
		course.add("javascript");
		course.add("c");
		course.add("c++");
		course.add("c#");
		course.add("react");
		course.add("angular");
		
		File f = new File("C:\\Users\\KALAIVANI\\eclipse-workspace\\Framework\\src\\test\\resources\\sheet\\StudentData.xlsx");

		
		Workbook book = new XSSFWorkbook();
		
		Sheet sheet = book.createSheet("StudentsData");
		
		Cell cell;
		Row row;
		for(int i=0;i<studentName.size();i++) {
			int column=0;
			row = sheet.createRow(i);
			
			cell = row.createCell(column);
			
			cell.setCellValue(studentName.get(i));
			column++;
			cell = row.createCell(column);
			cell.setCellValue(course.get(i));
		}
		
		
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
	}
}
