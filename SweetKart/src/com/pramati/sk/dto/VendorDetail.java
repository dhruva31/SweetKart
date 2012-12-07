package com.pramati.sk.dto;

public class VendorDetail extends VendorBasic{

	public VendorDetail(int vendorId, String vendorName,
			String vendorDescription) {
		super(vendorId, vendorName);
		this.vendorDescription = vendorDescription;
	}

	private String vendorDescription;
	
	public String getVendorDescription() {
		return vendorDescription;
	}

	public void setVendorDescription(String vendorDescription) {
		this.vendorDescription = vendorDescription;
	}
}
