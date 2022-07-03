package Factorials;
import java.math.BigInteger;

public class FibonacciCalculator {
	
	private static BigInteger TWO = BigInteger.valueOf(2);
	
	public static BigInteger fibonacci(BigInteger number) 
	{ 
	 if (number.equals(BigInteger.ZERO) || 
	 number.equals(BigInteger.ONE)) // base cases 
	 return number; 
	 else // recursion step 
	 return fibonacci(number.subtract(BigInteger.ONE)).add(
	 fibonacci(number.subtract(TWO))); 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for (int counter = 0; counter <= 40; counter++)
			System.out.printf("Fibonacci of %d is: %d%n", counter,
		 fibonacci(BigInteger.valueOf(counter)));
		
	}

}
