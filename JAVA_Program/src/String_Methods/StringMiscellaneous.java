package String_Methods;

public class StringMiscellaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello there";
		char[] charArray = new char[5];
		
		System.out.printf("s1 : %s", s1);
		
		System.out.printf("%nLemgth of s1 : %d", s1.length());
		
		System.out.printf("%nTHe sring reversed is : ");
		
		for (int count =s1.length()-1 ; count>=0; count--) {
			System.out.printf("%c",s1.charAt(count));
		}
		
		s1.getChars(0, 5, charArray, 0);
		System.out.printf("%nThe character array is : ");
		
		for (char character : charArray){
		System.out.print(character);
		}
		System.out.println();
			
		
	}

}
