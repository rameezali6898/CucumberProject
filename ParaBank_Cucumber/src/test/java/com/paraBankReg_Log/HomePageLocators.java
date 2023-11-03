package com.paraBankReg_Log;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(xpath="//p[text()='An internal error has occurred and has been logged.']") public WebElement registerMsg;
	@FindBy(xpath="//h1[text()=\"Accounts Overview\"]") public WebElement LoginverifyText;
	
}
