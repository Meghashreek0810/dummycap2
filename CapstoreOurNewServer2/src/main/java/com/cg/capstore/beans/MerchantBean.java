package com.cg.capstore.beans;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="merchants")
public class MerchantBean {

	public MerchantBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MerchantBean(String emailId, String merchantName, String phoneNo, String type, List<OrderBean> order,
			String password, List<CouponsBean> coupons) {
		super();
		this.emailId = emailId;
		this.merchantName = merchantName;
		this.phoneNo = phoneNo;
		this.type = type;
		this.order = order;
		this.password = password;
		this.coupons = coupons;
	}
	
	@Id
	@Column(name="merchant_id")
	private String emailId;
	@Column(name="merchant_name")
	private String merchantName;
	@Column(name="phone_no")
	private String phoneNo;
	@Column(name="type")
	private String type;
	
	@OneToMany
	@Column(name="order_id")
	private List<OrderBean> order;
	
	@Column(name="password")
	private String password;
	
	@ManyToMany
	@JoinColumn(name="coupon_id")
	private List<CouponsBean> coupons;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public List<OrderBean> getOrder() {
		return order;
	}
	public void setOrder(List<OrderBean> order) {
		this.order = order;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<CouponsBean> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<CouponsBean> coupons) {
		this.coupons = coupons;
	}
	
}
