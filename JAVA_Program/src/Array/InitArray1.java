package Array;

public class InitArray1 {
	public static void main(String[] args) {
		int[] array = {23,5,5,78,9,5,2,86,6,9,5,66,};
		
		System.out.printf("%s%5s%n","index","value");
		
		for (int counter=0; counter < array.length;counter++) {
			System.out.printf("%d%5d%n",counter,array[counter]++);
		}
	}

}
