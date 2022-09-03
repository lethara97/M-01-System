package Account;
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args)
	{
		Account account1 = new Account("Kavin",50.0);
		Account account2 = new Account("Seka",0.0);
		
		System.out.printf("%s balance : $%.2f%n",
				account1.getName(),account1.getBalance());
		System.out.printf("%s balance : $%.2f%n",
				account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amout for account1 : ");
		double depositAmount = input.nextDouble();
		
		System.out.printf("%nadding %.2f to accout1 balance%n%n",
				depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance : $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance : $%.2f%n",
				account2.getName(), account2.getBalance());
		;
		
	
	}

}
