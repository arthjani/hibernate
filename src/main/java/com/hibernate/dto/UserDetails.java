package com.hibernate.dto;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.tomcat.jni.Address;

@Entity
public class UserDetails {
	
	//userId work as primary key in database
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	
	private String userName;
	
	//not mentdatory to use this annotation because we used class that Embeddable
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name = "street",column=@Column(name="Home_Street")),
	@AttributeOverride(name = "city",column=@Column(name="City")),
	@AttributeOverride(name = "state",column=@Column(name="Home_State")),
	@AttributeOverride(name = "pincode",column=@Column(name="Home_Pincode"))})
	private Address homeAddress;
	@Embedded
	private Address officeAddress;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	
	
	
	

}
