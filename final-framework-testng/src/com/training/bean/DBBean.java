package com.training.bean;

/**
 * 
 * @author Naveen
 * @see this class shall get the bean data 
 */
public class DBBean {
	private String url; 
	private String driver; 
	private String FirstName; 
	private String LastName;
	private String eMail;
	private String UserName;
	private String Password;
	private String ConfirmPassword;
	private String Phone;
	private String Language;
	
	
	public DBBean(){}
	
	public DBBean(String url, String driver, String FirstName, String LastName, String eMail, String UserName,
			String Password, String ConfirmPassword, String Phone, String Language) {
		super();
		this.url = url;
		this.driver = driver;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.eMail = eMail;
		this.UserName = UserName;
		this.Password = Password;
		this.ConfirmPassword = ConfirmPassword;
		this.Phone = Phone;
		this.Language = Language;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}
	
	
	
}
