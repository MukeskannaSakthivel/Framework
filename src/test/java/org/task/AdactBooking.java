package org.task;

import java.io.IOException;
import java.time.Duration;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdactBooking extends BaseClass {
	public static void main(String[] args) throws IOException {
		
		String[][] data = {{"Check-In","Check-Out","FirstName","LastName","Address","Credit Card Number","Cvv"},
				{"22/8/2023","25/8/2023","Mukeskanna","Sakthivel","Erode","5333 6195 0371 5702","123"}};
		
		
		createExcelSheet("Adact", "Data");
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				createExcelRowsAndCells("Adact", "Data", i, j, data[i][j]);
			}
		}
		
		launchBrowser();
		windowMaxi();
		url("http://www.adactin.com/HotelApp/");
		
		textPass(elementLocatorById("username"), "vaithy2410");
		textPass(elementLocatorById("password"), "vaithy@2410");
		elementClick(elementLocatorById("login"));
		
		selByValue(elementLocatorById("location"), "London");
		selByValue(elementLocatorById("hotels"), "Hotel Sunshine");
		selByValue(elementLocatorById("room_type"), "Deluxe");
		selByValue(elementLocatorById("room_nos"), "1");
		elementClick(elementLocatorById("datepick_in"));
		selectAllText();
		textPass(elementLocatorById("datepick_in"), readDataFromExcel("Adact", "Date", 1, 0));
		elementClick(elementLocatorById("datepick_out"));
		selectAllText();
		textPass(elementLocatorById("datepick_out"), readDataFromExcel("Adact", "Date", 1, 1));
		
		selByValue(elementLocatorById("adult_room"), "2");
		selByValue(elementLocatorById("child_room"), "0");
		
		
		elementClick(elementLocatorById("Submit"));
		elementClick(elementLocatorById("radiobutton_0"));
		elementClick(elementLocatorById("continue"));
		
		textPass(elementLocatorById("first_name"), readDataFromExcel("Adact", "Details", 1, 2));
		textPass(elementLocatorById("last_name"), readDataFromExcel("Adact", "Details", 1, 3));
		textPass(elementLocatorById("address"), readDataFromExcel("Adact", "Details", 1, 4));
		textPass(elementLocatorById("cc_num"), readDataFromExcel("Adact", "Details", 1, 5));
		
		selByValue(elementLocatorById("cc_type"), "VISA");
		selByValue(elementLocatorById("cc_exp_month"), "8");
		selByValue(elementLocatorById("cc_exp_year"), "2030");
		
		textPass(elementLocatorById("cc_cvv"), readDataFromExcel("Adact", "Details", 1, 6));
		elementClick(elementLocatorById("book_now"));
		
		toWait();
		String orderNo = elementLocatorById("order_no").getAttribute("value");
		System.out.println(orderNo);
	}
}
