package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.Elearing_ELTC_018_POM;
import com.training.pom.Login_ELTC_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Elearing_ELTC_018 {
	private WebDriver driver;
	private String baseUrl;
	private Login_ELTC_POM loginPOM;
	private Elearing_ELTC_018_POM changePassword;
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
	  loginPOM = new Login_ELTC_POM(driver);
	  changePassword=new Elearing_ELTC_018_POM(driver);
	  baseUrl = properties.getProperty("baseURL");
	  // open the browser 
	  driver.get(baseUrl);
	 }
	 
	 @AfterMethod
	  public void CloseBrowser() throws Exception {
			Thread.sleep(1000);
			driver.quit();
		
	  }
	 
	 @Test
	 public void ChangePassword() {
	 		loginPOM.sendUserName("rev");
			loginPOM.sendPassword("rev321");
			loginPOM.clickLoginBtn(); 
	 		changePassword.clickEditProfile();
			changePassword.setNewpassword("rev123");
			changePassword.setConfirmpassword("rev123");
			changePassword.ClickSave();
			changePassword.msgdislay();
	 }
	 
  
  }
