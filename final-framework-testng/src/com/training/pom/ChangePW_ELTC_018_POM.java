package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ChangePW_ELTC_018_POM {

	private WebDriver driver; 
	public ChangePW_ELTC_018_POM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Edit profile')]")
	private WebElement EditProfile;		
	
	@FindBy(id="password1")
	private WebElement NewPassword;
	
	@FindBy(id="profile_password2")
	private WebElement ConfirmPassword;
	
	@FindBy(id="profile_apply_change")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement savemsg;
	
	public void msgdislay() 
	{ 
		String msgdisplay = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		
		System.out.println(msgdisplay);
		
		Assert.assertEquals(msgdisplay, "Your new profile has been saved");
			
	}
	
	public void clickEditProfile() {
			this.EditProfile.click(); 
		}
		
		public void setNewpassword(String NewPassword) {
			this.NewPassword.clear();
			this.NewPassword.sendKeys(NewPassword);			
		}
		public void setConfirmpassword(String ConfirmPassword) {
			this.ConfirmPassword.clear();
			this.ConfirmPassword.sendKeys(ConfirmPassword);
		}
		public void ClickSave() {
			this.SaveBtn.click();
		}
		
			
}
