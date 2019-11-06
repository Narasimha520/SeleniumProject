package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.Elearing_AddCourse_ELTC_048_POM;
import com.training.pom.Elearning_AddUser_ELTC_048_POM;
import com.training.pom.Elearing_ELTC_018_POM;
import com.training.pom.Elearning_CreateCategory_ELTC_047_POM;
import com.training.pom.Elearning_CreateCourse_ELTC_047_POM;
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

public class Elearning_ELTC_48 {
	private WebDriver driver;
	private String baseUrl;
	private Login_ELTC_POM loginPOM;
	private Elearning_AddUser_ELTC_048_POM AddUser;
	private Elearing_AddCourse_ELTC_048_POM AddUserCourse;
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
	  AddUser=new Elearning_AddUser_ELTC_048_POM(driver);
	  AddUserCourse=new Elearing_AddCourse_ELTC_048_POM(driver);
	  baseUrl = properties.getProperty("baseURL");
	  // open the browser 
	  driver.get(baseUrl);
	 }
	 
	/*@AfterMethod
	  public void CloseBrowser() throws Exception {
			Thread.sleep(1000);
			driver.quit();
	}*/
		 
	 @Test
	 public void AddUserAndCourse() {
	 		//Login
		 	loginPOM.sendUserName("admin");
			loginPOM.sendPassword("admin@123");
			loginPOM.clickLoginBtn(); 
			//Add User
			AddUser.ClickAddUserLink();
			AddUser.sendFirstName("Auto");
			AddUser.sendLastName("Test");							
			AddUser.sendeMail("test@test.com");
			AddUser.sendphone("12345677");
			AddUser.sendUsername("user01");
			AddUser.SelectPassword();
			AddUser.SendPassword("test@1234");
			AddUser.ClickProfile();
			AddUser.SelectProfile();
			AddUser.AddUser();
			AddUser.MsgUserAddCheck();
			//Add Users to Course
			AddUserCourse.ClickAdminstrationlink();
			AddUserCourse.ClickAddUserCourseLink();
			AddUserCourse.SelectUserList();
			AddUserCourse.SelectCourseList();
			AddUserCourse.ClickAddToCourse();
			AddUserCourse.MsgUserToCourseCheck();
				
	 }
	   
  }
