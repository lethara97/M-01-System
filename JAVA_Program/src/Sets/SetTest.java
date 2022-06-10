package Sets;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create and display a List<String>
		 String[] colors = {"red", "white", "blue", "green", "gray", 
		 "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
		 
		 System.out.printf("List: %s%n", list);
		List<String> list = Arrays.asList(colors);

		 // eliminate duplicates then print the unique values
		 printNonDuplicates(list);
		
	}
	
	private static void printNonDuplicates( Collection<String> values
)
	 {
	 // create a HashSet 
		Set<String> set = new HashSet<>(values);
	
	 System.out.printf("%nNonduplicates are: ");
	
	 for (String value : set)
	 System.out.printf("%s ", value);
	
	 System.out.println();
	 }
	
	

}
