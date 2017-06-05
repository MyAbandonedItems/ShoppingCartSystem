package cn.com.fangself.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.fangself.dao.CustomerMapper;
import cn.com.fangself.model.vo.CustomerVo;

class RegisterPageListener implements ActionListener {

	@Autowired
	CustomerMapper customerMapper;
	
	private void init(){
//		this.customerMapper
		AbstractApplicationContext applicationContext  =
				new ClassPathXmlApplicationContext("spring-mybatis.xml");
		System.out.println("init method");
		SqlSessionFactory sqlSessionFactory  = 
				(SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//Connection connection = sqlSession.getConnection();
		customerMapper = (CustomerMapper)applicationContext.getBean("customerMapper");
		System.out.println(customerMapper.getClass());
	}
	
	RegisterPage rl;
	private String usr;
	private String pwd;
	public RegisterPageListener(RegisterPage rl) {
		// TODO Auto-generated constructor stub
		init();
		this.rl=rl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Register starting!");
		if(e.getSource()==rl.regit){
			CustomerVo customerVo = new CustomerVo();
			customerVo.setCustomername(rl.customInfo[0].getText());
			customerVo.setCustomerpwd(rl.customInfo[1].getText());
			customerVo.setPhoneNum(rl.customInfo[2].getText());
			customerVo.setIDCardNum(rl.customInfo[3].getText());
			customerVo.setEmail(rl.customInfo[4].getText());
			
			//System.out.println(customerMapper.getClass());
			//customer.register(customerVo);
			
		}else if(e.getSource() == rl.reset){
			System.out.println("Cancel");
			for (int i = 0; i < rl.customInfo.length; i++) {
				rl.customInfo[i].setText("");
			}
		}
	}

}
