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
	static int crossSize = 35;				//�����߼��
	static int Frame_X = 1000;
	static int Frame_Y = crossSize*20;
	static boolean BlackTurn = true;
	
	static ChessPtr map[][] = new ChessPtr[15][15];
	Container contentPane = getContentPane();
	//����Ե��ʾ�ֵ�����
	public BoardFrame(){
		setTitle("������");
		setLayout(null);
		setResizable(false);				//���ɱ�����ڴ�С
		setSize(Frame_X, Frame_Y);					//�趨��ʼ���ڴ�С
		
		//�������
		Board panel = new Board();
		//panel.setLayout(new GridLayout(20,3,0,0));
		panel.setBounds(0,0,crossSize*20,crossSize*20);
		contentPane.add(panel);
				
		//������ť�����ֺͻ���
		JButton restart = new JButton("����");
		JButton regret = new JButton("����");
		JPanel bts = new JPanel();
		bts.setBounds(crossSize*20, Frame_Y/2-100, 75, 200);	//�����Ĳ���λ��
		bts.add(restart);
		bts.add(regret);
		contentPane.add(bts);
		
		//225�����̵���������
		for(int i=0;i<15;i++){
			for(int j=0;j<15;j++){
				ChessPtr csp = new ChessPtr(i,j);
				map[i][j]=csp;
			}
		}
		
		addMouseListener(this);
		System.out.println("���̳�ʼ�����");
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//�������ӵ�
		int click_row=(arg0.getX()-(50-crossSize/2))/crossSize;
		int click_across=14-(arg0.getY()-(50-crossSize/2)-crossSize)/crossSize;
		if(click_row>=0 && click_row<=14 && click_across>=0 && click_across<=14){
			//������������
			contentPane.add(map[click_row][click_across]);
			System.out.println("��"+(char)(click_row+65)+(click_across+1)+"����");
		}
		//����ʲô������
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

