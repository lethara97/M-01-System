package AddingIntegers;
import java.util.Scanner;

public class Product {
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	int x;
	int y;
	int z;
	int result;
	
	System.out.print("ente first number : ");
	x = input.nextInt();
	
	System.out.print("ente second number : ");
	y = input.nextInt();
	
	System.out.print("ente third number : ");
	z = input.nextInt();
	
	result = x * y * z ;
	
	System.out.printf("Product in %d%n", result);
	
	}

}
