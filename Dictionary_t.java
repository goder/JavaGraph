package com.bj;

import javax.swing.*;
import java.awt.*;

public class Dictionary_t extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary_t d=new Dictionary_t();
	}
	//�������
	JSplitPane jsp;
	JList jList;
	JLabel jlb1;
	
	public Dictionary_t(){
		//�������
		String []words={"boy","girl","bird"};
		jList =new JList(words);
		//JLabel�п��Բ���ͼƬ
		jlb1=new JLabel(new ImageIcon("images/ciba.jpg"));
		//��ִ���
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jList,jlb1);
		
		// ���ò��ֹ�����
		
		//������
		this.add(jsp);
		
		//���ô�С
		this.setSize(500,300);
		this.setTitle("��ɽ�ʰ�");
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
