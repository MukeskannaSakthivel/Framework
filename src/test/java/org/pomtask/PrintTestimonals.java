package org.pomtask;

import java.time.Duration;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintTestimonals extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		windowMaxi();
		url("http://www.greenstechnologys.com/index.html");
		
		GreensHome g = new GreensHome();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		
		j.executeScript("arguments[0].click()", g.getCertifications());
		
		j.executeScript("arguments[0].click()", g.getSeleniumCourse());
		
		System.out.println(g.getTextContent().getText());
		
		
		
	}
}
