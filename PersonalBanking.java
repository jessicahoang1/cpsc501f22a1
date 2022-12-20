
public class PersonalBanking {

	public double withdrawalChequing(Account mine, double money) {
		double newBalance = mine.chequing - money;
		return newBalance;
	}
	
	public double withdrawalSavings(Account mine, double money) {
		double newBalance = mine.savings - money;
		return newBalance;		
	}
	
	public double depositChequing(Account mine, double money) {
		double newBalance = mine.chequing + money;
		return newBalance;
	}

	public double depositSavings(Account mine, double money) {
		double newBalance = mine.savings + money;
		return newBalance;
	}
	
}

