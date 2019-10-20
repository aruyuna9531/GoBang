import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.geom.Line2D;
 
public class test {
	public static void main(String[] args) {
		LineFrame frame = new LineFrame();
		frame.setDefaultCloseOperation(3);
		frame.show();
	}
}
 
class LineFrame extends JFrame{
	public LineFrame(){
		setTitle("五子棋");
		setResizable(false);
		setSize(1000,700);
		Container contentPane = getContentPane();
		
		//主界面五子棋字眼位置
		JLabel label=new JLabel("五子棋");
		label.setSize(70,25);
		label.setLocation(350,25);
		contentPane.add(label);
		
		for(int i=1;i<=15;i++){
			JLabel acrossMark=new JLabel(String.valueOf((char)(64+i)));
			acrossMark.setSize(25,25);
			acrossMark.setLocation(20+25*i, 425);
			contentPane.add(acrossMark);
		}
		
		for(int i=1;i<=15;i++){
			JLabel acrossMark=new JLabel(String.valueOf(16-i));
			acrossMark.setSize(25,25);
			acrossMark.setLocation(20, 15+25*i);
			contentPane.add(acrossMark);
		}
		
		//棋盘描绘
		LinePanel panel = new LinePanel();
		contentPane.add(panel);
	}
}
 
class LinePanel extends JPanel {
	Graphics2D g2;
	Ellipse2D e;
	public LinePanel(){
	 
	}
	public void paintComponent(Graphics g){
		//在这里描绘主界面
		super.paintComponent(g);
		g2 = (Graphics2D)g;
		for(int i=0;i<15;i++){
			Line2D line =new Line2D.Double(50+i*25,50,50+i*25,400);
			g2.draw(line);
		}
		for(int i=0;i<15;i++){
			Line2D line =new Line2D.Double(50,50+25*i,400,50+25*i);
			g2.draw(line);
		}
		int pointSize=6;	//五个小圆点的size（棋盘上D12，L12，D4，L4，H8这5个点）
		g.fillOval(3*25+50-pointSize/2, 3*25+50-pointSize/2, pointSize, pointSize);//D12
		g.fillOval(11*25+50-pointSize/2, 3*25+50-pointSize/2, pointSize, pointSize);//L12
		g.fillOval(3*25+50-pointSize/2, 11*25+50-pointSize/2, pointSize, pointSize);//D4
		g.fillOval(11*25+50-pointSize/2, 11*25+50-pointSize/2, pointSize, pointSize);//L4
		g.fillOval(7*25+50-pointSize/2, 7*25+50-pointSize/2, pointSize, pointSize);//H8
	}
	private double MovLen = 5.0;
	 
}