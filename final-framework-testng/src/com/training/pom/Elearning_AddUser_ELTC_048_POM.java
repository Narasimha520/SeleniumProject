package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Elearning_AddUser_ELTC_048_POM {

	private WebDriver driver; 
	public Elearning_AddUser_ELTC_048_POM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
			
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement AddUserLink;
	
	@FindBy(id="firstname")
	private WebElement firstName;
	
	@FindBy(id="lastname")
	private WebElement lastname;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="phone")
	private WebElement phone;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(xpath="//label[contains(text(),'Enter password')]")
	private WebElement SelectPassword;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Learner')]")
	private WebElement ClickProfile;
	
	@FindBy(xpath="//span[contains(text(),'Learner')]")
	private WebElement SelectProfile;
	
	@FindBy(xpath="submit")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement MsgCourseSuccess;
	
	public void ClickAddUserLink() {
	this.AddUserLink.click();
	}
	
	public void sendFirstName(String firstname) {
	this.firstName.clear();
	this.firstName.sendKeys(firstname);
	}
	
	public void sendLastName(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
		}
	
	 public void sendeMail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
		}
	 
	  public void sendphone(String phone) {
			this.phone.clear();
			this.phone.sendKeys(phone);
			}
	  public void sendUsername(String username) {
			this.username.clear();
			this.username.sendKeys(username);
			}
	  
	  public void SelectPassword() {
			this.SelectPassword.click();
	  }
	  
	  public void SendPassword(String password) {
			this.password.sendKeys(password);
	  }
	  
	  public void SelectProfile() {
		  this.SelectProfile.click();
		  
	  }
	  public void ClickProfile() {
		  this.ClickProfile.click();
		  
	  }
	  public void AddUser() {
			
			this.submit.click();
}
	 public void MsgUserAddCheck() 
		{ 
			String MsgUserAdd = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
			
			System.out.println(MsgUserAdd);
			
			Assert.assertEquals(MsgUserAdd, "The user has been added: Auto test");
				
		}


}