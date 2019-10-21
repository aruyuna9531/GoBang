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
	static int crossSize = 35;				//�����߼��
	static int Frame_X = 1000;
	static int Frame_Y = crossSize*20;
	//����Ե��ʾ�ֵ�����
	public BoardFrame(){
		setTitle("������");
		setLayout(null);
		setResizable(false);				//���ɱ�����ڴ�С
		setSize(Frame_X, Frame_Y);					//�趨��ʼ���ڴ�С
		Container contentPane = getContentPane();
		
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
		contentPane.add(bts, BorderLayout.EAST);
	}
}

