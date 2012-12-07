package com.pramati.sk.dao;

import java.util.List;

import com.pramati.sk.dto.SweetBasic;
import com.pramati.sk.dto.SweetDetail;
import com.pramati.sk.dto.VendorBasic;
import com.pramati.sk.dto.VendorDetail;

public class SweetKartDao {
	
	/*private JDBCTemplate jdbcTemplate;

	public JDBCTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JDBCTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	
	public SweetDetail retrieveSweetDetails(int sweetId){
		SweetDetail sweetDetail = null;
		
		return sweetDetail;
	}
	
	public VendorDetail retrieveVendorDetail(int vendorId){
		VendorDetail vendorDetail = null;
		
		return vendorDetail;
	}

	public List<SweetBasic> getAllSweets(){
		List<SweetBasic> sweetList = null;
		
		return sweetList;
	}
	
	public List<VendorBasic> getAllVendors(){
		List<VendorBasic> vendorBasic = null;
		
		return vendorBasic;
	}
}

