package cn.com.fangself.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.com.fangself.dao.CustomerMapper;
import cn.com.fangself.model.vo.CustomerVo;

public class Customer implements cn.com.fangself.service.Customer {

	@Autowired
	CustomerMapper customerMapper ;
	
	@Override
	public void register(CustomerVo customerVo) {
		// TODO Auto-generated method stub
		System.out.println(customerMapper.getClass());
	}

}
