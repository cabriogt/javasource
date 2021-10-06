package container;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest4 extends JFrame {
	
	public FrameTest4() {
		setTitle ("MyFrame");
		setSize(300,300);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		
		//componentes:JButton,JCheckBox,JRadio,...
		JButton btn1 = new JButton ("btn1");
		add(btn1);
		
		JButton btn2 = new JButton ("btn2");
		add(btn2);
		
		JButton btn3 = new JButton ("btn3");
		add(btn3);
		
		JButton btn4 = new JButton ("btn4");
		add(btn4);
		
		JButton btn5 = new JButton ("btn5");
		add(btn5);
		
		
		
		setVisible(true);
		
	}
	
	
	

	public static void main(String[] args) {
		FrameTest4 f = new FrameTest4();
	}

}
