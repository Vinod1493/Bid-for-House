package com.vinod.bidhouse.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "property_info")
public class PropertyInfo {

	@Id
	@Column(name="property_id")
	private long propertyId;
	
	@Column(name="property_name")
	private String propertyName;
	
	@Column(name="property_start_price")
	private long startPrice;
	
	@Column(name="property_sale_starts")
	private Date saleStarts;
	
	@Column(name="property_sale_ends")
	private Date saleEnds;

	public long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public long getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(long startPrice) {
		this.startPrice = startPrice;
	}

	public Date getSaleStarts() {
		return saleStarts;
	}

	public void setSaleStarts(Date saleStarts) {
		this.saleStarts = saleStarts;
	}

	public Date getSaleEnds() {
		return saleEnds;
	}

	public void setSaleEnds(Date saleEnds) {
		this.saleEnds = saleEnds;
	}

	public PropertyInfo(long propertyId, String propertyName, long startPrice, Date saleStarts, Date saleEnds) {
		super();
		this.propertyId = propertyId;
		this.propertyName = propertyName;
		this.startPrice = startPrice;
		this.saleStarts = saleStarts;
		this.saleEnds = saleEnds;
	}

	public PropertyInfo() {
		super();
	}

	@Override
	public String toString() {
		return "PropertyInfo [propertyId=" + propertyId + ", propertyName=" + propertyName + ", startPrice="
				+ startPrice + ", saleStarts=" + saleStarts + ", saleEnds=" + saleEnds + "]";
	}
	
	
}
