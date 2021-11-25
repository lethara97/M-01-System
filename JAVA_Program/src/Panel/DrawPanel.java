package Panel;
//import java.awt.Graphics;
//import java.swing.JPanel;


import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel
{
// draws an X from the corners of the panel
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int width = getWidth(); // total width
		int height = getHeight(); // total height
			// draw a line from the upper-left to the lower-right
			g.drawLine(0, 0, width, height);
			// draw a line from the lower-left to the upper-right
			g.drawLine(0, height, width, 0);
	}
}
