package layout;


import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout extends JFrame{
	
	private static final String LEFT = null;



	public FlowLayout() {
		
		setTitle ("FLowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		
		container.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		
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
		
		FlowLayout f= new FlowLayout();
		
	
		

	}

}
