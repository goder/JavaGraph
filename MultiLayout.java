/*
 * 多组件布局
 */

package com.bj;

import javax.swing.*;
import java.awt.*;

public class MultiLayout extends JFrame {
	
	//定义组件
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLayout m=new MultiLayout();
	}
	
	public MultiLayout(){
		//创建组件
		//Jpanel布局默认是FlowLayout
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("西瓜");
		jb2=new JButton("苹果");
		jb3=new JButton("香蕉");
		jb4=new JButton("葡8萄");
		jb5=new JButton("芒果");
		jb6=new JButton("鸭梨");
		
		//设置布局
		
		//添加组件
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		//把Panel加入JFrame
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb6);
		this.add(jp2, BorderLayout.SOUTH);
		
		
		
		//设置大小
		this.setTitle("MultiLayout");
		this.setSize(500, 500);
		this.setLocation(200,200);
		
		//设置
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.location(200,300);
		
		//设置可见
		this.setVisible(true);
		
		
		
		
		
	}
	
}
