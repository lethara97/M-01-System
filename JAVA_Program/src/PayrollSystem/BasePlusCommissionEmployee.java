package PayrollSystem;

public class BasePlusCommissionEmployee extends CommissionEmployee{

	private double baseSalary;

	/**
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param grossSales
	 * @param commissionRate
	 * @param baseSalary
	 */
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if(baseSalary < 0.0 ) 
			throw new IllegalArgumentException (
					"Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}

	/**
	 * @return the baseSalary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}

	/**
	 * @param baseSalary the baseSalary to set
	 */
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s; %s: $%,.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getBaseSalary() + super.earnings();
	}
	
	
}
