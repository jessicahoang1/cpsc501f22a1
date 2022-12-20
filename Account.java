public class Account {

	private String firstName;
	private String lastName;
	private double chequing; 
	private double savings;
	
	// new account has been created
	public Account(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		
		
		this.chequing = 0.0;
		this.savings = 0.0;
	}

	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public double getChequing() {
		return this.chequing;
	}
	
	public double getSavings() {
		return this.savings;
	}
	
	public void setChequing(double money) {
		chequing = money;
	}
	
	public void setSavings(double money) {
		savings = money;
	}

}
