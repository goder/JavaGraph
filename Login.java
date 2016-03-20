package com.bj;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
	
	//组件
	JPanel jp1,jp2,jp3;
	JButton jb1,jb2;
	JLabel jlb1,jlb2;
	JTextField jtfl;
	JPasswordField jpfl;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l=new Login();
	}
	public Login(){
		//组件
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jlb1=new JLabel("用户名");
		jlb2=new JLabel("密   码");
		
		jtfl=new JTextField(10);
		jpfl=new JPasswordField(10);
		
		jb1=new JButton("登录");
		jb2=new JButton("注册");
		
		//设置JPanel布局
		//jp1.setLayout(new FlowLayout());
		
		this.setLayout(new GridLayout(3,1));
		
		//添加组件
		jp1.add(jlb1);
		jp1.add(jtfl);
		
		jp2.add(jlb2);
		jp2.add(jpfl);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setSize(200,160);
		this.setLocation(200,200);
		this.setTitle("Login");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		
		
		
	}
}
