package com.cg.capstore.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.cg.capstore.beans.AdminBean;
import com.cg.capstore.beans.CouponsBean;
import com.cg.capstore.beans.FeedbackProductBean;
import com.cg.capstore.beans.ImageBean;
import com.cg.capstore.beans.ProductBean;
import com.cg.capstore.exception.CapstoreException;

public interface ICapstoreService {

	CouponsBean createCoupon(String emailId, CouponsBean coupon) throws CapstoreException;

	List<FeedbackProductBean> addingfeedback(String productId, FeedbackProductBean feedbackProductBean) throws CapstoreException;

	Double applyCoupons(String couponCode, Double price) throws CapstoreException;

	List<ProductBean> addProductToCart(String email, String productId) throws CapstoreException;

	void removeProductFromProduct(String email, String productId) throws CapstoreException;

	List<ProductBean> displayCart(String email) throws CapstoreException;

	List<ProductBean> refreshCart(String email) throws CapstoreException;

	ImageBean get(String imageId);

	String addImage(String prodcutId,ImageBean image) throws FileNotFoundException, IOException;

	ProductBean getProduct(String productId);

}
