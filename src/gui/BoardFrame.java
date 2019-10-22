package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoardFrame extends JFrame implements MouseListener{
	static int crossSize = 35;				//棋盘线间隔
	static int Frame_X = 1000;
	static int Frame_Y = crossSize*20;
	static boolean BlackTurn = true;
	
	static ChessPtr map[][] = new ChessPtr[15][15];
	Container contentPane = getContentPane();
	//含边缘提示字的棋盘
	public BoardFrame(){
		setTitle("五子棋");
		setLayout(null);
		setResizable(false);				//不可变更窗口大小
		setSize(Frame_X, Frame_Y);					//设定初始窗口大小
		
		//棋盘描绘
		Board panel = new Board();
		//panel.setLayout(new GridLayout(20,3,0,0));
		panel.setBounds(0,0,crossSize*20,crossSize*20);
		contentPane.add(panel);
				
		//两个按钮，开局和悔棋
		JButton restart = new JButton("开局");
		JButton regret = new JButton("悔棋");
		JPanel bts = new JPanel();
		bts.setBounds(crossSize*20, Frame_Y/2-100, 75, 200);	//按键的布局位置
		bts.add(restart);
		bts.add(regret);
		contentPane.add(bts);
		
		//225个棋盘点侦听对象
		for(int i=0;i<15;i++){
			for(int j=0;j<15;j++){
				ChessPtr csp = new ChessPtr(i,j);
				map[i][j]=csp;
			}
		}
		
		addMouseListener(this);
		System.out.println("棋盘初始化完成");
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//计算落子点
		int click_row=(arg0.getX()-(50-crossSize/2))/crossSize;
		int click_across=14-(arg0.getY()-(50-crossSize/2)-crossSize)/crossSize;
		if(click_row>=0 && click_row<=14 && click_across>=0 && click_across<=14){
			//在棋盘上落子
			contentPane.add(map[click_row][click_across]);
			System.out.println("在"+(char)(click_row+65)+(click_across+1)+"落子");
		}
		//否则什么都不做
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

