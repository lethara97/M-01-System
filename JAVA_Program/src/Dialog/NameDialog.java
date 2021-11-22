package Dialog;
import javax.swing.JOptionPane;
public class NameDialog {
	public static void main(String[] args)
	{
		String name= JOptionPane.showInputDialog("What is your Name ?");
		
		String message =
				String.format("Welcome ,%s to JAVA programming!", name);
		
		JOptionPane.showMessageDialog(null, message);
	}

}
