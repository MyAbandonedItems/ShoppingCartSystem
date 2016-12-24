package cn.com.fangself.soft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

class RegisterPageListener implements ActionListener {

	RegisterPage rl;
	private String usr;
	private String pwd;
	public RegisterPageListener(RegisterPage rl) {
		// TODO Auto-generated constructor stub
		this.rl=rl;
		System.out.println("Register starting!");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Register starting!");
		if(e.getSource()==rl.regit){
			System.out.println("Register finished!");
			rl.dispose();
			new LoginFrame(rl.customInfo[0].getText(),rl.customInfo[1].getText());
			System.out.println("Register before finished!");
			try {
				File regitFiledata = new File("customerInfo.data");
				PreworkCFG.PreFileconfig(regitFiledata);//假如文件不存在，就调用预处理类创建一份
				 XMLEncoder Reg=new  XMLEncoder(
						new BufferedOutputStream(
								new FileOutputStream(regitFiledata)));
				for (int i = 0; i < rl.customInfo.length; i++) {
					 Reg.writeObject(rl.customInfo[i]);
				}
				 Reg.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}else if(e.getSource() == rl.reset){
			System.out.println("Cancel");
			for (int i = 0; i < rl.customInfo.length; i++) {
				rl.customInfo[i].setText("");
			}
		}
	}

}
