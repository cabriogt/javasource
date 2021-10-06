package container;

import javax.swing.JFrame;

public class FrameTest2 extends JFrame {

	public FrameTest2() {
		setTitle("swing frame");
		setSize(300,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		FrameTest2 frame = new FrameTest2();
	}

}
