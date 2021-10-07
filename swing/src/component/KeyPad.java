package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToolBar;

public class KeyPad extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton[] buttons =new JButton[9];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyPad frame = new KeyPad();
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
	public KeyPad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		 JPanel panel= new JPanel();
	     contentPane.add(panel, BorderLayout.CENTER);
	     panel.setLayout(new GridLayout(0, 3, 0, 0));
		
	     for(int i=0;i<buttons.length;i++) {
	    	 buttons[i] =new JButton((i+1)+"");
	    	 
	    	 buttons[i].setFont(new Font("arial",Font.PLAIN,24));;
	    	 buttons[i].addActionListener(this);
	    	 panel.add(buttons[i]);
	    
	     }
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();	
		
		textField.setText(textField.getText()+cmd);	
			
		
		
	}

}
