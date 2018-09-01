package com.cg.capstore.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.capstore.beans.CustomerBean;

public interface ICustomerRepo extends JpaRepository<CustomerBean, String> {
	@Query(value="select c from CustomerBean c where c.email=(:email)")
	CustomerBean getCustomer(@Param(value="email")String email);

	@Query(value="select customer_id from CustomerBean",nativeQuery=true)
	List<String> getCustomerEmailDetails();
}
