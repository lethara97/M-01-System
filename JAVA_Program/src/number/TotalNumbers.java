package number;

import java.util.ArrayList;

public class TotalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number[] numbers = {1, 2.4, 3, 4.1}; // Integers and Doubles
		ArrayList<Number> numberList = new ArrayList<>();
		for (Number element : numbers) 
			 numberList.add(element); // place each number in numberList
			
			 System.out.printf("numberList contains: %s%n", numberList);
			 System.out.printf("Total of the elements in numberList: %.1f%n", 
			 sum(numberList)
);
			 }
			
			 // calculate total of ArrayList elements
			 public static double sum( ArrayList<Number>list)
			 {
			 double total = 0; // initialize total
			
			 // calculate sum
			 for (Number element : list) 
				 total += element.doubleValue();

			 
			
			 return total;

	}

}
