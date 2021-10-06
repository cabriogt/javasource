package layout;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout2 extends JFrame{
	
	public FlowLayout2() {
		
		setTitle ("FLowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Container container = getContentPane ();
//		
//		container.setLayout(new FlowLayout());
		
		
		JPanel panel = new JPanel();
		setContentPane(panel);
		
		
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
		
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		
		FlowLayout2 f= new FlowLayout2();
		
	
		

	}

}
