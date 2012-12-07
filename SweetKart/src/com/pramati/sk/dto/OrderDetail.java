package com.pramati.sk.dto;

import java.util.List;

public class OrderDetail extends OrderBasic{

	private List<AtomicOrder> orderDetails;

	public List<AtomicOrder> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<AtomicOrder> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
}
