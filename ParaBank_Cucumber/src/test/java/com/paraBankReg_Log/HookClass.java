package com.paraBankReg_Log;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass {

	@Before
	public static void setUpDriver() {
		HelperClass.setUpDriver();
	}
	@After
	public static void teardown(Scenario scenario) {
		HelperClass.teardown();
	}
 
 
}
