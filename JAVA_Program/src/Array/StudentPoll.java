package Array;

public class StudentPoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] responses = {1,2,3,4,5,6,2,5,3,1,4,5,7,6,5,5,6,10,5,6,3,1};
		
		int[] frequency = new  int[10];
		
		for (int answer =0; answer<responses.length;answer++) {
			try
			{
			++frequency[responses[answer]];
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
			System.out.println(e); 
			System.out.printf("responses[%d] = %d%n%n",
			answer, responses[answer]);
			}
		}
		System.out.printf("%s%10s%n","Rating","Frequency");
		
		for(int rating =1; rating<frequency.length;rating++) {
			System.out.printf("%d%10d%n",rating,frequency[rating]);
		}
		

	}

}
