package cn.com.fangself.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

class LoginFrameListener implements ActionListener {
/**
 * 监听LoginFrame窗口，并且重载两个构造方法，
 * LoginFrameListener(LoginFrame ff)为监听LoginFrame中的各组件的方法
 * public LoginFrameListener(LoginFrame f,InfoCheck ic) 为监听各组件以及传�?�消息并且验证的方法
 * */
	LoginFrame lf;
	Object icheck;
	
	public LoginFrameListener(LoginFrame ff){
		this.lf=ff;
	}
	public LoginFrameListener(LoginFrame f,Object ic) {
		this.lf=f;
		icheck = ic;
	}
	@Override
	public void actionPerformed(ActionEvent e) {/*
		if(e.getSource()==lf.login){
			if(lf.usrModeOnData instanceof ActualUsrClient){
				ActualUsrClient client = (ActualUsrClient)lf.usrModeOnData;
				client.showMyProducts();
			}else if(lf.usrModeOnData instanceof ActualUsrCustom){
				ActualUsrCustom custom=	(ActualUsrCustom)lf.usrModeOnData;
				custom.readAllInfo();
			}else if(lf.usrModeOnData instanceof ActualUsrMana){
				ActualUsrMana mana=	(ActualUsrMana)lf.usrModeOnData;
				mana.showAllInfo();
			}
			//System.out.println(lf.getClass()+"登录按钮被按下！！！");
			System.out.println("ok");
			ChanggeVal();
			
			lf.LFpwd=lf.pwdInfo.getText();
			lf.LFusr=lf.usrInfo.getText();
			System.out.println("密码"+lf.LFpwd);
			System.out.println("用户"+lf.LFusr);
			if(((ActualIdentityInfoCheck) icheck).infoCheck(lf.LFusr,lf.LFpwd)){
				JOptionPane.showMessageDialog(null, "账户-密码验证失败�?10s 后�??�?");
				//check failed ! Exit the program after 10 seconds!!
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0); 
			}else{
				//System.out.println("Login succeed!!!!!!");
			}
			lf.dispose();
		
			}else if(e.getSource()==lf.reset){
			//如果点击取消按钮的话
			//System.out.println(lf.getClass()+"取消按钮被按下！！！");
				lf.usrInfo.setText(" ");
				lf.pwdInfo.setText("");
		}else if(e.getSource()==lf.regit){
			//new RegisterPage();
		}
		
	*/}

	private void ChanggeVal() {/*
		// TODO Auto-generated method stub
		if(icheck instanceof ActualIdentityInfoCheck){
			this.icheck=(ActualIdentityInfoCheck)icheck;
		}else{
			JOptionPane.showMessageDialog(null, "身份验证出错�?");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//return;
		}
	*/}

}
