package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.Elearning_ELTC_046_POM;
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

public class Elearning_ELTC_046 {
	private WebDriver driver;
	private String baseUrl;
	private Login_ELTC_POM loginPOM;
	private Elearning_ELTC_046_POM SubscribeCourse;
	
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
	  SubscribeCourse=new Elearning_ELTC_046_POM(driver);
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
	 public void UserSubscribeCourse() {
	 		loginPOM.sendUserName("nl04");
			loginPOM.sendPassword("test1234");
			loginPOM.clickLoginBtn(); 
			SubscribeCourse.ClickCatalog();
			SubscribeCourse.SendSearchText("testing");
			SubscribeCourse.ClickSearchButton();
			SubscribeCourse.ClickCourseSubscribe();
			SubscribeCourse.ClickMycourselink();
	 		SubscribeCourse.CourseAssignmentCheck();
	 		//Note as per test cases - not find task from step 6..We discussed with Shiv and shown the flow in application;
	 		//Can't automation rest of the steps
	 		
    }
}