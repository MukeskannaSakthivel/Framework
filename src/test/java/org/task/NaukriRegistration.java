package org.task;

import java.io.IOException;

import org.baseclass.BaseClass;

public class NaukriRegistration extends BaseClass{
	public static void main(String[] args) throws IOException {
		String[][] details = {{"Full Name", "Mukeskanna"},{"Email Id","mukes@gmail.com"},
				{"Password","12345678"},{"Mobile Number","74181983"}};
		
		createExcelSheet("Naukri", "RegDetails");
		for(int i=0;i<details.length;i++) {
			for(int j=0;j<details[i].length;j++) {
				createExcelRowsAndCells("Naukri", "RegDetails", i, j, details[i][j]);
			}
		}
		
		launchBrowser();
		windowMaxi();
		url("https://www.naukri.com/registration/createAccount");
		
		
		textPass(elementLocatorById("name"), readDataFromExcel("Naukri", "RegDetails", 0, 1));
		textPass(elementLocatorByName("email"), readDataFromExcel("Naukri", "RegDetails", 1, 1));
		textPass(elementLocatorById("password"), readDataFromExcel("Naukri", "RegDetails", 2, 1));
		textPass(elementLocatorById("mobile"), readDataFromExcel("Naukri", "RegDetails", 3, 1));
		
		elementClick(elementLocatorByXpath("//div[@data-val='exp']"));
		elementClick(elementLocatorByXpath("//button[text()='Register now']"));
		
		
	}
}
