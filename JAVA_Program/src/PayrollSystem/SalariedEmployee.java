package PayrollSystem;

public class SalariedEmployee extends Employee{
	private double weeklySalary;

	//constructor
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (weeklySalary <0.0) {
			throw new IllegalArgumentException(
					"weekly salry must be >= 0.0");
		}
		
		this.weeklySalary = weeklySalary;
	}

	/**
	 * @param weeklySalary the weeklySalary to set
	 */
	public void setWeeklySalary(double weeklySalary) {
		
		if (weeklySalary <0.0) {
			throw new IllegalArgumentException(
					"weekly salry must be >= 0.0");
		}
		
		this.weeklySalary = weeklySalary;
	}

	/**
	 * @return the weeklySalary
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("salaried employee: %s%n%s: $%,.2f",
				super.toString(), "weekly salary", getWeeklySalary());
	}
	
	
	
	
	
	

}
