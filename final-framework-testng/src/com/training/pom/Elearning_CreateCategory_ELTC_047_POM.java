package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Elearning_CreateCategory_ELTC_047_POM {

	private WebDriver driver; 
	public Elearning_CreateCategory_ELTC_047_POM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Courses categories')]")
	private WebElement ClickCourseCategories;		
	
	@FindBy(xpath="//div[@class='actions']//a//img")
	private WebElement ClickAddCatIcon;
	
	@FindBy(id="course_category_code")
	private WebElement CategoryCode;
	
	@FindBy(id="course_category_name")
	private WebElement CategoryName;
	
	@FindBy(xpath="//label[contains(text(),'Yes')]")
	private WebElement AllowCourseOption;
	
	@FindBy(id="course_category_submit")
	private WebElement ClickAddCategoryBtn;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement msgaddcatdisplay;
	
	public void MsgAddCatCheck() 
	{ 
		String msgadddisplay = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		
		System.out.println("Create Category Successful :  "+msgadddisplay);
		
		Assert.assertEquals(msgadddisplay, "Created");
			
	}
	
	public void ClickCourseCategoriesLink() {
	this.ClickCourseCategories.click();
	}
	
	public void ClickAddCateLink() {
	this.ClickAddCatIcon.click();
	}	
	
	public void SendCategoryCode(String CategoryCode) {
	 this.CategoryCode.sendKeys(CategoryCode);
	 }	
	public void SendCategoryName(String CategoryName) {
	this.CategoryName.sendKeys(CategoryName);
	 }	
	
	public void SelectAllowOption(String AllowCourseOption) {
		this.AllowCourseOption.isSelected();
		 }	
	
	public void AddCategoryBtn() {
	this.ClickAddCategoryBtn.click();
	}
		
			
}
