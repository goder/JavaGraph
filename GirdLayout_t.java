package com.bj;

import javax.swing.*;
import java.awt.*;

public class GirdLayout_t extends JFrame {
	//�������	
	JButton jbs[]=new JButton[9];
	int size=9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirdLayout_t g=new GirdLayout_t();
	}
	//���췽��
	public GirdLayout_t(){
		//�������
		for(int i=0;i<9;i++){
			jbs[i]=new JButton(String.valueOf(i));
		}
		//�������񲼾�3��3�У��м��10���м��15
		this.setLayout(new GridLayout(3,3,10,15));
		
		//�������
		for(int i=0;i<size;i++){
			this.add(jbs[i]);
		}
		//���ô�������
		this.setTitle("GirdLayout ");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		//���ÿ���
		this.setVisible(true);
		
	}

}
