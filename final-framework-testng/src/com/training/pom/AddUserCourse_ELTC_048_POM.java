package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class AddUserCourse_ELTC_048_POM {

	private WebDriver driver; 
	public AddUserCourse_ELTC_048_POM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
			
	@FindBy (xpath="//a[contains(text(),'Administration')]")
	private WebElement AdministrationLink;
	
	@FindBy(xpath="//a[contains(text(),'Add users to course')]")
	private WebElement AddUserCourseLink;
	
	@FindBy (xpath="//option[contains(text(),'angel mark (mark15)')]")
	private WebElement SelectUserList;
	
	@FindBy (xpath="//option[contains(text(),'(NL103006) SelemiumTest6')]")
	private WebElement SelectCourseList;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement AddToCoursebtn;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement MsgCourseSuccess;
	
	public void ClickAdminstrationlink() {
	this.AdministrationLink.click();
	}
	
	public void ClickAddUserCourseLink() {
	this.AddUserCourseLink.click();
	}
	
	public void SelectUserList() {
	this.SelectUserList.click();
	 }	
	public void SelectCourseList() {
		this.SelectCourseList.click();
		 }	
	
	 public void ClickAddToCourse() {
			
			this.AddToCoursebtn.click();
}
	 public void MsgUserToCourseCheck() 
		{ 
			String MsgUserToCourse = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			
			System.out.println(MsgUserToCourse);
			
			Assert.assertEquals(MsgUserToCourse, "The selected users are subscribed to the selected course");
				
		}


}