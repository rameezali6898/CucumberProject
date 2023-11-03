package com.paraBankReg_Log;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegPageStepDefinition {

	RegisterPageAction regact = new RegisterPageAction();
	UtilityClass1 utc1 = new UtilityClass1();
	HomePageAction homeact = new HomePageAction();
	
	@Given("User is on ParaBank Register page")
	public void user_is_on_para_bank_register_page() {
	   HelperClass.openPage(utc1.Url);
	   System.out.println("Url");
	}

	@When("User Enters the Valid FirstName and LastName")
	public void user_enters_the_valid_first_name_and_last_name() {
	    regact.fNameAndLName(utc1.FName, utc1.LName);
		   System.out.println("First and LastName");
	}

	@When("User Enters the proper Address")
	public void user_enters_the_proper_address() {
		regact.address(utc1.Add);
		   System.out.println("Address");
	   	}

	@When("User Enters the correct City and State")
	public void user_enters_the_correct_city_and_state() {
	   regact.cityAndState(utc1.City, utc1.State);
	   System.out.println("City and State");
	}

	@When("User Enters the ZIP code")
	public void user_enters_the_zip_code() {
	    regact.zip(utc1.Zip);
		   System.out.println("ZipCode");

	}

	@When("User Enters the Valid PhoneNumber")
	public void user_enters_the_valid_phone_number() {
	    regact.phNumber(utc1.Phone);
		   System.out.println("PhoneNumber");
	}

	@When("User give proper SSN")
	public void user_give_proper_ssn() {
	    regact.ssnNumber(utc1.SSN);
		   System.out.println("SSN Number");

	}

	@When("User Give Valid USERNAME")
	public void user_give_valid_username() {
	   regact.userName(utc1.User);
	   System.out.println("UserName");
	}

	@When("User Give Valid PASSWORD and CONFIRM PASSWORD")
	public void user_give_valid_password_and_confirm_password() {
	   regact.passAndConfirm(utc1.Pass, utc1.Conf);
	   System.out.println("Password and ConfirmPassword");

	}

	@When("user click the Registration button")
	public void user_click_the_registration_button() {
	    regact.setregister();
		   System.out.println("Registered");
	}

	@Then("Successfully register the Registration")
	public void successfully_register_the_registration() {
		Assert.assertTrue(homeact.getRegisterText().contains("This username already exists."));
		System.out.println("Username already exist");
	}



}
