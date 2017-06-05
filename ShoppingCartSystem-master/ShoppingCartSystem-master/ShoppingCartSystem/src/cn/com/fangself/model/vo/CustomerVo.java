package cn.com.fangself.model.vo;

import cn.com.fangself.model.pojo.Customer;

public class CustomerVo extends Customer {
	String phoneNum;
	String IDCardNum;
	String Email;
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getIDCardNum() {
		return IDCardNum;
	}
	public void setIDCardNum(String iDCardNum) {
		IDCardNum = iDCardNum;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "CustomerVo [phoneNum=" + phoneNum + ", IDCardNum=" + IDCardNum + ", Email=" + Email + "]";
	}
	
	
	
}