package cn.com.fangself.soft;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

class RegisterPage extends JFrame implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon registerBackground;
	private JPanel imagePanel;
	JButton regit;
	JButton reset;
	JTextField[] customInfo= new JTextField[5];
	private JLabel [] conponents= new JLabel [5];
	private String [] customPropert = {
			new String("用户名："),new String("密码："),new String("手机号码："),
			new String ("身份证号码："),new String("关联邮箱帐号：")
	};
	private JMenuBar MB = new JMenuBar();
	private JMenu file[] = new JMenu[3];
	private JMenuItem func[] = new JMenuItem[6];
	private String MBname[] = {"文件","操作","帮助","关闭","最小化","最大化","注册","重置所填","About"};
	ActionListener myListenMenu= new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==func[0]){
				System.exit(0);
			}else if(e.getSource()==func[1]){
				
			}else if(e.getSource()==func[2]){
				
			}else if(e.getSource()==func[3]){
				
			}else if(e.getSource()==func[4]){
				
			}else if(e.getSource()==func[5]){
				new HelpFrame();
			}
		}};
	RegisterPageListener listener;
	public RegisterPage(){
		// TODO Auto-generated constructor stub
		listener =new RegisterPageListener(this);
		this.setBounds(390, 100, 650, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		init();	
		this.setVisible(true);
	}
	public void init(){
		initMenu();
		this.setTitle("注册页面");
		registerBackground = new ImageIcon("registerBackground.jpg");
		JLabel label = new JLabel (registerBackground);
		label.setBounds(0,0,registerBackground.getIconWidth(),registerBackground.getIconHeight());
		imagePanel = (JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().setLayout(null);
		this.getLayeredPane().add(label,new Integer(Integer.MAX_VALUE));
		regit=new JButton("注册");
		reset=new JButton("重置");
		this.regit.setBounds(150, 335, 65, 45);
		this.reset.setBounds(395,335, 65, 45);
		this.regit.setFont(new Font("fang_1",Font.BOLD,8));
		this.reset.setFont(new Font("fang_1",Font.BOLD,8));
		this.add(this.regit);
		this.add(this.reset);
		this.regit.addActionListener(listener);
		this.reset.addActionListener(listener);
		for (int i = 0; i < conponents.length; i++) {
			this.conponents[i]=new JLabel(customPropert[i]);
			this.customInfo[i]= new JTextField();
			this.conponents[i].setFont(new Font("Fang", Font.ITALIC, 25));
			this.conponents[i].setBounds(100, 50+i*50, 230, 45);
			this.customInfo[i].setBounds(340, 50+i*50, 230, 30);
			//this.customInfo[i].addActionListener(lis);
			
			this.add(this.customInfo[i]);
			this.add(this.conponents[i]);
		}
	}
	private void initMenu() {
		// TODO Auto-generated method stub
		for (int i = 0; i < file.length; i++) {
			file[i]=new JMenu(MBname[i]);
			MB.add(file[i]);
		}
		for (int i = 0; i < func.length; i++) {
			func[i]= new JMenuItem(MBname[i+3]);
			func[i].addActionListener(myListenMenu);
			if(i<3){
				file[0].add(func[i]);
			}else if(i>2&&i<5){
				file[1].add(func[i]);
			}else{
				file[2].add(func[i]);
			}
		}
		
		this.setJMenuBar(MB);
	}
}
