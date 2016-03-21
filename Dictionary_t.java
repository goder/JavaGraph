package com.bj;

import javax.swing.*;
import java.awt.*;

public class Dictionary_t extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary_t d=new Dictionary_t();
	}
	//定义组件
	JSplitPane jsp;
	JList jList;
	JLabel jlb1;
	
	public Dictionary_t(){
		//创建组件
		String []words={"boy","girl","bird"};
		jList =new JList(words);
		//JLabel中可以插入图片
		jlb1=new JLabel(new ImageIcon("images/ciba.jpg"));
		//拆分窗格
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jList,jlb1);
		
		// 设置布局管理器
		
		//添加组件
		this.add(jsp);
		
		//设置大小
		this.setSize(500,300);
		this.setTitle("金山词霸");
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
