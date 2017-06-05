package cn.com.fangself.ui;


import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import  javax.swing.tree.TreePath;

@SuppressWarnings("serial")
public class ManagerConsole extends JFrame implements MouseListener , TreeSelectionListener{

	/**
	 * @author fyp from 1503
	 *ManagerConsole 的作用：
	 *创建�?个Frame,以管理员身份登录之后能够通过该窗口实现对商家和顾客的完全控制
	 *@param content Private JPanel
	 * @param ContPane Private Box
	 * @param content Private JTree
	 */
	static int count=0;
	static boolean FLAG=false;
	private JTree content/*_Client,content_Custom*/;
	private Box ContPane;
	private JPanel InfoPane = new JPanel();
	JTextField infoFd[] = new JTextField[5]; 
	Vector<DefaultMutableTreeNode> clientNode = new  Vector<DefaultMutableTreeNode>(10,10);
	Vector<DefaultMutableTreeNode> customNode = new  Vector<DefaultMutableTreeNode>(10,10);
	private String clientCFGPath ="cn/com/fangself/cfgFile/ClientInfo.xml";
	private String  customCFGPath ="cn/com/fangself/cfgFile/CustomInfo.xml";
	private JButton addUsr = new JButton("添加�?个用�?");
	private JButton reset = new JButton("重填信息");
	private JMenuBar MB = new JMenuBar();
	private JMenu file[] = new JMenu[3];
	private JMenuItem func[] = new JMenuItem[6];
	private String MBname[] = {"文件","操作","帮助","关闭","最小化","最大化","添加用户","重置密码","About"};
	ActionListener myListenMenu= new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==func[0]){
				System.exit(0);
			}else if(e.getSource()==func[1]){
				
			}else if(e.getSource()==func[2]){
				
			}else if(e.getSource()==func[3]){
				addClient();
			}else if(e.getSource()==func[4]){
				for (int i = 0; i < infoFd.length; i++) {
					infoFd[i].setText("");
				}
			}else if(e.getSource()==func[5]){
				new HelpFrame();
			}
		}};
	ManagerConsole(){
		this.setBounds(240, 150, 800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("管理员控制面�?");
		this.setLayout(null);
		initTree();
		initPane();
		this.addMouseListener(this);
		this.setVisible(true);
	}
//	private void editInfoPane(ClientInfo client) {
	/*
		*//**
		 * <h4>功能：绘制左边的用户信息�?
		*//*
		//InfoPane.setBackground(Color.WHITE);
		InfoPane.setLayout(null);
		JLabel info[] = new JLabel[5];
		String infoName[] = {"用户�?:","密码:","身份证号�?:","货种数目:","注册资金:"};
		
		infoFd[0]= new JTextField(client.ID);
		infoFd[1]= new JTextField(client.PWD);
		infoFd[2]= new JTextField(client.IDCardInfo);
		infoFd[3]= new JTextField(String.valueOf(client.GoodsKindsNum));
		infoFd[4]= new JTextField(String.valueOf(client.RegitStock));
		
		for (int i = 0; i < info.length; i++) {
			//info[i].setFont(new Font("Fang", Font.BOLD, 28));
			info[i]= new JLabel(infoName[i]);
			info[i].setBounds(100, 100+i*50, 120, 35);
			InfoPane.add(info[i]);
		}
		for (int i = 0; i < infoFd.length; i++) {
			infoFd[i].setBounds(200, 100+i*50, 400, 35);
			InfoPane.add(infoFd[i]);
		}
		
	*/
	//}
	private void initPane() {
		/**
		 * <h4>功能：绘制整个面�?
		*/
	initMenu();
		
		if(null==ContPane){
			ContPane = Box.createHorizontalBox();
		}
		/*ContPane.setBounds(620, 20, 180, 500);
		InfoPane.setBounds(0, 20, 500, 500);
		//InfoPane.setBackground();
		ClientInfo client=new ClientInfo(" "," "," ",-0.01F,0);
		this.editInfoPane(client);
		
		
		
		addUsr.setBounds(100, 400, 100, 30);
		reset.setBounds(400, 400, 100, 30);
		Font myFont=new Font("123",Font.BOLD,8);
		addUsr.setFont(myFont);
		reset.setFont(myFont);
		addUsr.addMouseListener(this);
		reset.addMouseListener(this);
		InfoPane.add(addUsr);
		InfoPane.add(reset);
		
		ContPane.add(new JScrollPane(content));
		this.add(ContPane);
		this.add(InfoPane);*/
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
	private void initTree() {/*
		*//**
		 * <h4>功能：初始化目录
		*//*
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("信息");
		DefaultMutableTreeNode root_Client =new DefaultMutableTreeNode("商家");
		DefaultMutableTreeNode root_Custom = new DefaultMutableTreeNode("顾客");
		root.add(root_Client);
		root.add(root_Custom);
		////addClient();
		List<ClientInfo> clients =XmlFuncForClientInfo.selectXML(clientCFGPath);
		List<CustomInfo> customs =XmlFuncForCustomInfo.selectXML(customCFGPath);
		
		
		for (int i = 0; i < clients.size(); i++) {
			clientNode.add(new DefaultMutableTreeNode(clients.get(i).ID));
			root_Client.add(clientNode.get(i));
		}
		for (int i = 0; i < customs.size(); i++) {
			customNode.add(new DefaultMutableTreeNode(customs.get(i).ID));
			root_Custom.add(customNode.get(i));
		}
		if(null==content){
			content = new JTree(root);
			content.addTreeSelectionListener(this);
		}
	*/}
	@Override
	public void valueChanged(TreeSelectionEvent evt) {
		/**
		 * <h4>功能：实现对树的节点的监�?
		*/
		 TreePath[] paths = evt.getPaths();
		 
         for (int i=0; i<paths.length; i++) {/*
             // 如果处于选择状�??
             if (evt.isAddedPath(i)) {
               // 将路径转化为节点数组
               Object[] nodes=paths[i].getPath();
              
               // 得到�?后一个节�?,即�?�择的节�?
               DefaultMutableTreeNode node=(DefaultMutableTreeNode)nodes[nodes.length-1];
              
               // 输出节点�?
               System.out.println(node.toString());   
               //实现对节点的操作
               //此处即是对点击的节点显示该客户的具体信息
               ClientInfo clientss =  XmlFuncForClientInfo.selectXMLByID(clientCFGPath,node.toString());
               this.editInfoPane(clientss);
               this.validate();
             }
         */}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.addUsr){
			addClient();
			
		}else if(e.getSource()==this.reset){
			for (int i = 0; i < infoFd.length; i++) {
				infoFd[i].setText("");
			}
		}
		this.validate();
	}
	private void addClient() {
		// TODO Auto-generated method stub
		
		String id = infoFd[0].getText();
		String pwd = infoFd[1].getText();
		String IDC = infoFd[2].getText();
		String kinds = infoFd[3].getText();
		String Stock =infoFd[4].getText();
		System.out.println(id);
		//ClientInfo client_= new ClientInfo(id,pwd,IDC,Float.parseFloat(Stock),Integer.parseInt(kinds));
		//System.out.println(id+pwd+IDC+kinds+Stock);
	//	XmlFuncForClientInfo.addXML(clientCFGPath, client_);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
