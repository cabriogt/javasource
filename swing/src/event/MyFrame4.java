package event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyFrame4 extends JFrame implements ActionListener{
	
	
	
	Container container;
	
	public MyFrame4 () {
		setTitle("Frame back color change");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container = getContentPane();
		container.setLayout(new FlowLayout());
		//container.setBackground(Color.BLUE);
		
		JButton btn1= new JButton("yellow");
		btn1.addActionListener(this);
		add(btn1);
	
		JButton btn2= new JButton("red");
		btn2.addActionListener(this);
		add(btn2);
		
		
		
		setBounds(200,100,300,200);
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd=e.getActionCommand();
		
		if(cmd.equals("yellow")) {
			container.setBackground(Color.YELLOW);
		}else {
			container.setBackground(Color.RED);
		}
		
		
	}
		
	
	
	
	
	
	public static void main(String[] args) {
			new MyFrame4();
	}
		
}



