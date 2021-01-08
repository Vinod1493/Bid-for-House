package com.vinod.bidhouse.service;

import java.util.List;

import com.vinod.bidhouse.dto.Property;

public interface BidService {

	Property savePropInfo(Property propInfo);
	
	List<Property> getPropInfo(Property propInfo);
	
}
