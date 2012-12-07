package com.pramati.sk.dto;

public class AtomicOrder {

	private SweetBasic sweetOrdered;
	private VendorBasic vendorRequested;
	private float amountOrdered;
	
	public SweetBasic getSweetOrdered() {
		return sweetOrdered;
	}
	public void setSweetOrdered(SweetBasic sweetOrdered) {
		this.sweetOrdered = sweetOrdered;
	}
	public VendorBasic getVendorRequested() {
		return vendorRequested;
	}
	public void setVendorRequested(VendorBasic vendorRequested) {
		this.vendorRequested = vendorRequested;
	}
	public float getAmountOrdered() {
		return amountOrdered;
	}
	public void setAmountOrdered(float amountOrdered) {
		this.amountOrdered = amountOrdered;
	}
	
	
}
