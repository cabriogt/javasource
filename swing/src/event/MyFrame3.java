package event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyFrame3 extends JFrame implements ActionListener{
	
	private JButton btn1,btn2;
	
	public MyFrame3 () {
		setTitle("accion event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		btn1= new JButton("click");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn1 press");
				
			}
		});
		add(btn1);
		
		JLabel lbl = new JLabel ("press btn1 or btn2");
		lbl.setText("btn1 press");
		add(lbl);
		
		btn2= new JButton("click2");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn2 press");
				lbl.setText("btn2 press");
			
				
			}
		});
		add(btn2);
		
		
		setBounds(100,100,300,200);
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		new MyFrame3();
	}



//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource()==btn1) {
//			System.out.println("btn1 press");
//		}else if (e.getSource()==btn2) {
//			System.out.println("btn2 press");
//		}
//		
//		
//	}

}
