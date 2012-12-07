package com.pramati.sk.service;

import java.util.List;

import com.pramati.sk.dto.OrderBasic;
import com.pramati.sk.dto.OrderDetail;
import com.pramati.sk.dto.SweetDetail;
import com.pramati.sk.dto.VendorDetail;

public abstract interface SweetService {

	List<VendorDetail> getVendorsForSweet(int sweetId);

	List<SweetDetail> getSweetsForVendor(int vendorId);

	VendorDetail getVendorDetails(int vendorId);

	SweetDetail getSweetDetails(int sweetId);

	List<SweetDetail> getAllSweets();

	List<VendorDetail> getAllVendors();

	List<OrderBasic> getOrdersForUser(int userId);
	
	OrderDetail getOrderDetail(int orderId);

}
