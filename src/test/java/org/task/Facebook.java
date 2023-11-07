package org.task;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

public class Facebook extends BaseClass {
	public static void main(String[] args) throws IOException {
		String[][] datas = {{"Username","Password"},{"ravi@gmail.com","Ravi123"},{"praveen77@gmail.com","MsdIamSoCool7"},
				{"santhos","absanthosh6"}};
		
		createExcelSheet("Facebook", "Login");
		for(int i=0;i<datas.length;i++) {
			for(int j=0;j<datas[i].length;j++) {
				createExcelRowsAndCells("Facebook", "Login", i, j, datas[i][j]);
			}
		}
		
		launchBrowser();
		windowMaxi();
		url("https://www.facebook.com/");
		
		WebElement username = elementLocatorById("email");
		textPass(username,readDataFromExcel("Facebook", "Login", 1, 0));
		textPass(elementLocatorById("pass"), readDataFromExcel("Facebook", "Login", 1, 1));
		elementClick(elementLocatorByXpath("//button[text()='Log in']"));
		
	}
}
