
public class PersonalBanking {

	public double withdrawalChequing(Account mine, double money) {
		double newBalance = mine.getChequing() - money;
		return newBalance;
	}
	
	public double withdrawalSavings(Account mine, double money) {
		double newBalance = mine.getSavings() - money;
		return newBalance;		
	}
	
	public double depositChequing(Account mine, double money) {
		double newBalance = mine.getChequing() + money;
		return newBalance;
	}

	public double depositSavings(Account mine, double money) {
		double newBalance = mine.getSavings() + money;
		return newBalance;
	}
	
}

