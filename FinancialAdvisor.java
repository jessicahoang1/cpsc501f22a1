
public class FinancialAdvisor {

	private String name;
	private String email;
	private String phoneNum; 
	
	public FinancialAdvisor (String name, String email, String number) {
		this.name = name;
		this.email = email;
		this.phoneNum = number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNumber() {
		return phoneNum;
	}
	
}
