package ExceptionHandling;

public class UsingExceptions {
	public static void main(String[] args) {
		try {
			throwException();			
		}
		catch(Exception exception) {
			System.err.println("Exception handled in main");
		}
		
		doesNotThroException();
		
	}
	public static void throwException() throws Exception{
		try {
			System.out.println("Method throwException");
			throw new Exception();
		}
		catch(Exception exception) {
			System.out.println("Exception handled in method throwException");
			throw exception;			
		}
		finally {
			System.out.println("Finally executed in throwException");
		}
	}
	public static void doesNotThroException() {
		try {
			System.out.println("Method doesNotThoeException");
		}
		catch(Exception exception) {
			System.err.println(exception);
		}
		finally {
			System.err.println("Finally exception executed in doesNotThrowException");
		}
		System.out.println("end of method doesNotThrowException");
	}
	

}
