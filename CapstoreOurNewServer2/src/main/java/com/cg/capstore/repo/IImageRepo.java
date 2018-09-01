package com.cg.capstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.cg.capstore.beans.ImageBean;

public interface IImageRepo extends JpaRepository<ImageBean, String>{

	
	
	@Query(value="select i from ImageBean i where i.imageId=(:imageId)")
	ImageBean getImage(@Param(value="imageId")String imageId);

}
