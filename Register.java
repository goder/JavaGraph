package com.bj;

import javax.swing.*;

import java.awt.*;


public class Register extends JFrame {
	//组件
	JPanel jp1,jp2,jp3;
	ButtonGroup bg1,bg2;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;		
	JCheckBox jcb1,jcb2,jcb3;
	JRadioButton jrb1,jrb2;
	
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Register r=new Register();
		
	}
	
	public Register(){
		//组件	
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		bg1=new ButtonGroup();
		
		
		jlb1=new JLabel("运动：");
		jlb2=new JLabel("性别：");
		
		
		jb1=new JButton("注册用户");
		jb2=new JButton("取消注册");
		
		jcb1=new JCheckBox("足球");
		jcb2=new JCheckBox("篮球");
		jcb3=new JCheckBox("网球");
		
		jrb1=new JRadioButton("男");
		jrb2=new JRadioButton("女");
		
		//设置添加组件到jpanel
		jp1.add(jlb1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		//单选框必须添加到ButtonGroup
		bg1.add(jrb1);
		bg1.add(jrb2);		
				
		jp2.add(jlb2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		//设置布局JPanel添加
		this.add(jp1, BorderLayout.NORTH);		
		this.add(jp2, BorderLayout.CENTER);
		this.add(jp3, BorderLayout.SOUTH);
		this.setLayout(new GridLayout(3, 3));
		this.setTitle("注册");
		this.setSize(300, 150);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
		
		
		
		
		
	}

}
