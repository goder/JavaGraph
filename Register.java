package com.bj;

import javax.swing.*;

import java.awt.*;


public class Register extends JFrame {
	//���
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
		//���	
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		bg1=new ButtonGroup();
		
		
		jlb1=new JLabel("�˶���");
		jlb2=new JLabel("�Ա�");
		
		
		jb1=new JButton("ע���û�");
		jb2=new JButton("ȡ��ע��");
		
		jcb1=new JCheckBox("����");
		jcb2=new JCheckBox("����");
		jcb3=new JCheckBox("����");
		
		jrb1=new JRadioButton("��");
		jrb2=new JRadioButton("Ů");
		
		//������������jpanel
		jp1.add(jlb1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		//��ѡ�������ӵ�ButtonGroup
		bg1.add(jrb1);
		bg1.add(jrb2);		
				
		jp2.add(jlb2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		//���ò���JPanel���
		this.add(jp1, BorderLayout.NORTH);		
		this.add(jp2, BorderLayout.CENTER);
		this.add(jp3, BorderLayout.SOUTH);
		this.setLayout(new GridLayout(3, 3));
		this.setTitle("ע��");
		this.setSize(300, 150);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
		
		
		
		
		
	}

}
