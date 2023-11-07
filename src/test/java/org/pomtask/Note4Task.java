package org.pomtask;

import org.baseclass.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class Note4Task extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		windowMaxi();
		url("http://www.greenstechnologys.com/");
		
		GreensHome g = new GreensHome();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", g.getCareer());
		
		j.executeScript("arguments[0].scrollIntoView(false)", g.getLastEmail());
		System.out.println(g.getLastEmail().getText());
		
	
	}
}
