package com.cg.capstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.capstore.beans.CouponsBean;

public interface ICouponsRepo extends JpaRepository<CouponsBean, String> {

	
	
	@Query(value="select c from CouponsBean c where c.couponCode=(:couponCode) ")
	CouponsBean getCouponDetails(@Param("couponCode")String couponCode);
}
