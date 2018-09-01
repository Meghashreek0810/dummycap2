package com.cg.capstore.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="image")
public class ImageBean {
	
	
	@Id
	@Column(name="image_id")
	private String imageId;
	
	@Lob
	@Column(name="image_data")
	private byte[] imageData;
	
	@Column(name="image_name")
	private String imageName;
	
	@Column(name="image_type")
	private String imageType;
	
	@Column(name="image_path")
	private String imagePath;
	
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	
	
	public byte[] getImageData() {
		return imageData;
	}
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	
	public ImageBean(String imageId, byte[] imageData, String imageName, String imageType, String imagePath) {
		super();
		this.imageId = imageId;
		this.imageData = imageData;
		this.imageName = imageName;
		this.imageType = imageType;
		this.imagePath = imagePath;
	}
	public ImageBean() {
		super();
	}
	
}
