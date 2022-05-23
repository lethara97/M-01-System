package CaseStudy;

public class MenuOption {
	
	// declare contents of enum type
	 ZERO_BALANCE(1),
	 CREDIT_BALANCE(2),
	 DEBIT_BALANCE(3),
	 END(4);
	
	 private final int value; // current menu option

	// constructor
	private MenuOption(int value)
	 {
	 this.value = value;
	} 

}
