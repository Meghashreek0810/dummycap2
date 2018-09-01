package com.cg.capstore.beans;



import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="feedbackProduct")
public class FeedbackProductBean {

	@Override
	public String toString() {
		return "FeedbackProductBean [feedbackId=" + feedbackId + ", feedbackTitle=" + feedbackTitle + ", date=" + date
				+ ", rating=" + rating + ", feedbackDescription=" + feedbackDescription + "]";
	}

	public FeedbackProductBean(Integer feedbackId, String feedbackTitle, Date date, Integer rating,
			String feedbackDescription) {
		super();
		this.feedbackId = feedbackId;
		this.feedbackTitle = feedbackTitle;
		this.date = date;
		this.rating = rating;
		this.feedbackDescription = feedbackDescription;
	}

	@Id
	
	@Column(name="feedback_id")
	private Integer feedbackId;
	@Column(name="feedback_title")
	private String feedbackTitle;
	@Column(name="date")
	private Date date;
	@Column(name="rating")
	private Integer rating;
	
	@Column(name="feedback_description")
	private String feedbackDescription;
	
	
	
	
	public String getFeedbackDescription() {
		return feedbackDescription;
	}
	
	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getFeedbackTitle() {
		return feedbackTitle;
	}
	public void setFeedbackTitle(String feedbackTitle) {
		this.feedbackTitle = feedbackTitle;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public FeedbackProductBean() {
		super();
	}
	

}
