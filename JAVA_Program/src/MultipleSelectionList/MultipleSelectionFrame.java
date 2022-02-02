package MultipleSelectionList;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {

	private final JList<String> colorJList;
	private final JList<String> copyJlist;
	private JButton copyJButton;
	private static final String[] colorNames = {
		"Black", "Blie","Cyan","Dark Gray","Green","Light Gray",
		"Magenta","Orange","Pink","Red","White","Yellow"
	};
	
	public MultipleSelectionFrame() {
		
		
		super("Multiple Selection Lists");
		setLayout(new FlowLayout());
		
		colorJList = new JList<String> (colorNames);
		colorJList.setVisibleRowCount(5);
		
		colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorJList));
		
		copyJButton = new JButton("Copy >>>");
		copyJButton.addActionListener(new ActionListener() // anonymous inner class
		{
		// handle button event
		public void actionPerformed(ActionEvent event)
		{
		// place selected values in copyJList
		copyJlist.setListData(colorJList.getSelectedValuesList().toArray(
		new String[0]));
		}
		}
		);
		

		add(copyJButton); // add copy button to JFrame
		copyJlist = new JList<String>(); // list to hold copied color names
		copyJlist.setVisibleRowCount(5); // show 5 rows
		copyJlist.setFixedCellWidth(100); // set width
		copyJlist.setFixedCellHeight(15); // set height
		copyJlist.setSelectionMode(
		ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copyJlist));
		
	}
}
