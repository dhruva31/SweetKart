package com.pramati.sk.dto;

public class VendorBasic {

	private int vendorId;
	private String vendorName;
	
	public VendorBasic(int vendorId, String vendorName) {
		this.vendorId = vendorId;
		this.vendorName = vendorName;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
}
