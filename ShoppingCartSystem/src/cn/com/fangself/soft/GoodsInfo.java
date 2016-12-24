package cn.com.fangself.soft;

class GoodsInfo {
	String Gname;
	int GID;//货品的ID均使用9位Int整形
	float Gprice;
	int Gamount;
	public void setGname(String gname) {
		Gname = gname;
	}
	public void setGID(int gID) {
		GID = gID;
	}
	public void setGprice(float gprice) {
		Gprice = gprice;
	}
	public void setGamount(int gamount) {
		Gamount = gamount;
	}
	public void setGremain(int gremain) {
		Gremain = gremain;
	}
	int Gremain;
	public GoodsInfo() {
		// TODO Auto-generated constructor stub
	}

}
