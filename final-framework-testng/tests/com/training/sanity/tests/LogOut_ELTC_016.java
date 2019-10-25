package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Login_ELTC_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LogOut_ELTC_016 {
	private WebDriver driver;
	private String baseUrl;
	private Login_ELTC_POM loginPOM;
	private static Properties properties;
	
	
	@BeforeClass
	  public void Setup() throws IOException {
		  properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
	  }

	@BeforeMethod
  public void LaunchURL() {
	  driver = DriverFactory.getDriver(DriverNames.CHROME);
	  loginPOM = new Login_ELTC_POM(driver);
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
	  public void LogoutTest() {
		loginPOM.sendUserName("reva");
		loginPOM.sendPassword("reva321");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickicon();
		loginPOM.logoutBtn();	
		
		
	}
  
	}
