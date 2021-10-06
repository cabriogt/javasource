package event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Calculator extends JFrame implements ActionListener {
	
	Container container;
	
	public  Calculator() {
		
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		container = getContentPane();
		container.setLayout(new FlowLayout());
		//container.setBackground(Color.BLUE);
		
		JButton btn1= new JButton("enter");
		btn1.addActionListener(this);
		add(btn1);
	
		JButton btn2= new JButton("clear");
		btn2.addActionListener(this);
		add(btn2);
		
		
		
		setBounds(200,100,300,200);
		setVisible(true);
		
		
		
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
