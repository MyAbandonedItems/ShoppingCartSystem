package cn.com.fangself.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelpFrame extends JFrame {

	public HelpFrame(){
		this.setTitle("å¸®åŠ©");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(440,250,400,300);
		JLabel Cop = new JLabel ("Copyright@ è½¯ä»¶1503æ–¹ç‡•å¹?");
		JLabel time = new JLabel ("äº?2016å¹?12æœ?18æ—?");
		Cop.setBounds(100, 120, 300, 30);
		time.setBounds(0, 270, 300, 30);
		this.add(Cop);
		this.add(time);
		this.setVisible(true);
	}
}
