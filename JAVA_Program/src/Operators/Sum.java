package Operators;

public class Sum {
	public static void main(String[] args) {
		int total = 0;
		
		for (int num = 2; num <= 20; num +=2) {
			total += num;
			System.out.printf("sum is %d%n", total);
	}

	}
}
