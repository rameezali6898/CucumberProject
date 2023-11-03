package com.runnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/loginParaBank.feature", glue = "com.paraBankReg_Log")

public class JUnitRunner {

}
