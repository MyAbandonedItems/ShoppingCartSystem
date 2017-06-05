package cn.com.fangself.soft;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class PreworkCFG {
	
	static void init(String path){
		//这个类方法初始化所有的文件系统
		File f= new File(path);
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public PreworkCFG() {
		// TODO Auto-generated constructor stub
	}
	void preworkFile(){
		PreworkCFG.init("cn/com/fangself/cfgFile/Login.checkdata");
	}
	static  void  PreFileconfig(File f){
		
	}
	static void clientFileConfig(){
		PreworkCFG.init("cn/com/fangself/cfgFile/clientAllInfo.clientcfg");//所有的商家信息
	}

}
