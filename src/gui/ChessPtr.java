package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class ChessPtr extends JPanel implements MouseListener{
	Graphics2D g2;
	Ellipse2D e;
	int upleft_x, upleft_y;					//�������Ͻ��ڴ����ڵ�����
	int index_x, index_y;
	int crossSize=BoardFrame.crossSize;
	ChessPtr(int x, int y){
		//��������x,yָ�����ϵ�����(x,y)��A1=(0,0)
		index_x=x;
		index_y=y;
		upleft_x=50+crossSize*(14-x)-(crossSize/2);
		upleft_y=50+crossSize*y-(crossSize/2);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g2 = (Graphics2D)g;
		g2.setBackground(Color.BLACK);
		g2.fillOval(upleft_x+2, upleft_y+2, crossSize-4, crossSize-4);
		System.out.println("���ӿӣ�"+upleft_x+","+upleft_y);
	}
	public int getCX(){return upleft_x;}
	public int getCY(){return upleft_y;}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
		System.out.println("���ӣ�"+(char)(index_x+65)+(index_y+1));
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}