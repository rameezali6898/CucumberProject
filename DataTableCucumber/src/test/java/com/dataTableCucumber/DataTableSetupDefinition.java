package com.dataTableCucumber;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSetupDefinition {

	WebDriver driver;
	@Before
	public void browserlaunch() {
		System.out.println("------------------------Before Execution----------------------------------");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("----start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
	}
	@Given("User is on OrangeHRM login webpage")
	public void user_is_on_orange_hrm_login_webpage() {
				    driver.get("https://opensource-demo.orangehrmlive.com/");
		}
	
 
	@When("user must provide the correct credentials")
	public void user_must_provide_the_correct_credentials(DataTable dataTable)throws InterruptedException {
		System.out.println("Credentials Entered");
	    List<Map<String,String>> signUpForm = dataTable.asMaps(String.class, String.class);
	    for(Map<String,String> form : signUpForm) {
	    	String username = form.get("Username");
	    	System.out.println("Username:" +username);
	    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	    	
	    	String password = form.get("Password");
	    	System.out.println("Password:" +password);
	    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	    	
	    	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	    }
	}
 
	@Then("user is able to login sucessfully and see homepage")
	public void user_is_able_to_login_sucessfully_and_see_homepage() {
		String homepageText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
	    System.out.println("HomePageHeader:" +homepageText);
	    Assert.assertTrue(homepageText.equals("Dashboard"));
	}
	@Then("User should be able to see unsucessfull with error message")
	public void user_should_be_able_to_see_unsucessfull_with_error_message() {
		String invalidMessage = driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']")).getText();
		 Assert.assertTrue(invalidMessage.equals("Invalid credentials"));
		 System.out.println("Expected Error Message:" +invalidMessage);
	}
	
}
