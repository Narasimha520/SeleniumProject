package com.training.bean;

public class LoginBean2 {
	
	private String firstName;

	public LoginBean2() {
	}

	public LoginBean2(String firstName) {
		super();
		
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}

}
