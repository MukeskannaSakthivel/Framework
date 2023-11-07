package org.pomtask;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactBooking extends BaseClass{
	public static void main(String[] args) throws IOException {
		
		String[][] data = {{"Check-In","Check-Out","FirstName","LastName","Address","Credit Card Number","Cvv"},
				{"22/8/2023","25/8/2023","Mukeskanna","Sakthivel","Erode","5333 6195 0371 5702","123"}};
		
		
		
		createExcelSheet("Adact", "Data");
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				createExcelRowsAndCells("Adact", "Data", i, j, data[i][j]);
			}
		}
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		windowMaxi();
		url("http://www.adactin.com/HotelApp/");
		
		AdactHome a = new AdactHome();
		
		textPass(a.getUsername(),"vaithy2410");
		textPass(a.getPassword(), "vaithy@2410");
		
		elementClick(a.getLogin());
		
		selByValue(a.getLocation(), "London");
		selByValue(a.getHotels(), "Hotel Sunshine");
		selByValue(a.getRoomType(), "Deluxe");
		selByValue(a.getNoOfRooms(), "1");
		
		elementClick(a.getCheckIn());
		selectAllText();
		textPass(a.getCheckIn(), readDataFromExcel("Adact", "Data", 1, 0));
		elementClick(a.getCheckOut());
		selectAllText();
		textPass(a.getCheckOut(), readDataFromExcel("Adact", "Data", 1, 1));
		
		selByValue(a.getAdultPerRoom(), "2");
		selByValue(a.getChildPerRoom(), "0");
		
		elementClick(a.getSearch());
		
		elementClick(a.getRadioBtn());
		elementClick(a.getCont());
		
		textPass(a.getFirstName(), readDataFromExcel("Adact", "Data", 1, 2));
		textPass(a.getLastName(), readDataFromExcel("Adact", "Data", 1, 3));
		textPass(a.getAddress(), readDataFromExcel("Adact", "Data", 1, 4));
		textPass(a.getCardNumber(), readDataFromExcel("Adact", "Data", 1, 5));
		selByValue(a.getCardType(), "VISA");
		selByValue(a.getMonth(), "8");
		selByValue(a.getYear(), "2030");
		textPass(a.getCvv(), readDataFromExcel("Adact", "Data", 1, 6));
		elementClick(a.getBookNow());
		
		toWait();
		String orderNo = a.getOrderNo().getAttribute("value");
		
		
		createExcelRowsAndCells("Adact", "Data", 0, 7, "orderNo");
		createExcelRowsAndCells("Adact", "Data", 1, 7, orderNo);
		
	}
}
