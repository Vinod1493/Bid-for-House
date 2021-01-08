package com.vinod.bidhouse.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.bidhouse.dao.BidDao;
import com.vinod.bidhouse.dto.Property;
import com.vinod.bidhouse.entity.PropertyInfo;
import com.vinod.bidhouse.service.BidService;

@Service
public class BidServiceImpl implements BidService {

	@Autowired
	private BidDao bidDaoImpl;
	
	@Override
	public Property savePropInfo(Property propInfo) {
		
		PropertyInfo entityInfo = new PropertyInfo();
		
		entityInfo.setPropertyName(propInfo.getProperty_name());
		entityInfo.setStartPrice(propInfo.getProperty_start_price());
		entityInfo.setSaleStarts(propInfo.getProperty_sale_starts());
		entityInfo.setSaleEnds(propInfo.getProperty_sale_ends());
		
		bidDaoImpl.save(entityInfo);
		
		return propInfo;
	}

	public List<Property> getPropInfo(Property propInfo) {
		
		List<Property> listProps = new ArrayList<Property>();
		
		List<PropertyInfo> propList = bidDaoImpl.findAll();
		
		for(PropertyInfo info: propList) {
			Property p = new Property();
			p.setProperty_name(info.getPropertyName());
			p.setProperty_start_price(info.getStartPrice());
			p.setProperty_sale_starts(info.getSaleStarts());
			p.setProperty_sale_ends(info.getSaleEnds());
			listProps.add(p);
		}
		
		return listProps;
	}

	
	
}
