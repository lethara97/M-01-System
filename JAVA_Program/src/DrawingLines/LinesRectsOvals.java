package DrawingLines;

import javax.swing.JFrame;
import java.awt.Color;
public class LinesRectsOvals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame =
				new JFrame("Drawing lines, rectangles and ovals");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				LinesRectsOvalsJPanel linesRectsOvalsJPanel =
				new LinesRectsOvalsJPanel();
				linesRectsOvalsJPanel.setBackground(Color.WHITE);
				frame.add(linesRectsOvalsJPanel);
				frame.setSize(400, 210);
				frame.setVisible(true);
				
	}

}
