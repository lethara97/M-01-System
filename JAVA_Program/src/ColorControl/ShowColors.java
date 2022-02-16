package ColorControl;
import javax.swing.JFrame;

public class ShowColors {

	// execute application
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Using colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorPanel colorJPanel = new ColorPanel();
		frame.add(colorJPanel);
		frame.setSize(400, 180);
		frame.setVisible(true);
		}
	
}
