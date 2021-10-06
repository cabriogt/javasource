package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("e.getActionCommand()"+e.getActionCommand());
		System.out.println("e.getID()"+e.getID());
		System.out.println("e.getSource()"+e.getSource());

	}

}
