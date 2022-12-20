public class Account {

	public String firstName;
	public String lastName;
	public double chequing; 
	public double savings;
	
	// new account has been created
	public Account(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		
		
		this.chequing = 0.0;
		this.savings = 0.0;
	}

}
