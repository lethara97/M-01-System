package RegularExpression;

import java.util.Scanner;


public class Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter frist name : ");
		String firstName = scanner.nextLine();
		System.out.println("Please enter last name : ");
		String lastName = scanner.nextLine();
		System.out.println("Please enter  Address : ");
		String address = scanner.nextLine();
		System.out.println("Please enter  city : ");
		String city = scanner.nextLine();
		System.out.println("Please enter state : ");
		String state = scanner.nextLine();
		System.out.println("Please enter zip : ");
		String zip = scanner.nextLine();
		System.out.println("Please enter phone : ");
		String phone = scanner.nextLine();

		System.out.println("%nValidate Result : ");
		
		if (!ValidateInput.validateFirstName(firstName))
			 System.out.println("Invalid first name");
			 else if (!ValidateInput.validateLastName(lastName))
			System.out.println("Invalid last name");
			 else if (!ValidateInput.validateAddress(address))
			 System.out.println("Invalid address");
			else if (!ValidateInput.validateCity(city))
				 System.out.println("Invalid city");
				 else if (!ValidateInput.validateState(state))
				 System.out.println("Invalid state");
				 else if (!ValidateInput.validateZip(zip))
				 System.out.println("Invalid zip code");
				 else if (!ValidateInput.validatePhone(phone))
				 System.out.println("Invalid phone number");
				 else
				 System.out.println("Valid input. Thank you.");
	}

	
}
