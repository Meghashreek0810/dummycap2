package com.cg.capstore.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.capstore.beans.AdminBean;
import com.cg.capstore.beans.CouponsBean;
import com.cg.capstore.beans.FeedbackProductBean;
import com.cg.capstore.beans.ImageBean;
import com.cg.capstore.beans.ProductBean;
import com.cg.capstore.exception.CapstoreException;
import com.cg.capstore.service.ICapstoreService;

@RestController
public class CapstoreController {

	@Autowired
	ICapstoreService service;

	
	  @RequestMapping(value="/generatecoupons",method=RequestMethod.POST)
	  public CouponsBean generateCoupon(String emailId,@RequestBody CouponsBean coupon) throws
	  CapstoreException {
	  
	  return service.createCoupon(emailId,coupon);
	 
	  }
	 

	@RequestMapping(value = "/addingFeedback", method = RequestMethod.POST)
	public List<FeedbackProductBean> addingFeedback(String productId,@RequestBody FeedbackProductBean feedbackProductBean)
			throws CapstoreException {

		return service.addingfeedback(productId, feedbackProductBean);
	}

	@RequestMapping(value = "/applycoupons", method = RequestMethod.POST)
	public Double applyCoupon(String couponCode, Double price) throws CapstoreException {

		return service.applyCoupons(couponCode, price);

	}

	@RequestMapping(value = "/addProductToCart", method = RequestMethod.PUT)
	public List<ProductBean> addProductToCart(String email, String productId) throws CapstoreException {

		return service.addProductToCart(email, productId);
	}

	@RequestMapping(value = "/deleteProductFromCart", method = RequestMethod.DELETE)
	public void removeProductFromCart(String email, String productId) throws CapstoreException {

		service.removeProductFromProduct(email, productId);
	}

	@RequestMapping(value = "/displayCart", method = RequestMethod.GET)
	public List<ProductBean> displayCart(String email) throws CapstoreException {

		return service.displayCart(email);
	}

	@RequestMapping(value = "/refreshCart", method = RequestMethod.GET)
	public List<ProductBean> refreshCart(String email) throws CapstoreException {

		return service.refreshCart(email);
	}

	@RequestMapping(value = "/addImage", method = RequestMethod.POST)
	public String addImage(String productId,ImageBean image) throws FileNotFoundException, IOException {

		return service.addImage(productId,image);
	}

	@RequestMapping(value = "/imageDisplay/{imageId}", method = RequestMethod.GET)
	public void showImage(@PathVariable(value = "imageId") String imageId, HttpServletResponse response,
			HttpServletRequest request) throws ServletException, IOException {

		ImageBean image = service.get(imageId);
		System.out.println(image);

		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		// response.getOutputStream().write(image.getImg_data());
		response.getOutputStream().write(image.getImageData());

		response.getOutputStream().close();
	}
	@RequestMapping(value="/getProduct",method=RequestMethod.GET)
	public ProductBean getProduct(String productId) {
		return service.getProduct(productId);
	}
	
	

}
