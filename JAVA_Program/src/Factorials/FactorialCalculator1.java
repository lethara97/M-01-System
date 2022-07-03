package Factorials;
import java.math.BigInteger;
public class FactorialCalculator1 {

	// recursive method factorial (assumes its parameter is >= 0) 
	public static BigInteger factorial(BigInteger number) 
	{ 
	 if (number.compareTo(BigInteger.ONE) <= 0) // test base case
	 return BigInteger.ONE; // base cases: 0! = 1 and 1! = 1 
	 else // recursion step 
	 return number.multiply( 
	 factorial(number.subtract(BigInteger.ONE))); 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int counter = 0; counter <= 21; counter++)
			 System.out.printf("%d! = %d%n", counter,factorial(counter) );
	}

}
