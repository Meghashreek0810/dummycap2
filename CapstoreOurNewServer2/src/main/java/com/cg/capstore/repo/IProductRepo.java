package com.cg.capstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.capstore.beans.ProductBean;

public interface IProductRepo extends JpaRepository<ProductBean, String>{
	@Query(value="select p from ProductBean p where p.productId=(:productId)")
	ProductBean getProduct(@Param(value="productId")String productId);

}
