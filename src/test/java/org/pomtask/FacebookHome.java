package org.pomtask;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookHome extends BaseClass {
	public FacebookHome() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(name = "pass")
	private WebElement password;

	/*
	 * @FindBy(xpath = "//button[text()='Log in']") private WebElement loginBtn;
	 */

	@FindBys(
			@FindBy(xpath = "//button[text()='Log in']")
	)
	private List<WebElement> loginBtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public List<WebElement> getLoginBtn() {
		return loginBtn;
	}

}
