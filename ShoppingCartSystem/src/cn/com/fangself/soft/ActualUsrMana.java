package cn.com.fangself.soft;

class ActualUsrMana implements UsrMana {
	
	Object clientInfo;
	public ActualUsrMana() {
		// TODO Auto-generated constructor stub
	}
	public void showAllInfo(){
		PreworkCFG.clientFileConfig();//配置所有客户的信息
		new ManagerConsole();
	}
}
