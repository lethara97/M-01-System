package Array;
import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumber = new SecureRandom();
		int[] frequency = new int[7];
		
		for (int roll =1; roll<=100;roll++) {
			++frequency[1+ randomNumber.nextInt(6)];
		}
		System.out.printf("%s%10s%n","Face","Frequency");
		
		for(int face=1;face<frequency.length;face++) {
			System.out.printf("%d%10d%n",face,frequency[face]);
		}
	}
	
}
