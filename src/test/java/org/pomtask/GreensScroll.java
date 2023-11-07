package org.pomtask;

import org.baseclass.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class GreensScroll extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		windowMaxi();
		url("http://www.greenstechnologys.com/index.html");
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		GreensHome g = new GreensHome();
		j.executeScript("arguments[0].scrollIntoView(true)", g.getLastLine());
		System.out.println("\n" +g.getLastLine().getText());
		
		j.executeScript("arguments[0].scrollIntoView(true)", g.getFirstLine());
		System.out.println("\n" + g.getFirstLine().getText());
	
		
	}
}
