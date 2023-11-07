package org.pomtask;


import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Note3Task extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		windowMaxi();
		url("http://www.greenstechnologys.com/");
		
		GreensHome g = new GreensHome();
		Actions a = new Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(g.getCourse()).click().perform();
		Thread.sleep(5000);
		a.moveToElement(g.getJava()).click().perform();
		Thread.sleep(5000);
		a.moveToElement(g.getTestimonal()).perform();
		
		System.out.println(g.getTestimonal().getText());
		
	}
}
