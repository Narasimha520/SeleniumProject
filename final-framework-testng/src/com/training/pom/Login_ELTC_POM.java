package com.training.pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_ELTC_POM {

private WebDriver driver; 
		public Login_ELTC_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@class='dropdown-toggle']//img[@class='img-circle']")
	private WebElement icon;		
	
	@FindBy(xpath="//a[@id='logout_button']")
	private WebElement logoutBtn;
	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement adminpage;
	@FindBy(xpath="//a[contains(text(),'Homepage')]")
	private WebElement loginPage;
	
	
	public void AdminPageCheck()
	{
		this.adminpage.isDisplayed();
		System.out.println("The admin page is displayed");	
		}
	public void loginPage()
	{
		this.loginPage.isDisplayed();
		System.out.println("Login page is diplayed");	
		}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
		public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

		public void clickicon() {
			this.icon.click(); 
		}
		
		public void logoutBtn() {
			this.logoutBtn.click(); 
			
			System.out.println("Logout page is diplayed");
		}

}


