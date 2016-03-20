package com.bj;

import javax.swing.*;
import java.awt.*;

public class Survey extends JFrame {
	//组件
	//JPanel
	JPanel jp1,jp2;
	//下拉组件JComboBox
	JComboBox jcb=null;
	//列表框组件JList
	JList jl =null;
	//滚动窗格组件JScrollPane
	JScrollPane jsp=null;
	//Label
	JLabel jlb1,jlb2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Survey s=new Survey();
	}
	
	public Survey(){
		//组件
		//JPanel
		jp1=new JPanel();
		jp2=new JPanel();		
		
		//Labale
		jlb1=new JLabel("籍贯");
		jlb2=new JLabel("旅游区");
		//城市
		String [] jg={"北京","上海","广州","深圳"};
		//下拉组件JComboBox
		jcb=new JComboBox(jg);
		//城市
		String [] dd={"故宫","天安门","颐和园","天坛"};

		//列表框组件JList
		jl =new JList(dd);;

		//滚动窗格组件JScrollPane
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
