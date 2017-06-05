package cn.com.fangself.soft;

class ClientInfo {
	//商家信息类
	String ID;
	String PWD;
	String IDCardInfo;
	float RegitStock;
	int GoodsKindsNum;//货品种类
	public ClientInfo() {
		// TODO Auto-generated constructor stub
	}
	public ClientInfo(String id, String pwd, String IDc,float rs,int gm){
		this.ID=id;
		this.PWD=pwd;
		this.IDCardInfo=IDc;
		this.RegitStock=rs;
		this.GoodsKindsNum=gm;
	}
	void setID(String iD) {
		ID = iD;
	}
	void setPWD(String pWD) {
		PWD = pWD;
	}
	void setIDCardInfo(String iDCardInfo) {
		IDCardInfo = iDCardInfo;
	}
	void setRegitStock(float regitStock) {
		RegitStock = regitStock;
	}
	void setGoodsKindsNum(int goodsKindsNum) {
		GoodsKindsNum = goodsKindsNum;
	}
	
}
