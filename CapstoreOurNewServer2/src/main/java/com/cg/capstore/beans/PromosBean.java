package com.cg.capstore.beans;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="promos")
public class PromosBean {

	public PromosBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PromosBean(String promoCode, Integer discount, LocalDateTime timePeriod) {
		super();
		this.promoCode = promoCode;
		this.discount = discount;
		this.timePeriod = timePeriod;
	}
	@Id
	@Column(name="promo_code")
	private String promoCode;
	@Column(name="discount")
	private Integer discount;
	@Column(name="time_period")
	private LocalDateTime timePeriod;
	
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public LocalDateTime getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(LocalDateTime timePeriod) {
		this.timePeriod = timePeriod;
	}

}