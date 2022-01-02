package Employee;

import java.sql.Date;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date birth = new Date(7, 24, 1949);
		Date hire = new Date(3, 12, 1988);
		Employee employee = new Employee("Bob", "Blue", birth, hire);
		System.out.println(employee);
	}

}
