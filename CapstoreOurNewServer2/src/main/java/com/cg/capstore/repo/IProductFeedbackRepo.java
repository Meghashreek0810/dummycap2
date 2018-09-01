package com.cg.capstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.capstore.beans.FeedbackProductBean;


public interface IProductFeedbackRepo extends JpaRepository<FeedbackProductBean, Integer>{

}
