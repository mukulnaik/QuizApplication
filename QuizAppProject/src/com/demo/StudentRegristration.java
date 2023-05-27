package com.demo;

public class StudentRegristration {
	String firstName;
	String lastName;
	String UserName;
	String Password;
	String City;
	String MailId;
	long mobileNo;
	
	
	
	public StudentRegristration() {
		super();
	}



	public StudentRegristration(String firstName, String lastName, String userName, String password, String city,
			String mailId, long mobileNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		UserName = userName;
		Password = password;
		City = city;
		MailId = mailId;
		this.mobileNo = mobileNo;
	}
	
	

}
