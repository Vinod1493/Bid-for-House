package com.vinod.bidhouse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinod.bidhouse.entity.PropertyInfo;


@Repository
public interface BidDao extends JpaRepository<PropertyInfo, Long>{

	
	
}
