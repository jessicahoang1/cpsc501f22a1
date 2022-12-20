import java.util.ArrayList;

public class Bank {
	
	ArrayList<String> accountsArray = new ArrayList<String>();
	
	public void addAccount(String lastName) {
		accountsArray.add(lastName);
	}
	
	public ArrayList<String> getArray() {
		return accountsArray;
	}
		
}
