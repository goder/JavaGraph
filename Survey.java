package com.bj;

import javax.swing.*;
import java.awt.*;

public class Survey extends JFrame {
	//���
	//JPanel
	JPanel jp1,jp2;
	//�������JComboBox
	JComboBox jcb=null;
	//�б�����JList
	JList jl =null;
	//�����������JScrollPane
	JScrollPane jsp=null;
	//Label
	JLabel jlb1,jlb2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Survey s=new Survey();
	}
	
	public Survey(){
		//���
		//JPanel
		jp1=new JPanel();
		jp2=new JPanel();		
		
		//Labale
		jlb1=new JLabel("����");
		jlb2=new JLabel("������");
		//����
		String [] jg={"����","�Ϻ�","����","����"};
		//�������JComboBox
		jcb=new JComboBox(jg);
		//����
		String [] dd={"�ʹ�","�찲��","�ú�԰","��̳"};

		//�б�����JList
		jl =new JList(dd);;

		//�����������JScrollPane
		jsp=new JScrollPane(jl);
		jl.setVisibleRowCount(3);
		
		
		jp1.add(jlb1);
		jp1.add(jcb);
		jp2.add(jlb2);
		jp2.add(jsp);
		
		
		
		this.setTitle("Survey");
		this.setLayout(new GridLayout(3, 1));
		this.setSize(300, 300);
		this.setLocation(200,200);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		
		
		
		
		
		
	}

}
