/*
 * ���������
 */

package com.bj;

import javax.swing.*;
import java.awt.*;

public class MultiLayout extends JFrame {
	
	//�������
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLayout m=new MultiLayout();
	}
	
	public MultiLayout(){
		//�������
		//Jpanel����Ĭ����FlowLayout
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("����");
		jb2=new JButton("ƻ��");
		jb3=new JButton("�㽶");
		jb4=new JButton("��8��");
		jb5=new JButton("â��");
		jb6=new JButton("Ѽ��");
		
		//���ò���
		
		//������
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		//��Panel����JFrame
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb6);
		this.add(jp2, BorderLayout.SOUTH);
		
		
		
		//���ô�С
		this.setTitle("MultiLayout");
		this.setSize(500, 500);
		this.setLocation(200,200);
		
		//����
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.location(200,300);
		
		//���ÿɼ�
		this.setVisible(true);
		
		
		
		
		
	}
	
}
