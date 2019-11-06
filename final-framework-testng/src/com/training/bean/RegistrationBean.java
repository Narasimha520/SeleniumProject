package com.training.bean;

public class RegistrationBean {
	
	private String FirstName;
	private String LastName;
	private String eMail;
	private String UserName;
	private String Password;
    private String ConfirmPassword;
    private String Phone;
    private String Language;
	
	public RegistrationBean() {
	}

	public RegistrationBean(String FirstName) {
		super();
		
		this.FirstName = FirstName;
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

	public void setLastName(String lastName) {
		LastName = lastName;
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

	@Override
	public String toString() {
		return "LoginBean [FirstName=" + FirstName + ", LastName=" + LastName + ", eMail=" + eMail 
				+ " , UserName=" + UserName + ", Password=" + Password + ", ConfirmPassword=" 
				+ ConfirmPassword + ", Phone=" + Phone + ",Language=" + Language + "]";
	}

}
