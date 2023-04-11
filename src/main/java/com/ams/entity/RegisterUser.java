package com.ams.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Tables;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "customers")
public class RegisterUser {
	
	@Id
    @GeneratedValue
	private Long userCode;
	private String userFname;
	private String userLname;
	private String email;
	

	public RegisterUser(Long userCode, String userFname, String userLname, String email) {
		super();
		this.userCode = userCode;
		this.userFname = userFname;
		this.userLname = userLname;
		this.email = email;
	}
	public Long getUserCode() {
		return userCode;
	}
	public void setUserCode(Long userCode) {
		this.userCode = userCode;
	}
	public String getUserFname() {
		return userFname;
	}
	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}
	public String getUserLname() {
		return userLname;
	}
	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
