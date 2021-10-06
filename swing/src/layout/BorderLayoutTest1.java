package layout;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest1 extends JFrame{
	
	public BorderLayoutTest1() {
		
		setTitle ("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton btn1 = new JButton ("btn1");
		add(btn1,BorderLayout.EAST);
		
		JButton btn2 = new JButton ("btn2");
		add(btn2,BorderLayout.WEST);
		
		JButton btn3 = new JButton ("btn3");
		add(btn3,BorderLayout.CENTER);
		
		JButton btn4 = new JButton ("btn4");
		add(btn4,BorderLayout.SOUTH);
		
		JButton btn5 = new JButton ("btn5");
		add(btn5,BorderLayout.NORTH);
		
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		
		BorderLayoutTest1 f= new BorderLayoutTest1();
		
	
		

	}

}
