package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.MyPageDto;

public interface MyPageDao {
	
	public  List<MyPageDto> myPageDao(String startDate, String endDate) throws Exception;
	

}
