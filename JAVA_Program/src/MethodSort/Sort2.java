package MethodSort;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] suits = {"hearts","Diamonds","Clubs","Spades"};
		
		List<String> list = Arrays.asList(suits);
		
		System.out.printf("Unsorted array element : %s%n",list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.printf("Sorted lest element : %s%n",list);
	}

}
