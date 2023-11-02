package com.orangeHRM;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefenitions {

	DataProperties data = new DataProperties();
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHome = new HomePageActions();
	@Given("User is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
		HelperClass.openPage(data.url);
	    System.out.println("login page");		
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() {
		objLogin.loginInfo(data.username, data.password);
	   System.out.println("Username and password");
	}
	@When("User clicks login button")
	public void user_clicks_login_button() {
		objLogin.clickLogin();
	   System.out.println("login button");
	}
	@Then("USer Should be able to login sucessfully and Home page opens")
	public void u_ser_should_be_able_to_login_sucessfully_and_home_page_opens() {
		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
	   System.out.println("sucessfull login");
	}

 
}
