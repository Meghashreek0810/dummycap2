package com.cg.capstore.beans;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="discount")
public class DiscountBean {

	public DiscountBean(String discountId, Integer discountPercent, Date timePeriod) {
		super();
		this.discountId = discountId;
		this.discountPercent = discountPercent;
		this.timePeriod = timePeriod;
	}
	public DiscountBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="discount_id")
	private String discountId;
	@Column(name="discount_percent")
	private Integer discountPercent;
	@Column(name="time_period")
	private Date timePeriod;
	
	public String getDiscountId() {
		return discountId;
	}
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}
	public Integer getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(Integer discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Date getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(Date timePeriod) {
		this.timePeriod = timePeriod;
	}
	
	
}


