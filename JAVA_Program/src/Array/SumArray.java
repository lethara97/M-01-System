package Array;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {87,9,4,8,8,7,5,8,6,89,57,62,64,64,25};
		int total =0;
		
		for(int counter =0; counter<array.length; counter++) {
			total += array[counter];
			
		}
		System.out.printf("total of array elements : %d%n ",total);
	}
////
}
