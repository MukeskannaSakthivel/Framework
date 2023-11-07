package org.pomtask;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensHome extends BaseClass {
	public GreensHome() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[contains(text(),'Our T')]")
	private WebElement lastLine;
	
	@FindBy(xpath="//h1[contains(text(),'No 1')]")
	private WebElement firstLine;
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certifications;
	
	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement seleniumCourse;
	
	@FindBy(xpath="//p[contains(text(),'Looking ')]")
	private WebElement textContent;
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement course;
	
	@FindBy(xpath="//img[@alt='Java Training']")
	private WebElement java;
	
	@FindBy(xpath = "//p[contains(text(),'I was a ')]")
	private WebElement testimonal;
	
	@FindBy(xpath = "//a[text()='Job Vacancy']")
	private WebElement career;
	
	@FindBy(xpath = "(//a[text()='contact@greenstechnologys.com'])[16]")
	private WebElement lastEmail;
	
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement contactUs;
	
	@FindBy(xpath = "//h3[text()='Our Main Branches In Chennai ']")
	private WebElement text1;
	
	@FindBy(xpath="//p[text()='Copyright © 2023 Greens Technology. All rights reserved.']")
	private WebElement text2;
	
	public WebElement getLastLine() {
		return lastLine;
	}

	public WebElement getFirstLine() {
		return firstLine;
	}

	public WebElement getCertifications() {
		return certifications;
	}

	public WebElement getSeleniumCourse() {
		return seleniumCourse;
	}

	public WebElement getTextContent() {
		return textContent;
	}

	public WebElement getCourse() {
		return course;
	}

	public WebElement getJava() {
		return java;
	}

	public WebElement getCareer() {
		return career;
	}

	public WebElement getTestimonal() {
		return testimonal;
	}

	public WebElement getLastEmail() {
		return lastEmail;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getText1() {
		return text1;
	}

	public WebElement getText2() {
		return text2;
	}
	
	
	
	
}
