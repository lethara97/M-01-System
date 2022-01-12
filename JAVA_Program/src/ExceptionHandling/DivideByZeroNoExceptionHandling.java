package ExceptionHandling;

import java.util.Scanner;
public class DivideByZeroNoExceptionHandling {
	
	public static int qutient(int numerator , int denaminator) {
		return numerator / denaminator;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Emter an integer numerator : ");
		int numerator= scanner.nextInt();
		
		System.out.print("Enter an integer denaminator : ");
		int denaminator = scanner.nextInt();
		
		int result = qutient(numerator,denaminator);
		
		System.out.printf("%nResult : %d / %d = %d%n",numerator,denaminator,result);

	}

}
