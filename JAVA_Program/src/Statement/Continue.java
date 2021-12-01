package Statement;

public class Continue {
	public static void main(String args[]) {
		int count;
		for (count = 0; count <=10; count++) {
			if(count==5) 
				continue;
				System.out.printf("%d ",count);
		}
		System.out.printf("\nUsed continue to skip printing 5 \n");
	}

}
