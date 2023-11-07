package org.demojunit;

import java.util.Date;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pomtask.AdactHome;

public class LoginClass extends BaseClass {
	static String[][] data = {{"username","password","Location","Hotel","Room-Type","NoOfRoom","Check-In","Check-Out","No Of Adult","No Of Children","FirstName","LastName","Address","Credit Card Number","Card Type","Exp-Month","Exp-Year","Cvv"},
			{"vaithy2410","vaithy@2410","London","Hotel Hervey","Double","1","22/8/2023","25/8/2023","2","0","Mukeskanna","Sakthivel","Erode","5333 6195 0371 5702","VISA","8","2029","123"}};
	
	
	
	AdactHome a = new AdactHome();
	@BeforeClass
	public static void launchChrome() {
		createExcelSheet("Adact", "Data");
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				createExcelRowsAndCells("Adact", "Data", i, j, data[i][j]);
			}
		}
		launchBrowser();
		windowMaxi();
	}
	
	@AfterClass
	public static void close() {
		driver.close();
	}
	@Before
	public void beforeTest() {
		System.out.println("Test Starts ........"+new Date()+"\n");
		
	}
	
	@After
	public void afterTest() {
		System.out.println("...... Test Ends "+new Date()+"\n");
	}
	
	@Test
	public void testCase1() {
		url("http://adactinhotelapp.com/");
		String url = driver.getCurrentUrl();
		textPass(a.getUsername(), readDataFromExcel("Adact", "Data", 1, 0));
		textPass(a.getPassword(),readDataFromExcel("Adact", "Data", 1, 1) );
		Assert.assertEquals("Enter Valid Username","vaithy2410", a.getUsername().getAttribute("value"));
		Assert.assertEquals("Password Not Correct", "vaithy@2410", a.getPassword().getAttribute("value"));
		elementClick(a.getLogin());
		System.out.println(url);
		System.out.println(driver.getCurrentUrl());
		Assert.assertNotEquals("Next Page not Loaded", url, driver.getCurrentUrl());
	}
	@Test
	public void testCase2() {
		String url = driver.getCurrentUrl();
		
		selByValue(a.getLocation(), readDataFromExcel("Adact", "Data", 1, 2));
		Assert.assertEquals("Select Particular Location", "London", a.getLocation().getAttribute("value"));
		selByValue(a.getHotels(), readDataFromExcel("Adact", "Data", 1, 3));
		selByValue(a.getRoomType(), readDataFromExcel("Adact", "Data", 1, 4));
		selByValue(a.getNoOfRooms(), readDataFromExcel("Adact", "Data", 1, 5));
		elementClick(a.getCheckIn());
		selectAllText();
		textPass(a.getCheckIn(), readDataFromExcel("Adact", "Data", 1, 6));
		elementClick(a.getCheckOut());
		selectAllText();
		textPass(a.getCheckOut(), readDataFromExcel("Adact", "Data", 1, 7));
		selByValue(a.getAdultPerRoom(), readDataFromExcel("Adact", "Data", 1, 8));
		selByValue(a.getChildPerRoom(), readDataFromExcel("Adact", "Data", 1, 9));
		elementClick(a.getSearch());
		Assert.assertNotEquals("Next Page not Loaded", url, driver.getCurrentUrl());
	}
	@Test
	public void testCase3() {
		String url = driver.getCurrentUrl();
		elementClick(a.getRadioBtn());
		elementClick(a.getCont());
		Assert.assertNotEquals("Next Page not Loaded", url, driver.getCurrentUrl());
	}
	@Test
	public void testCase4() {
		String url = driver.getCurrentUrl();
		textPass(a.getFirstName(), readDataFromExcel("Adact", "Data", 1, 10));
		textPass(a.getLastName(), readDataFromExcel("Adact", "Data", 1, 11));
		textPass(a.getAddress(), readDataFromExcel("Adact", "Data", 1, 12));
		textPass(a.getCardNumber(), readDataFromExcel("Adact", "Data", 1, 13));
		selByValue(a.getCardType(),readDataFromExcel("Adact", "Data", 1, 14) );
		selByValue(a.getMonth(), readDataFromExcel("Adact", "Data", 1, 15));
		selByValue(a.getYear(), readDataFromExcel("Adact", "Data", 1, 16));
		textPass(a.getCvv(), readDataFromExcel("Adact", "Data", 1, 17));
		elementClick(a.getBookNow());
		
	}
	@Test
	public void testCase5() {
		toWait();
		String orderNo = a.getOrderNo().getAttribute("value");
		
		
		createExcelRowsAndCells("Adact", "Data", 0, 18, "orderNo");
		createExcelRowsAndCells("Adact", "Data", 1, 18, orderNo);
	}
	
	
}
