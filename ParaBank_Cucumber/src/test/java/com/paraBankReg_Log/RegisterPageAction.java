package com.paraBankReg_Log;

import org.openqa.selenium.support.PageFactory;

public class RegisterPageAction {

	RegisterPageLocators registerPageLocators;
	
	RegisterPageAction(){
		this.registerPageLocators = new RegisterPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), registerPageLocators);
	}
	
	public void setfirstName(String fname) {
		registerPageLocators.firstName.sendKeys(fname);
	}
	
	public void setlastName(String lname) {
		registerPageLocators.lastName.sendKeys(lname);
	}
	
	public void setaddress(String address) {
		registerPageLocators.address.sendKeys(address);
	}
	
	public void setcity(String city) {
		registerPageLocators.city.sendKeys(city);
	}
	
	public void setstate(String state) {
		registerPageLocators.state.sendKeys(state);
	}
	
	public void setzipcode(String zipcode) {
		registerPageLocators.zipCode.sendKeys(zipcode);
	}
	
	public void setphonenumber(String phonenumber) {
		registerPageLocators.phoneNumber.sendKeys(phonenumber);
	}
	
	public void setssn(String ssn) {
		registerPageLocators.ssn.sendKeys(ssn);	
	}
	
	public void setuserName(String userName) {
		registerPageLocators.userName.sendKeys(userName);
	}
	
	public void setpassword(String password) {
		registerPageLocators.password.sendKeys(password);
	}
	
	public void setconfirmPass(String confirmPass) {
		registerPageLocators.confirmPass.sendKeys(confirmPass);
	}
	
	public void setregister() {
		registerPageLocators.register.click();
	}
	
	public void fNameAndLName(String fname, String lname) {
		setfirstName(fname);
		setlastName(lname);
	}
	
	public void address(String address) {
		setaddress(address);

	}
	
	public void cityAndState(String city, String state) {
		setcity(city);
		setstate(state);
	}
	
	public void zip(String zipcode) {
		setzipcode(zipcode);
	}
	
	public void phNumber(String phonenumber) {
		setphonenumber(phonenumber);
	}
	
	public void ssnNumber(String ssn) {
		setssn(ssn);
	}
	
	public void userName(String userName) {
		setuserName(userName);
	}
	
	public void passAndConfirm(String password, String confirmPass) {
		setpassword(password);
		setconfirmPass(confirmPass);
	}
	
	
}
	
	
