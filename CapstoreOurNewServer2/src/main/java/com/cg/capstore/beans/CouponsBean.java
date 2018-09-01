package com.cg.capstore.beans;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="coupons")
public class CouponsBean {

	
	@Id
	@Column(name="coupon_code")
	private String couponCode;
	
	@Column(name="coupon_amount")
	private int couponAmount;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public int getCouponAmount() {
		return couponAmount;
	}
	public void setCouponAmount(int couponAmount) {
		this.couponAmount = couponAmount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public CouponsBean(String couponCode, int couponAmount, Date startDate, Date endDate) {
		super();
		this.couponCode = couponCode;
		this.couponAmount = couponAmount;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public CouponsBean() {
		super();
	}
	
	
	
	
}