package event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyFrame2 extends JFrame implements ActionListener{
	
	private JButton btn1,btn2;
	private JLabel lbl;
	
	public MyFrame2 () {
		
	
		
		setTitle("accion event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		btn1= new JButton("click");
		btn1.addActionListener(this);
		add(btn1);
		
		lbl = new JLabel ("button");
		add(lbl);
		
		btn2= new JButton("click2");
		btn2.addActionListener(this);
		add(btn2);
		
		
		setBounds(100,100,300,200);
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		new MyFrame2();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn1) {
			System.out.println("btn1 press");
			lbl.setText("btn1 press");
		}else if (e.getSource()==btn2) {
			System.out.println("btn2 press");
			lbl.setText("btn2 press");
		}
		
		
	}

}
