package DrawingWithTheMouse;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class Pinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame application = new JFrame("A simple paint program");
		PaintPanel paintPanel = new PaintPanel();
		application.add(paintPanel, BorderLayout.CENTER);
		// create a label and place it in SOUTH of BorderLayout
		application.add(new JLabel("Drag the mouse to draw"),
				BorderLayout.SOUTH);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(400, 200);
		application.setVisible(true);
	}

}
