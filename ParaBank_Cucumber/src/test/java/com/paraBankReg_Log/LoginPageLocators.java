package com.paraBankReg_Log;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	@FindBy(xpath="//input[@name=\"username\"]")
	public WebElement username;
	@FindBy(xpath="//input[@name=\"password\"]")
	public WebElement Password;
	@FindBy(xpath="//input[@value=\"Log In\"]")
	public WebElement login;

}
