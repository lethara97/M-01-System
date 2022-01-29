package JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class ComboxBoxFrame extends JFrame{
	
	private final JComboBox<String> imagesJComboBox;
	private final JLabel label;
	
	private static final String[] name = {
			"bob1.png","bob2.png","bob3.png","bug3.png"
	};
	
	private final Icon[] icons = {
			new ImageIcon(getClass().getResource(name[0])),
			new ImageIcon(getClass().getResource(name[1])),
			new ImageIcon(getClass().getResource(name[2])),
			new ImageIcon(getClass().getResource(name[3]))
	};
	
	public ComboxBoxFrame() {
		super("Testing JComboBox");
		setLayout(new FlowLayout());	
		
		imagesJComboBox = new JComboBox<String>(name); // set up JComboBox
		imagesJComboBox.setMaximumRowCount(3);
		
		imagesJComboBox.addItemListener(
				new ItemListener()
				{

					@Override
					public void itemStateChanged(ItemEvent event) {
						// TODO Auto-generated method stub
						if (event.getStateChange() == ItemEvent.SELECTED)
							label.setIcon(icons[
							                    imagesJComboBox.getSelectedIndex()]);
					}
					
				}
				);
		
		add(imagesJComboBox);
		label = new JLabel(icons[0]);
		add(label);
		
	}

}
