
public class Chequing extends Account{

	public Chequing(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public void moneyTransferCheqToSav(double money) {
		setChequing(super.getChequing() - money);
		setSavings(super.getSavings() + money);
	}
	
	public void display() {
		System.out.print("Money has been transferred out, new balance is: " + super.getChequing());
	}

}
