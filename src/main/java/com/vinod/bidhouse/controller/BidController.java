package com.vinod.bidhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.bidhouse.dto.Property;
import com.vinod.bidhouse.service.impl.BidServiceImpl;

@RestController
public class BidController {

	@Autowired
	private BidServiceImpl bidServiceImpl;
	
	@PostMapping("/property")
	public Property createProperty(@RequestBody Property propInfo) {
		return bidServiceImpl.savePropInfo(propInfo) ;
	}
	
	
	@GetMapping("/property")
	public List<Property> getProperty(@RequestBody Property propInfo) {
		return bidServiceImpl.getPropInfo(propInfo) ;
	}
}
