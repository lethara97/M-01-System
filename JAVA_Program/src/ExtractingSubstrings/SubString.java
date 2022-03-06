package ExtractingSubstrings;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String letters = "abcdefghijklmnopqrstuvwxyz";
		// test substring methods
		System.out.printf("Substring from index 20 to end is \"%s\"%n",
		letters.substring(20) );
		System.out.printf("%s \"%s\"%n",
		"Substring from index 3 up to, but not including 6 is",
		letters.substring(3, 6) );

	}

}
