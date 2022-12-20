import java.util.ArrayList;

public class BankingTasks {

	private String investmentType;
	private FinancialAdvisor financialAdvisor;
	
	ArrayList<String> accountsArray = new ArrayList<String>();
	
	public void addAccount(String lastName) {
		accountsArray.add(lastName);
	}
	
	public ArrayList<String> getArray() {
		return accountsArray;
	}
	
	public void getFinancialAdvisorInformation(String advisorName, String advisorEmail, String advisorNumber) {
		financialAdvisor = new FinancialAdvisor(advisorName, advisorEmail, advisorNumber);
	}
	
	public BankingTasks(String type) {
		investmentType = type;
	}
	
	public double appliedRatesForInvestmentTypes(Account mine) {
		switch(investmentType) {
		case "GIC":
			return mine.getSavings() * 1.056;
		case "Mutual Bonds":
			return mine.getSavings() * 1.049;
		case "Security":
			return mine.getSavings() * 1.023;
		}
		return mine.getSavings();
	}
	
	public FinancialAdvisor getAdvisor() {
		return financialAdvisor;
	}
}
