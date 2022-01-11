package PayrollSystem;

public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	/**
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param grossSales
	 * @param commissionRate
	 */
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}
		if (grossSales < 0.0) {
			throw new IllegalArgumentException(
			"Gross sales must be  >= 0.0");
		}
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	/**
	 * @return the grossSales
	 */
	public double getGrossSales() {
		return grossSales;
	}
	/**
	 * @param grossSales the grossSales to set
	 */
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	/**
	 * @return the commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}
	/**
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
				"commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getCommissionRate() * getGrossSales() ;

	}
	

	

}
