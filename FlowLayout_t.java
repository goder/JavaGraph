package com.bj;

import java.awt.*;

import javax.swing.*;

public class FlowLayout_t extends JFrame {

	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
	public FlowLayout_t()  {
		
		//�������
				jb1=new JButton("����");
				jb2=new JButton("����");
				jb3=new JButton("����");
				jb4=new JButton("����");
				jb5=new JButton("����");
				jb6=new JButton("����");
				jb7=new JButton("����");
				//������		
				this.add(jb1);
				this.add(jb2);
				this.add(jb3);
				this.add(jb4);
				this.add(jb5);
				this.add(jb6);
				this.add(jb7);
				//���ò��ֹ�����
				//this.setLayout(new FlowLayout());
				//this.setLayout(new FlowLayout(FlowLayout.LEFT));
				this.setLayout(new FlowLayout(FlowLayout.LEFT));
				//���ù̶�����
				this.setResizable(false);
				
				//���ô�������
				this.setTitle("�������ְ���");
				this.setSize(300, 300);
				this.setLocation(200,200);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//��ʾ
				this.setVisible(true);
				
				
				
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayout_t f=new FlowLayout_t();
	}

}
