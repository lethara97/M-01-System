package GridLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;



public class GridLayoutFrame extends JFrame implements ActionListener{
	
	private final JButton[] buttons;
	private static final String[] names = {
		"none","two", "three","four","five","six"
	};
	
	private boolean toggle = true;
	private final Container container;
	private final GridLayout gridLayout1;
	private final GridLayout gridLayout2;
	
	
	public GridLayoutFrame() {
		super(" GridLayout Deme ");
		gridLayout1 = new GridLayout(2,3,4,5);
		gridLayout2 = new GridLayout(3,2);
		container = getContentPane();
		setLayout(gridLayout1);
		buttons =  new JButton[names.length];
		
		for (int count = 0; count < names.length; count++)
		{
		buttons[count] = new JButton(names[count]);
		buttons[count].addActionListener(this); // register listener
		add(buttons[count]); // add button to JFrame
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (toggle) // set layout based on toggle
			container.setLayout(gridLayout2);
			else
			container.setLayout(gridLayout1);
			toggle = !toggle;
			container.validate();
	}

}
