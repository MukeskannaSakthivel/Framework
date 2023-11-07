package org.pomtask;

import org.baseclass.BaseClass;
import org.openqa.selenium.JavascriptExecutor;

public class Note6Task extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		windowMaxi();
		url("http://www.greenstechnologys.com/");
		
		GreensHome g = new GreensHome();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",g.getContactUs() );
		
		System.out.println(g.getText1().getText());
		
		js.executeScript("arguments[0].scrollIntoView(true)", g.getText2());
		System.out.println(g.getText2().getText());
	}
}
