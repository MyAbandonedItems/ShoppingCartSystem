package cn.com.fangself.soft;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
class ShowProducts extends JFrame {
	
	JLabel pic = new JLabel (new ImageIcon("cn/com/fangself/picture/background.jpg"));
	ShowProducts(){
		this.setTitle("商家信息");
		this.setBounds(100, 100, 800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(pic);
		this.setVisible(true);
	}
	public void paint(Graphics g){
		super.paint(g);
	}
}
