package org.sample;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		windowMaxi();
		url("http://www.adactin.com/HotelApp/");
		
		textPass(elementLocatorById("username"), "vaithy2410");
		textPass(elementLocatorById("password"), "vaithy@2410");
		elementClick(elementLocatorById("login"));
		List<WebElement> select = driver.findElements(By.tagName("select"));
	
		
	
	
	}
}
