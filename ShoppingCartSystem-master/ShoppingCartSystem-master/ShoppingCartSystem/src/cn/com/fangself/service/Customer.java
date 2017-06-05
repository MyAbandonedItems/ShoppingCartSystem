package cn.com.fangself.service;

import org.springframework.stereotype.Service;

import cn.com.fangself.model.vo.CustomerVo;

@Service("Customer")
public interface Customer {

	void register(CustomerVo customerVo);
	
}
