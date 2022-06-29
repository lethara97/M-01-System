package Factorials;

public class FactorialCalculator {
	
	
	// recursive method factorial (assumes its parameter is >= 0)
	public static long factorial(long number) 
	{ 
	 if (number <= 1) // test for base case 
	 return 1; // base cases: 0! = 1 and 1! = 1 
	 else // recursion step 
	 return number * factorial(number - 1); 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int counter = 0; counter <= 21; counter++)
			 System.out.printf("%d! = %d%n", counter,factorial(counter) );
	}

}
