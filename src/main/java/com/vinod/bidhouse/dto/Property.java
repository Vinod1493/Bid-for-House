package com.vinod.bidhouse.dto;

import java.util.Date;

import javax.xml.crypto.Data;

public class Property {

	public String property_name;
	public long property_start_price;
	public Date property_sale_starts;
	public Date property_sale_ends;
	public String getProperty_name() {
		return property_name;
	}
	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}
	public long getProperty_start_price() {
		return property_start_price;
	}
	public void setProperty_start_price(long property_start_price) {
		this.property_start_price = property_start_price;
	}
	public Date getProperty_sale_starts() {
		return property_sale_starts;
	}
	public void setProperty_sale_starts(Date property_sale_starts) {
		this.property_sale_starts = property_sale_starts;
	}
	public Date getProperty_sale_ends() {
		return property_sale_ends;
	}
	public void setProperty_sale_ends(Date property_sale_ends) {
		this.property_sale_ends = property_sale_ends;
	}
	public Property(String property_name, long property_start_price, Date property_sale_starts,
			Date property_sale_ends) {
		super();
		this.property_name = property_name;
		this.property_start_price = property_start_price;
		this.property_sale_starts = property_sale_starts;
		this.property_sale_ends = property_sale_ends;
	}
	public Property() {
		super();
	}
	@Override
	public String toString() {
		return "Property [property_name=" + property_name + ", property_start_price=" + property_start_price
				+ ", property_sale_starts=" + property_sale_starts + ", property_sale_ends=" + property_sale_ends + "]";
	}
	
	
}
