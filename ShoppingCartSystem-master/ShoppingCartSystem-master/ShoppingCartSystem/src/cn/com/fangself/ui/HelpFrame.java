package cn.com.fangself.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelpFrame extends JFrame {

	public HelpFrame(){
		this.setTitle("帮助");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(440,250,400,300);
		JLabel Cop = new JLabel ("Copyright@ 软件1503方燕�?");
		JLabel time = new JLabel ("�?2016�?12�?18�?");
		Cop.setBounds(100, 120, 300, 30);
		time.setBounds(0, 270, 300, 30);
		this.add(Cop);
		this.add(time);
		this.setVisible(true);
	}
}
