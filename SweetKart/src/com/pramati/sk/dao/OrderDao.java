package com.pramati.sk.dao;

import java.util.List;

import com.pramati.sk.dto.OrderBasic;
import com.pramati.sk.dto.OrderDetail;

public class OrderDao {

	/*private JDBCTemplate jdbcTemplate;

	public JDBCTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JDBCTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	
	public List<OrderBasic> getOrdersForUser(int userId){
		List<OrderBasic> orderList = null;
		
		return orderList;
	}
	
	public OrderDetail getOrderDetails(int orderId){
		OrderDetail orderDetail = null;
		
		return orderDetail;
	}
	
	public OrderDetail placeOrder(OrderDetail orderDetail){
		
		return orderDetail;
	}
}