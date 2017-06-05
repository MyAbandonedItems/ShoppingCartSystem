package cn.com.fangself.soft;

import java.beans.XMLEncoder;
import java.io.OutputStream;

class RegisterPageInfoSerialization extends  XMLEncoder {

	public RegisterPageInfoSerialization(OutputStream RegisterConfig) {
		// TODO Auto-generated constructor stub
		//FileOutputStream 
		super(RegisterConfig);
	}

}
