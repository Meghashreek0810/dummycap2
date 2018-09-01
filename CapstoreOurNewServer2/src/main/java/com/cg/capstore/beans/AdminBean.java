package com.cg.capstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="admins")
public class AdminBean {
	
	public AdminBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminBean(String emailId, String password) {
		super();
		this.emailId = emailId;
		Password = password;
	}
	@Id
	@Column(name="admin_id")
	private String emailId;
	
	@Column(name="password")
	private String Password;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Admin [emailId=" + emailId + ", Password=" + Password + "]";
	}
	
	
	
}