package Methods;

public class Scope {

	public Scope() {
		// TODO Auto-generated constructor stub
	}
	private static int x =1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		System.out.printf("local x in main is %d\n", x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();

	}
	
	public static void useLocalVariable(){
		
		int x =25;
		System.out.printf("\nLocal x on entering method useLocalVariable is %d\n",x);
		++x;
		System.out.printf("local x before exting method useLocalVariable is %d\n", x);
	}
	
	public static void useField(){
		System.out.printf("\nfield x on entering method useField is %d\n",x);
		x *= 10;
		System.out.printf("field x before exiting method useField is %d\n", x);
	}
	

}
