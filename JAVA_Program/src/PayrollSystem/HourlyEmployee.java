package PayrollSystem;

public class HourlyEmployee {
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName,
			String socialSecurityNumber, double wage, double hours)
	{
		super();
		
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException(
			"Hourly wage must be >= 0.0");
			if ((hours < 0.0) || (hours > 168.0)) // validate hours
			throw new IllegalArgumentException(
			"Hours worked must be >= 0.0 and <= 168.0");
			this.wage = wage;
			this.hours = hours;
	}

	/**
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}

	/**
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		this.wage = wage;
		
	}

	/**
	 * @return the hours
	 */
	public double getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}
	

}
