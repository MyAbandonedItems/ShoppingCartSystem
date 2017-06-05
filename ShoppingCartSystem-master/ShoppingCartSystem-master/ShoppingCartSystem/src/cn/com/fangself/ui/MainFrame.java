package cn.com.fangself.ui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


class MainFrame extends JFrame {
	/**
	 * 功能：从数据库中提取数据并将数据填充到JTable�?
	 * step1：先将数据从数据库中提取出来放到Vector�?
	 * step2：再将Vector中的数据填充到Jtable�?
	 * */
	
	public static int MAX_NUM_ON_TABLE=100;
	private int size=0;
	String customCfgPath="cn/com/fangself/cfgFile/GoodsInfo.xml";
	private Vector<String> Gname =new Vector<String>();
	private Vector<Integer>GID = new Vector<Integer>();
	private Vector<Double>Gprice =new Vector<Double>();
	private Vector<Integer>Gamount =new Vector<Integer>();
	private Vector<Integer>Gremain = new Vector<Integer>();
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
				
			}else if(e.getSource()==func[4]){
				
			}else if(e.getSource()==func[5]){
				new HelpFrame();
			}
		}};
	MainFrame(){
		this.setBounds(240, 100, 800, 630);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("购物车系�?");
		this.setLayout(null);
		initMenu();
		initTable();
		this.setVisible(true);
	}
private void initData(){
	/**
	 * 将数据库中的数据加入向量�?,此类同样是采用文件系统，不用数据库，故之前写的部分代码被注释
	 * */
	//String sql = "select * from GoodsInfo;";
	try {
		/*DButil connection = DButil.getInstance("MonthProDB_Client");
		Connection conn = connection.getConnection();
		Statement stmt =conn.createStatement();
		ResultSet rs =stmt.executeQuery(sql);*/
		//while(rs.next()){
		// List<GoodsInfo> goods = XmlFuncForGoodsInfo.selectXML(customCfgPath);
		// size=goods.size();
		 
		/*for (int i = 0; i < goods.size(); i++) {
			 Gname.addElement( goods.get(i).Gname);
			 GID.addElement(goods.get(i).GID);
			 Gprice.addElement(Double.parseDouble(String.valueOf(goods.get(i).Gprice)));
			 Gamount.addElement(Integer.decode(String.valueOf(goods.get(i).Gamount)));
			 Gremain.addElement(Integer.decode(String.valueOf(goods.get(i).Gremain)));
		}*/
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
	private void initTable() {
/**
 * 将向量中的数据加入一个数组，再加入JTable，至于为�?么不直接使用向量，是因为建JTable的模型不支持Vector
 * */
		initData();
		String[] headers = {"商品名称", "商品序列�?","价格", "总数", "剩余"};
		Object[][] cellData = null;
		DefaultTableModel model = new DefaultTableModel(cellData, headers) {
		  public boolean isCellEditable(int row, int column) {
		    return false;
		  }
		};
		model.addRow(headers);
		System.out.println("here!!!");
		String [][] info = new String[MAX_NUM_ON_TABLE][5];
		for (int i =0; i < MAX_NUM_ON_TABLE&&i<size; i++) {
			
			//System.out.println("商品名称"+Gname.elementAt(i));
			info[i][0]=new String(Gname.elementAt(i));//将向量中的数据填充入数组�?
			info[i][1]=new String(GID.elementAt(i).toString());
			info[i][2]=new String(Gprice.elementAt(i).toString());
			info[i][3]=new String(Gamount.elementAt(i).toString());
			info[i][4]=new String(Gremain.elementAt(i).toString());
			if(info[i]!=null){
				model.addRow(info[i]);
			}
		}
		JTable table = new JTable(model);
		table.setBounds(0, 30, 800, 600);
		JScrollPane jsInfo=new JScrollPane(table);
		jsInfo.setBounds(0, 30, 800, 600);
		this.add(jsInfo);
		
	}
}
