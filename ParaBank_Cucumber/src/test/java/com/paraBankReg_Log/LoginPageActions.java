package com.paraBankReg_Log;

import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {

	LoginPageLocators loginPageLocators=null;
	
	
	
	public LoginPageActions() {
		this.loginPageLocators=new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
	}
	
	public void setUserName(String strUserName) {
		loginPageLocators.username.sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		loginPageLocators.Password.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	
	
	public void login(String username, String password) {
		
		
		this.setUserName(username);
		this.setPassword(password);
	}
}
