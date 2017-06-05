package cn.com.fangself.soft;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



class ActualIdentityInfoCheck implements IdentityInfoCheck {

	String oldusr ;
	String oldPwd ;
	Object usrmode;
	public ActualIdentityInfoCheck(Object usrmode){
		this.usrmode=usrmode;
	}
	public ActualIdentityInfoCheck(String oldusr ,String oldPwd,Object usrmode) {
		// TODO Auto-generated constructor stub
		/**
		 * @author fyp
		 * @param oldusr 用户提供的账户名
		 * @param oldPwd 用户提供的密码
		 * @param UsrMode 登录模式
		 * UsrMana:管理员
		 * UsrClient：商家
		 * UsrCustom：客户
		 * */
	this.oldusr=oldusr;
	this.oldPwd=oldPwd;
	this.usrmode=usrmode;//将传进来的模式对象用usrmode接收
	
	}

	@Override
	public  boolean infoCheck(String oldusr ,String oldPwd){
		/**
		 * @author fyp
		 * @param oldusr 用户提供的账户名
		 * @param oldPwd 用户提供的密码
		 * 功能：验证用户提供的账户和密码是否匹配数据库
		 * 
		 * */
		boolean flag=false;//用于获取验证结果，默认验证不通过
		String usrs ="CustomInfo";//默认以客户身份查询
		String usrOnData="";//在数据库中的三个user
		if(this.usrmode instanceof ActualUsrMana){
			usrs="ManagerInfo";
			usrOnData="MonthProDB_Manager";
		}else if(this.usrmode instanceof ActualUsrClient){
			usrs="ClientInfo";
			usrOnData="MonthProDB_Client";
		}else if(this.usrmode instanceof ActualUsrCustom){
			usrs="CustomInfo";
			usrOnData="MonthProDB_Custom";
		}
		
		return false;
	}

}
