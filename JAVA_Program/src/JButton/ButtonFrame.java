package JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{

	private final JButton plainJButton;
	private final JButton fancyJButton;
	
	public ButtonFrame() {
		super("Testing Button");
		setLayout(new FlowLayout());
		
		plainJButton = new JButton("PLain Button");
		add(plainJButton);
		
		Icon bug1 =new ImageIcon(getClass().getResource("bug2.png"));
		Icon bug2 =new ImageIcon(getClass().getResource("bug3.png"));
		fancyJButton = new JButton("Fancy Button", bug1); // set image
		fancyJButton.setRolloverIcon(bug2); // set rollover image
		add(fancyJButton);
		
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener(handler);
		plainJButton.addActionListener(handler);
		
	}
	
	private class ButtonHandler implements ActionListener
	{
	// handle button event
	@Override
	public void actionPerformed(ActionEvent event)
	{
	JOptionPane.showMessageDialog( ButtonFrame.this , String.format(
	"You pressed: %s", event.getActionCommand() ));
	}
	}
}
