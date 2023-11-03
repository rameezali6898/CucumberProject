package com.paraBankReg_Log;

import org.openqa.selenium.support.PageFactory;

public class HomePageAction {

	HomePageLocators homepagelocators;
	
	public HomePageAction() {
		this.homepagelocators = new HomePageLocators();
		PageFactory.initElements(HelperClass.getDriver(), homepagelocators);
	}
	
	public String getRegisterText() {
		return homepagelocators.registerMsg.getText();
	}
	
	public String getLoginText() {
		return homepagelocators.LoginverifyText.getText();
	}
}
