package layout;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MixLayout extends JFrame {
	
	public MixLayout() {
		
		setTitle("MixLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 =new JPanel();
		panel1.setBackground(Color.ORANGE);
		
		
		
		JButton btn1= new JButton("btn1");
		btn1.setBackground(Color.GREEN);
		
		panel1.add(btn1);
		panel1.add(new JButton("btn2"));
		panel1.add(new JButton("btn3"));
		
		
		add(panel1,BorderLayout.NORTH);
		
		
		JPanel panel2 =new JPanel();
		panel2.setLayout(new BorderLayout ());
		
		panel2.add(new JButton("Swing"));
		
		add(panel2,BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new MixLayout();
		

	}

}
