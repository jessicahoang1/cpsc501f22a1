
public class Savings extends Account{

	public Savings(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public void moneyTransferSavToCheq(double money) {
		setChequing(super.getChequing() + money);
		setSavings(super.getSavings() - money);
	}

	public void display() {
		System.out.print("Money has been transferred out, new balance is: " + super.getSavings());
	}
}
