package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board extends JPanel {
	Graphics2D g2;
	Ellipse2D e;
	
	public Board(){
		
	}
	public void paintComponent(Graphics g){
		//在这里描绘空棋盘
		super.paintComponent(g);
		g2 = (Graphics2D)g;
		int crossSize=BoardFrame.crossSize;
		setBounds(0,0,crossSize*20,crossSize*20);
		for(int i=0;i<15;i++){
			Line2D line =new Line2D.Double(50+i*crossSize,50,50+i*crossSize,50+crossSize*14);
			g2.draw(line);
		}
		for(int i=0;i<15;i++){
			Line2D line =new Line2D.Double(50,50+crossSize*i,50+crossSize*14,50+crossSize*i);
			g2.draw(line);
		}
		
		int pointSize=6;	//五个小圆点的size（棋盘上D12，L12，D4，L4，H8这5个点）
		g.fillOval(3*crossSize+50-pointSize/2, 3*crossSize+50-pointSize/2, pointSize, pointSize);//D12
		g.fillOval(11*crossSize+50-pointSize/2, 3*crossSize+50-pointSize/2, pointSize, pointSize);//L12
		g.fillOval(3*crossSize+50-pointSize/2, 11*crossSize+50-pointSize/2, pointSize, pointSize);//D4
		g.fillOval(11*crossSize+50-pointSize/2, 11*crossSize+50-pointSize/2, pointSize, pointSize);//L4
		g.fillOval(7*crossSize+50-pointSize/2, 7*crossSize+50-pointSize/2, pointSize, pointSize);//H8
		
		for(int i=1;i<=15;i++){
			JLabel acrossMark=new JLabel(String.valueOf((char)(64+i)));
			acrossMark.setSize(25,25);
			acrossMark.setLocation(5+crossSize*i, 50+crossSize*15);
			add(acrossMark);
		}
		
		for(int i=1;i<=15;i++){
			JLabel acrossMark=new JLabel(String.valueOf(16-i));
			acrossMark.setSize(25,25);
			acrossMark.setLocation(20, crossSize*i);
			add(acrossMark);
		}
	}
	 
}