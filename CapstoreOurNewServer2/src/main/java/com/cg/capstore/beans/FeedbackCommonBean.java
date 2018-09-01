package com.cg.capstore.beans;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="FeedbackCommon")
public class FeedbackCommonBean {
	public FeedbackCommonBean(String id, MerchantBean merchant, CustomerBean customer, String comments, Date date) {
		super();
		this.id = id;
		this.merchant = merchant;
		this.customer = customer;
		this.comments = comments;
		this.date = date;
	}


	@Id
	@Column(name="Feedback_common_id")
	private String id;
	
	@ManyToOne
	@JoinColumn(name="merchant_id")
	private MerchantBean merchant;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerBean customer;
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="date")
	private Date date;
	
	
	public FeedbackCommonBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public MerchantBean getMerchant() {
		return merchant;
	}


	public void setMerchant(MerchantBean merchant) {
		this.merchant = merchant;
	}


	public CustomerBean getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "FeedbackCommonBean [id=" + id + ", merchant=" + merchant + ", customer=" + customer + ", comments="
				+ comments + ", date=" + date + "]";
	}
	
	
}