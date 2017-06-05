package cn.com.fangself.soft;

class CustomshoppingCart {
	CustomInfo customer;
	String Gname;
	int Gamount;
	float Gprice;
	int GID;
	public CustomshoppingCart() {
		// TODO Auto-generated constructor stub
	}
	public void setGname(String name){
		this.Gname=name;
	}
	public void setCustomer(CustomInfo customer) {
		this.customer = customer;
	}
	public void setGamount(int gamount) {
		Gamount = gamount;
	}
	public void setGprice(float gprice) {
		Gprice = gprice;
	}
	public void setGID(int gID) {
		GID = gID;
	}
	

}
