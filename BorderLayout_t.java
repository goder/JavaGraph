package com.bj;

import java.awt.*;
import javax.swing.*;



public class BorderLayout_t extends JFrame {
	
	//�������
	JButton jb1,jb2,jb3,jb4,jb5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayout_t b=new BorderLayout_t();

	}
	public BorderLayout_t(){
		//�������
		jb1=new JButton("�в�");
		jb2=new JButton("����");
		jb3=new JButton("����");
		jb4=new JButton("�ϲ�");
		jb5=new JButton("����");
		//������		
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.EAST);
		this.add(jb4,BorderLayout.SOUTH);
		this.add(jb5,BorderLayout.WEST);
		
		//��������
		this.setTitle("�߽簸��");
		this.setSize(400, 500);
		this.setLocation(200,300);
		
		//�رմ��ڣ������رմ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//���ô���ɼ�
		this.setVisible(true);
		
		
	}
	

}
