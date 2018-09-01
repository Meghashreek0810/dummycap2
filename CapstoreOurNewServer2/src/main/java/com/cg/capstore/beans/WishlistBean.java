package com.cg.capstore.beans;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="Wishlist")
public class WishlistBean {
	
	public WishlistBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WishlistBean(String wishlistId, List<ProductBean> product) {
		super();
		this.wishlistId = wishlistId;
		this.product = product;
	}

	@Id
	@Column(name="wishlist_id")
	private String wishlistId;
	
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="product_id")
	private List<ProductBean> product;

	public String getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(String wishlistId) {
		this.wishlistId = wishlistId;
	}

	public List<ProductBean> getProduct() {
		return product;
	}

	public void setProduct(List<ProductBean> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "WishlistBean [wishlistId=" + wishlistId + ", product=" + product + "]";
	}

	
	
}
















