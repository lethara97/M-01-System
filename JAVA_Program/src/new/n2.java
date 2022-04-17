public class InitArray {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		 
		System.out.printf("%s%8s%n","Index","Value");
		
		for(int counter=0; counter <array.length;counter++) {
			System.out.printf("%d%8d%n",counter,array[counter]);
		}
		

	}
