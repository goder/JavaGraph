/*
 * 通过键盘控制小球移动
 */
package com.bj.event;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class BallRolling extends JFrame{
	MyPanel mp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BallRolling br=new BallRolling();
	}
	public BallRolling(){
		mp=new MyPanel();
		
		this.add(mp);
		this.addKeyListener(mp);
		
		this.setSize(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}


//定义自己面板
class MyPanel extends JPanel implements KeyListener{
	
	int x=10;
	int y=10;
	
	
	
	public void paint (Graphics g){
		super.paint(g);
		g.fillOval(x, y, 20, 20);
	}

	//具体按下某一个键
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("KeyType");
	}
	//键按下
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("KeyPressed"+(char)e.getKeyCode());
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			//System.out.println("12");
			this.y+=10;
			
		}else if(e.getKeyCode()==KeyEvent.VK_UP){
			this.y-=10;
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT){
			this.x-=10;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			this.x+=10;
		}
		//调用重绘函数repaint
		this.repaint();
		
		
	}
	//键松开
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("KeyReleased");
	}
	
	
}
