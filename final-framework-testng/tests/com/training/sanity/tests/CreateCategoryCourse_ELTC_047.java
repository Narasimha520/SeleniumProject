package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.ChangePW_ELTC_018_POM;
import com.training.pom.CreateCategory_ELTC_047_POM;
import com.training.pom.CreateCourse_ELTC_047_POM;
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

public class CreateCategoryCourse_ELTC_047 {
	private WebDriver driver;
	private String baseUrl;
	private Login_ELTC_POM loginPOM;
	private CreateCategory_ELTC_047_POM CreateCategory;
	private CreateCourse_ELTC_047_POM CreateCourse;
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
	  CreateCategory=new CreateCategory_ELTC_047_POM(driver);
	  CreateCourse=new CreateCourse_ELTC_047_POM(driver);
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
	 public void CreateCategoryAndCourse() {
	 		//Login
		 	loginPOM.sendUserName("admin");
			loginPOM.sendPassword("admin@123");
			loginPOM.clickLoginBtn(); 
			//Create Category
			CreateCategory.ClickCourseCategoriesLink();
			CreateCategory.ClickAddCateLink();
			CreateCategory.SendCategoryCode("nl102910");
			CreateCategory.SendCategoryName("Automation10");
			CreateCategory.AddCategoryBtn();
			CreateCategory.MsgAddCatCheck();
			//Create a Course
			CreateCourse.ClickAdminstrationlink();
			CreateCourse.ClickCreateCourseLink();
			CreateCourse.SendTitle("SelemiumTest10");
			CreateCourse.SendCode("nl103010");
			CreateCourse.SelectCategory();
			CreateCourse.SelectTeacher();
			CreateCourse.SelectLanguage();
			CreateCourse.CreateCourse();
			CreateCourse.MsgCourseCheck();
										
	 }
	   
  }
