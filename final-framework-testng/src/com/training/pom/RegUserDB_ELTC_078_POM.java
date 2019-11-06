package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class RegUserDB_ELTC_078_POM {

	private WebDriver driver; 
	public RegUserDB_ELTC_078_POM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
			
	@FindBy (xpath="//a[contains(text(),'Sign up!')]")
	private WebElement SingUpLink;
	
	@FindBy (xpath="(//input[@class='register-profile'])[2]")
	private WebElement TeacherRadioBtn;
	
	@FindBy(name="firstname")
	private WebElement FirstName;
	

	@FindBy(name="lastname")
	private WebElement LastName;
	
	@FindBy (name="email")
	private WebElement eMail;
	
	@FindBy (name="username")
	private WebElement UserName;
	
	@FindBy (name="pass1")
	private WebElement Password;
	
	@FindBy (name="pass2")
	private WebElement ConfirmPassword;
	
	@FindBy (name="phone")
	private WebElement phone;
	
	@FindBy (xpath="//div[@class='filter-option-inner-inner']")
	private WebElement ClickLanguageList;

	@FindBy (xpath="//span[contains(text(),'English')]")
	private WebElement SelectLanguageValue;
	
	
	@FindBy(name="submit")
	private WebElement RegisterBtn;
	
	@FindBy(xpath="//section[@id='cm-content']//p[1]")
	private WebElement MsgRegisterSuccess;
	
	public void ClickSignUplink() {
	this.SingUpLink.click();
	}
	
	public void SendFirstName(String FirstName) {
	 this.FirstName.sendKeys(FirstName);
	 }	
	
	public void SendLastName(String LastName) {
	this.LastName.sendKeys(LastName);
	 }	
	
	public void SendeMail(String eMail) {
		this.eMail.sendKeys(eMail);
		 }	
	
	
	public void SendUserName(String UserName) {
		this.UserName.sendKeys(UserName);
		 }	
	
	public void SendPassword(String Password) {
		this.Password.sendKeys(Password);
		 }	
	
	public void SendConfirmPassword(String ConfirmPassword) {
		this.ConfirmPassword.sendKeys(ConfirmPassword);
		 }	
	
	public void SendPhone(String Phone) {
		this.phone.sendKeys(Phone);
		 }	
	
	public void SelectLanguage(String Language) {
		
		this.ClickLanguageList.click();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.SelectLanguageValue.click();
	}
	
	public void ClickRadioBtn()
	{
		this.TeacherRadioBtn.click();
		
	}
	
	  public void ClickRegistrationBtn() {
			
			this.RegisterBtn.click();
			
	  }
	 public void MsgRegistrationCheck() 
		{ 
			String MsgExp = driver.findElement(By.xpath("//section[@id='cm-content']//p[1]")).getText();
			
			String MsgAct= driver.findElement(By.xpath("//section[@id='cm-content']//p[1]")).getText();
			
			System.out.println(MsgExp);
			
			Assert.assertEquals(MsgExp, MsgAct);
				
		}


}