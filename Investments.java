
public class Investments {

	private String investmentType;
	private String financialAdvisor;
	
	public void setFinancialAdvisor(String advisor) {
		financialAdvisor = advisor;
	}
	
	public Investments(String type) {
		investmentType = type;
	}

	public double savingsRates(Account mine) {
		switch(investmentType) {
		case "GIC":
			return mine.savings * 1.056;
		case "Mutual Bonds":
			return mine.savings * 1.049;
		case "Security":
			return mine.savings * 1.023;
		}
		return mine.savings;
	}
	
	public String getAdvisor() {
		return financialAdvisor;
	}
}
