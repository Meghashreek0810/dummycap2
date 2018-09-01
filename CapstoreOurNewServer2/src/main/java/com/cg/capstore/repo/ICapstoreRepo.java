package com.cg.capstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.capstore.beans.AdminBean;
import com.cg.capstore.beans.CouponsBean;
@Repository
public interface ICapstoreRepo extends JpaRepository<CouponsBean, String> {

	@Query(value="select a from AdminBean a where a.emailId=(:emailId) ")
	AdminBean getAdminDetails(@Param("emailId")String emailId);

}
