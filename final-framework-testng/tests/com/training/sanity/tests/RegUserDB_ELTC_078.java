package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.pom.RegUserDB_ELTC_078_POM;
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

public class RegUserDB_ELTC_078 {
	private WebDriver driver;
	private String baseUrl;
	private RegUserDB_ELTC_078_POM UserRegistration;
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
	  UserRegistration=new RegUserDB_ELTC_078_POM(driver);
	  baseUrl = properties.getProperty("baseURL");
	  // open the browser 
	  driver.get(baseUrl);
	  
	  }
	 
	 @AfterMethod
	  public void CloseBrowser() throws Exception {
			Thread.sleep(1000);
			driver.quit();
		
	  }
	 
	 @Test(dataProvider ="db-inputs", dataProviderClass = LoginDataProviders.class)
	 public void UserRegistration(String FirstName,String LastName, String eMail, String UserName, 
			 String Password, String ConfirmPassword, String Phone, String Language  ) {
		 
		 UserRegistration.ClickSignUplink();
		 UserRegistration.SendFirstName(FirstName);
		 UserRegistration.SendLastName(LastName);
		 UserRegistration.SendeMail(eMail);
		 UserRegistration.SendUserName(UserName);
		 UserRegistration.SendPassword(Password);
		 UserRegistration.SendConfirmPassword(ConfirmPassword);
		 UserRegistration.SendPhone(Phone);
		 UserRegistration.SelectLanguage(Language);
		 UserRegistration.ClickRadioBtn();
		 UserRegistration.ClickRegistrationBtn();
		 UserRegistration.MsgRegistrationCheck();
		}
	 
  
  }
