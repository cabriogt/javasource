package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPapper extends JFrame implements ActionListener {
	
	private JTextField textField;
	private JButton btnRock,btnPaper,btnScissor;
	private JPanel panel;
	
	static final int ROCK =0;
	static final int PAPER =1;
	static final int SCISSOR =2;
	
	public RockScissorPapper() {
		setTitle("Piedra,Papel y Tijeras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//content pane
		Container contentPane = getContentPane();
		
		//top message
		JLabel label = new JLabel("choose one button below");
		label.setFont(new Font("arial",Font.BOLD,18));
		contentPane.add(label,BorderLayout.NORTH);
		
		//middle
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		
		btnRock = new JButton();
		btnRock.setIcon(new ImageIcon(RockScissorPapper.class.getResource("/component/rock.png")));
		btnRock.setActionCommand("Rock");
		btnRock.addActionListener(this);
		panel.add(btnRock);
		
		
		btnPaper = new JButton();
		btnPaper.setIcon(new ImageIcon(RockScissorPapper.class.getResource("/component/paper.png")));
		btnPaper.setActionCommand("Paper");
		btnPaper.addActionListener(this);
		panel.add(btnPaper);
		
		btnScissor = new JButton();
		btnScissor.setIcon(new ImageIcon(RockScissorPapper.class.getResource("/component/scissor.png")));
		btnScissor.setActionCommand("Scissor");
		btnScissor.addActionListener(this);
		panel.add(btnScissor);
		
		contentPane.add(panel,BorderLayout.CENTER);
		
		
		//image
		textField = new JTextField();
		textField.setFont(new Font("arial",Font.BOLD,18));
		contentPane.add(textField,BorderLayout.SOUTH);
		
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RockScissorPapper();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		int computer = (int)(Math.random() * 3);
		//System.out.println(num);
		
		if (cmd.equals("rock")) {
			
			if(computer == ROCK) {
				textField.setText("tie");
			}else if (computer == SCISSOR) {
				textField.setText("I win");
			}else {
				textField.setText("CPU win");
			}
			
			
		}else if (cmd.equals("scissor")) {
			if(computer == ROCK) {
				textField.setText("CPU won");
			}else if (computer == SCISSOR) {
				textField.setText("tie");
			}else {
				textField.setText("I win");
			}
			
			
		}else {
			
			if(computer == ROCK) {
				textField.setText("I win");
			}else if (computer == SCISSOR) {
				textField.setText("CPU win");
			}else {
				textField.setText("tie ");
			}
			
			
			
		}
		

	}

	

}


