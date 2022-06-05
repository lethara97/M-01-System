package times;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Time2> list = new ArrayList<>(); // create List
		
		 list.add(new Time2(6, 24, 34));
		 list.add(new Time2(18, 14, 58));
		 list.add(new Time2(6, 05, 34));
		list.add(new Time2(12, 14, 58));
		 list.add(new Time2(6, 24, 22));
		
		 System.out.printf("Unsorted array elements:%n%s%n", list);
		 
		  
		  Collections.sort(list, new TimeComparator());
		 
		  // output List elements
		  System.out.printf("Sorted list elements:%n%s%n", list);
	}

}
