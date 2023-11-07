package org.pomtask;

import org.baseclass.BaseClass;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook extends BaseClass {
	public static void main(String[] args) {
		//launchBrowser();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		windowMaxi();
		url("https://www.facebook.com/");
		
		FacebookHome lp = new FacebookHome();
//		textPass(lp.getUsername(),"Ravi");
//		textPass(lp.getPassword(), "Kumar");
		System.out.println(lp.getLoginBtn().size());
		
	}
}
