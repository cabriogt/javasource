package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ButtonTest1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton left,middle,right;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest1 frame = new ButtonTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		left = new JButton("DIsable Middle Button");
		left.setActionCommand("disable");
		left.addActionListener(this);
		left.setMnemonic('D');
		left.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/left.gif")));
		contentPane.add(left);
		
		middle = new JButton("Middle Button");
		middle.setActionCommand("middle");
		middle.addActionListener(this);
		middle.setMnemonic('M');
		middle.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/middle.gif")));
		contentPane.add(middle);
		
		right = new JButton("Enlable Middle Button");
		right.setActionCommand("enable");
		right.addActionListener(this);
		right.setMnemonic('E');
		right.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/right.gif")));
		contentPane.add(right);
		
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd =e.getActionCommand();
		//System.out.println(cmd); 
	
		
		//disable
		if(cmd.equals("disable")) {
			//middle
			middle.setEnabled(false);
			//disable
			left.setEnabled(false);
			//enable
			right.setEnabled(true);
			
		}else {//enable
			//middle 
			middle.setEnabled(true);
			//disable
			left.setEnabled(true);
			//enable
			right.setEnabled(false);
			
		}
		
	}

}
