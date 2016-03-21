/*
 * ͨ�����̿���С���ƶ�
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


//�����Լ����
class MyPanel extends JPanel implements KeyListener{
	
	int x=10;
	int y=10;
	
	
	
	public void paint (Graphics g){
		super.paint(g);
		g.fillOval(x, y, 20, 20);
	}

	//���尴��ĳһ����
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("KeyType");
	}
	//������
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
		//�����ػ溯��repaint
		this.repaint();
		
		
	}
	//���ɿ�
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("KeyReleased");
	}
	
	
}
