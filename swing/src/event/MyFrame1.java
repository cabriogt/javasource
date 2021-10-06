package event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;



public class MyFrame1 extends JFrame {
	
	public MyFrame1 () {
		setTitle("accion event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton btn1= new JButton("click");
		btn1.addActionListener(new MyListener1());
		add(btn1);
		
		JLabel lbl = new JLabel ("button");
		add(lbl);
		
		
		setBounds(100,100,300,200);
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		new MyFrame1();
	}

}
