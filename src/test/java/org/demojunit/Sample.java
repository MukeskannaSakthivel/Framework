package org.demojunit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	
	public static WebDriver driver;
	@BeforeClass
	public static void browserLaunch() {
		/*WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();*/
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	/*@AfterClass
	public static void closeBrowser() {
		driver.close();
	}*/
	
	@Test
	public void testCase1() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("11111111");
		driver.findElement(By.id("pass")).sendKeys("111111111");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
}
