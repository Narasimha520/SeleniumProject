package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.pom.InvalidRegMultipleUser_ELTC_077_POM;
import com.training.pom.RegMultipleUser_ELTC_076_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class InvalidRegMultipleUser_ELTC_077 {
	private WebDriver driver;
	private String baseUrl;
	private InvalidRegMultipleUser_ELTC_077_POM InvalidUserRegistration;
	private static Properties properties;
	
	 @BeforeClass
	  public void setup() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
				}
	 @BeforeMethod
	 public void beforeMethod() {
	  driver = DriverFactory.getDriver(DriverNames.CHROME);
	  InvalidUserRegistration=new InvalidRegMultipleUser_ELTC_077_POM(driver);
	  baseUrl = properties.getProperty("baseURL");
	  // open the browser 
	  driver.get(baseUrl);
	  
	  }
	 
	 @AfterMethod
	  public void CloseBrowser() throws Exception {
			Thread.sleep(1000);
			driver.quit();
		
	  }
	 
	 @Test(dataProvider ="excel-inputs", dataProviderClass = LoginDataProviders.class)
	 public void InvalidUserRegistration(String FirstName,String LastName, String eMail, String UserName, 
			 String Password, String ConfirmPassword, String Phone, String Language  ) {
		 
		 InvalidUserRegistration.ClickSignUplink();
		 InvalidUserRegistration.SendFirstName(FirstName);
		 InvalidUserRegistration.SendLastName(LastName);
		 InvalidUserRegistration.SendeMail(eMail);
		 InvalidUserRegistration.SendUserName(UserName);
		 InvalidUserRegistration.SendPassword(Password);
		 InvalidUserRegistration.SendConfirmPassword(ConfirmPassword);
		 InvalidUserRegistration.SendPhone(Phone);
		 InvalidUserRegistration.SelectLanguage(Language);
		 InvalidUserRegistration.ClickRadioBtn();
		 InvalidUserRegistration.ClickRegisterBtn();
		 InvalidUserRegistration.MsgRegistrationCheck();
		 
	 	}
	 
  
  }
