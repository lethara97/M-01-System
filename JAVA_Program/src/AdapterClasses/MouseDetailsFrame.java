package AdapterClasses;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame{
	
	private String details;
	private final JLabel statusBar;
	
	public MouseDetailsFrame()
	{
	super("Mouse clicks and buttons");
	statusBar = new JLabel("Click the mouse");
	add(statusBar, BorderLayout.SOUTH);
	addMouseListener(new MouseClickHandler()); // add handler
	}
	
	private class MouseClickHandler extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent event)
		{
			int xPos = event.getX(); // get x-position of mouse
			int yPos = event.getY(); // get y-position of mouse
			details = String.format("Clicked %d time(s)",
			event.getClickCount() );
			if ( event.isMetaDown() ) // right mouse button
			details += " with right mouse button";
			else if ( event.isAltDown() ) // middle mouse button
			details += " with center mouse button";
			else // left mouse button
			details += " with left mouse button";
			statusBar.setText(details);
		}
		
	}
	

}
