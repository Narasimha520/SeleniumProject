package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserSubscribeCourse_ELTC_046_POM {
	
	private WebDriver driver;
	
	public UserSubscribeCourse_ELTC_046_POM(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-large']")
	private WebElement CourserCatalogBtn;
	
	@FindBy(xpath="/a[contains(text(),'Course catalog')]")
	private WebElement SearchCatalog;
	
	@FindBy(name="search_term")
	private WebElement SearchText;

	@FindBy(xpath="//div[@class='input-group']//button[1]")
	private WebElement ClickSearchBtn;
	
	@FindBy(xpath="//div[@class='container']//div[1]//div[1]//div[2]//div[4]//div[1]//a[1]")
	private WebElement CourseSubscribe;
	
	
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement msgSubscribe;
	
	@FindBy(xpath="//a[contains(text(),'My courses')]")
	private WebElement Mycourselink;
	
	@FindBy(xpath="//a[contains(text(),'selenium2')]")
	private WebElement CourseCheck;
	
	
	public void ClickCatalog() {
		
		this.CourserCatalogBtn.click();
		
	}
	
	public void SendSearchText(String SearchText) {
		
		this.SearchText.sendKeys(SearchText);
		
	}
	
	public void ClickSearchButton() {
		
		this.ClickSearchBtn.click();
		
	}
	public void ClickCourseSubscribe() {
		
		this.CourseSubscribe.click();
		
	}
	
	public void MsgSubscribeCheck() 
	{ 
		String MsgSubscribe = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		
		System.out.println(MsgSubscribe);
		
		Assert.assertEquals(MsgSubscribe, "MsgSubscribe");
			
	}
	
	public void ClickMycourselink() {
		
		this.Mycourselink.click();
		
	}
	
	public void CourseAssignmentCheck() 
	{ 
		String CourseAssignmentCheck = driver.findElement(By.xpath("//a[contains(text(),'123testing')]")).getText();
		
		System.out.println(CourseAssignmentCheck);
		
		Assert.assertEquals(CourseAssignmentCheck, "123testing");
			
	}
	
}
