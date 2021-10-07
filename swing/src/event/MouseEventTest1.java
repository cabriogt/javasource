package event;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class MouseEventTest1 extends JFrame implements MouseListener,MouseMotionListener {
	
	private JTextField textField;
	JTextArea textArea;
	JButton btn;
	
	
	public MouseEventTest1 () {
		
		setTitle("Mouse Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		btn = new JButton("click");
		btn.addMouseListener(this);
		add(btn,BorderLayout.CENTER);

		textArea = new JTextArea(3,50);
		textArea.addMouseListener(this);
		textArea.addMouseMotionListener(this);
		add(textArea,BorderLayout.CENTER);
		
		textField = new JTextField();
		add(textField,BorderLayout.SOUTH);
		
		
		
		
		
		setSize(500,1000);
		setVisible(true);
		
	}
	
	
	
	
	public static void main(String[] args) {
		new MouseEventTest1();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseRelesed");
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		textField.setText("mouseEntered");
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		textField.setText("mouseExited");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved");
	}

}
