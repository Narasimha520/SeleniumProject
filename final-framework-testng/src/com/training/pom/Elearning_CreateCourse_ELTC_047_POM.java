package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Elearning_CreateCourse_ELTC_047_POM {

	private WebDriver driver; 
	public Elearning_CreateCourse_ELTC_047_POM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
			
	@FindBy (xpath="//a[contains(text(),'Administration')]")
	private WebElement AdministrationLink;
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement CreateCourseLink;
	
	@FindBy(id="update_course_title")
	private WebElement Title;
	
	@FindBy(id="visual_code")
	private WebElement code;
	
	@FindBy (xpath="//button[@class='btn dropdown-toggle bs-placeholder btn-default']//div[@class='filter-option']")
	private WebElement CategoryDropDown;
	
	@FindBy (xpath="//span[contains(text(),'Automation02 (NL102902)')]")
	private WebElement CategorySelectValue;
	
	@FindBy (xpath="//span[@class='select2-selection__clear']")
	private WebElement ClickTeacherRemove;
	
	@FindBy (xpath="//input[@placeholder='Please select an option']")
	private WebElement EnterTeacherSearch;
	
	@FindBy (xpath="//li[@class='select2-results__option select2-results__option--highlighted']")
	private WebElement SelectTeacherValue;
	
	@FindBy (xpath="//li[@class='select2-selection__choice']")
	private WebElement SelectTeacher;
	
	@FindBy (xpath="//div[contains(text(),'English')]")
	private WebElement ClickLanguageDropdown;

	@FindBy (xpath="//span[contains(text(),'English')]")
	private WebElement SelectValueLanguageListBox;
	
	
	@FindBy(id="update_course_submit")
	private WebElement SubmitCreateCourseBtn;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement MsgCourseSuccess;
	
	public void ClickAdminstrationlink() {
	this.AdministrationLink.click();
	}
	
	public void ClickCreateCourseLink() {
	this.CreateCourseLink.click();
	}
	
	public void SendTitle(String Title) {
	 this.Title.sendKeys(Title);
	 }	
	public void SendCode(String Code) {
	this.code.sendKeys(Code);	
	 }	
	
	public void SelectCategory() {
	
		this.CategoryDropDown.click();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.CategorySelectValue.click();
	}
	
	 public void SelectLanguage() {
		
		this.ClickLanguageDropdown.click();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.SelectValueLanguageListBox.click();
	}
	
	 public void SelectTeacher() {
			
			this.ClickTeacherRemove.click();
			
			this.EnterTeacherSearch.sendKeys("admin");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.SelectTeacherValue.click();
		}
	
	 public void CreateCourse() {
			
			this.SubmitCreateCourseBtn.click();
}
	 public void MsgCourseCheck() 
		{ 
			String MsgCourseSuccess = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			
			System.out.println(MsgCourseSuccess);
			
			Assert.assertEquals(MsgCourseSuccess, "Course SelemiumTest9 added");
				
		}


}