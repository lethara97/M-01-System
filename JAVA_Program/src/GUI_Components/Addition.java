package GUI_Components;

import javax.swing.JOptionPane;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstNumber = 
				JOptionPane.showInputDialog("Enter first integer");
		
		String secondNumber =
				JOptionPane.showInputDialog("Enter second intrger");
		
		int number1= Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1+number2;
		
		JOptionPane.showMessageDialog(null, "the sum is" +sum,
				"sum of Two Integers",JOptionPane.PLAIN_MESSAGE);
	}

}
