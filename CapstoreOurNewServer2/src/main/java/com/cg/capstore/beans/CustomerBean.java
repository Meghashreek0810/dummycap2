package com.cg.capstore.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="customers")
public class CustomerBean {

	@Id
	@Column(name="customer_id")
	private String email;

	@Column(name="password")
	private String password;

	@Column(name="customer_name")
	private String customerName;

	@Column(name="mobile_num")
	private String mobileNo;

	@Column(name="address")
	private String address;
	
	@OneToOne
	@JoinColumn(name="wishlist_id")
	private WishlistBean wishlist;

	@OneToMany
	@Column(name="cart")
	private List<ProductBean> cart;

	@OneToOne
	@JoinColumn(name="order_id")
	private OrderBean order;

	public List<ProductBean> getCart() {
		return cart;
	}

	public void setCart(List<ProductBean> cart) {
		this.cart = cart;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public WishlistBean getWishlist() {
		return wishlist;
	}

	public void setWishlist(WishlistBean wishlist) {
		this.wishlist = wishlist;
	}

	/*public Map<String, ProductBean> getCart() {
		return cart;
	}

	public void setCart(Map<String, ProductBean> cart) {
		this.cart = cart;
	}*/

	public OrderBean getOrder() {
		return order;
	}

	public void setOrder(OrderBean order) {
		this.order = order;
	}
	
	public CustomerBean(String email, String password, String customerName, String mobileNo, String address,
			WishlistBean wishlist, List<ProductBean> cart, OrderBean order) {
		super();
		this.email = email;
		this.password = password;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.wishlist = wishlist;
		this.cart = cart;
		this.order = order;
	}

	public CustomerBean() {
		super();
	}
	
}
