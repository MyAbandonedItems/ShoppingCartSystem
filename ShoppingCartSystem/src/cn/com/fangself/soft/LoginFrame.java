package cn.com.fangself.soft;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
public class LoginFrame extends JFrame implements ActionListener {

	/**
	 * 功能：产生一个登录界面,供用户选择自己的身份，
	 * 只有当用户输入正确的账户和匹配的密码之后，程序才会进入下一界面
	 * @param:  LFpwd ,LFusr  分别从TextField 和PasswordFiled 中获取的值
	 * @param: usrModeOnData 从单选按钮获取的对应的对象，此对象用来传递用户在单选按钮中选择的模式，
	 * 具体的实现类有ActualUsrMana ActualUsrClient ActualUsrCustom 三个类
	 * @param:reset login usrMode usr pwd usrInfo pwdInfo  JRBtnGp usrModSITem 均为见名知意的JFrame中的相应组件 
	 * 其中需要特别说明的是，JRBtnGp是一个单选按钮的组，加入这个组可以使单选按钮真正实现在同一时刻只能有一个被选中
	 * @param:usrModeName 是加入标签需要使用的数组，"管理员" "商家""客户"的顺序固定，在之后的代码中均采用此顺序
	 * */
	private static final long serialVersionUID = 1L;
	String LFpwd;
	String LFusr;
	Object usrModeOnData;//用来传递使用者模式
	JButton reset;
	JButton login;
	JButton regit;
	private JLabel usrMod,usr,pwd;
	JTextField usrInfo=new JTextField();
	JPasswordField pwdInfo= new JPasswordField();
	private ButtonGroup JRBtnGp = new ButtonGroup();
	JRadioButton usrModSItem[] = new JRadioButton[3];
	private String usrModName[]={new String("管理员"),
					new String("商家"),new String("客户")};

	public LoginFrame() throws InterruptedException{
		 
		this.setBounds(440, 250, 400, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);
		initAll();
		
		this.addActionListenerInitAll();
			
		this.setVisible(true);
	}
	
	public LoginFrame(String a,String b){
		/** 填完注册页面之后进入此入口，默认选择顾客模式，默认填写注册页面上填的账户名和密码
		 * */
		this.setBounds(440, 250, 400, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);
		initAll();
		this.usrInfo.setText(a);
		this.pwdInfo.setText(b);
		this.usrModeOnData=new ActualUsrCustom();
			
		this.setVisible(true);
	}
	private void initAll(){
		reset =new JButton("取消");
		login =new JButton("登录");
		usrMod =new JLabel("用户类型:");
		usr =new JLabel("用  户  名:");
		pwd = new JLabel("密      码:");
		regit=new JButton("注册");
		this.setTitle("登录面板");
		
		reset.setBounds(90, 220, 50, 15);
		login.setBounds(260, 220, 50, 15);
		regit.setBounds(350, 0, 50, 15);
		Font font = new  Font("ButtonFont",Font.BOLD,8);
		//由于按钮比较小，使用自定义的字体更为美观
		reset.setFont(font);
		login.setFont(font);
		regit.setFont(font);
		usrInfo.setBounds(180, 130, 120, 20);
		pwdInfo.setBounds(180, 160, 120, 20);
		pwdInfo.setPreferredSize(new Dimension(120,20));
		 usrMod.setBounds(100,100, 80, 20);
		 usr.setBounds(100,130, 80, 20);
		 pwd.setBounds(100,160, 80, 20);
			 
		 this.add(regit);
		 this.add(reset);
		 this.add(login);
		 this.add(usrInfo);
		 this.add(pwdInfo);
		 this.add(usrMod);
		  this.add(usr);
		 this.add(pwd);
	
		 
		 initRadioBt();
	}
	private void addActionListenerInitAll() {
		// TODO Auto-generated method stub
		 
		 reset.addActionListener(new LoginFrameListener(this));
		// login.addActionListener(new LoginFrameListener(this));
		 //当用户按下登录按钮时验证输入信息
		 login.addActionListener(new LoginFrameListener(
					this,new ActualIdentityInfoCheck(this.usrModeOnData
							/*this.LFusr,this.LFpwd,this.usrModeOnData*/)));
		 regit.addActionListener(new LoginFrameListener(this));
		 usrInfo.addActionListener(new LoginFrameListener(this));
		 pwdInfo.addActionListener(new LoginFrameListener(this));	
	}
	private void initRadioBt(){
		
		/* *
		 * 初始化单选按钮的相关组件
		 * *监听用户的选择，目前只能实现不可修改的选项，
		 * 这意味着用户一旦选错只有退出程序再次进入才能实现改选**/
		for (int i = 0; i < usrModSItem.length; i++) {
			usrModSItem[i] = new JRadioButton(usrModName[i]);
			usrModSItem[i].setBounds(170+i*65,100,65,20);
			JRBtnGp.add(usrModSItem[i]);
			this.add(usrModSItem[i]);
			usrModSItem[i].addActionListener(this);
		}
		//this.add(JRBtnGp);
	}
	@Override
	public void actionPerformed(ActionEvent modee) {
		// TODO Auto-generated method stub
		/**
		 * 当用户选择某种模式登录时，点中哪一个选项，就相应创建某一个角色的对象并赋值到usrModeOnData
		 * */
		
			if(this.usrModSItem[0].isSelected()){
				System.out.println("管理员mana模式开辟内存");
				this.usrModeOnData=new ActualUsrMana();
			}else if(this.usrModSItem[1].isSelected()){
				System.out.println("用户client模式开辟内存");
				this.usrModeOnData=new ActualUsrClient();
			}else if(this.usrModSItem[2].isSelected()){
				System.out.println("客户custom模式开辟内存");
				this.usrModeOnData=new ActualUsrCustom();
			}
		
	
	}
	


}
