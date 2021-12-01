package Statement;

public class Break {
	public static void main(String[] args) {
		
		int count;
		
		for (count=0; count<=10;count++) {
			if(count==5) 
				break;
				System.out.printf("%d ",count);
			}
		System.out.printf("\nBreke out of loop at count = %d \n", count);
	}

}
