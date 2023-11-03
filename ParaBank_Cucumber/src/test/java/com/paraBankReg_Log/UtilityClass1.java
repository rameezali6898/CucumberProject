package com.paraBankReg_Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass1 {

	String Url,FName,LName,Add,City,State,Zip,Phone,SSN,User,Pass,Conf;
	
	public UtilityClass1() {
		datas();
	}
	
	public void datas() {
		File file = new File("C:\\Users\\rmohamedibrahim\\eclipse-workspace\\ParaBank_Cucumber\\src\\test\\resources\\RegisterDetails.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Url = prop.getProperty("url");
		FName = prop.getProperty("FirstName");
		LName = prop.getProperty("LastName");
		Add = prop.getProperty("Address");
		City = prop.getProperty("City");
		State = prop.getProperty("State");
		Zip = prop.getProperty("ZipCode");
		Phone = prop.getProperty("Phone#");
		SSN = prop.getProperty("SSN");
		User = prop.getProperty("Username");
		Pass = prop.getProperty("Password");
		Conf = prop.getProperty("Confirm");
		
		
}
}
