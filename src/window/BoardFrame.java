package window;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoardFrame extends JFrame{
	static int crossSize = 35;				//棋盘线间隔
	static int Frame_X = 1000;
	static int Frame_Y = crossSize*20;
	//含边缘提示字的棋盘
	public BoardFrame(){
		setTitle("五子棋");
		setLayout(null);
		setResizable(false);				//不可变更窗口大小
		setSize(Frame_X, Frame_Y);					//设定初始窗口大小
		Container contentPane = getContentPane();
		
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
		contentPane.add(bts, BorderLayout.EAST);
	}
}

