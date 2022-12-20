import java.util.Scanner;

public class Main {

	private static String firstName;
	private static String lastName;
	private static String bankingType;
	private static String accountType;
	private static String amount;
	private static String investmentAnswer;
	private static String investmentTypeAnswer;
	private static double newBalance;
	private static String transfer;
	private static String transferAmount;
	
	static Scanner input = new Scanner(System.in);
	static BankingTasks banker = new BankingTasks("");
	static PersonalBanking myTasks = new PersonalBanking();
	
	public static void printBankingBalance(Account account) {
		System.out.println("\n"+"Your balance is: ");
		System.out.println("Chequing Account:" + account.getChequing());
		System.out.println("Savings Account:" + account.getSavings());
	}
	
	public static void getUserInput() {
		System.out.println("Please enter first name: ");
		firstName = input.nextLine();
		System.out.println("Please enter last name: ");
		lastName = input.nextLine();
		
		System.out.println("What do you want to do? [Withdraw/Deposit/Check Balance/]");
		bankingType = input.nextLine();
		
		System.out.println("From Chequing or Savings?");	
		accountType = input.nextLine();

		System.out.println("How much do you want to withdraw/deposit? (Enter and integer)");	
		amount = input.nextLine();
		
		System.out.println("Do you want to make any investments? [Yes/No]");
		investmentAnswer = input.nextLine();
		
		System.out.println("Which type of investment do you want to make? [GIC/Mutual Bonds/Security/None]");
		investmentTypeAnswer = input.nextLine();
		
		System.out.println("Do you want to transfer money from Chequing to Savings? [Yes/No]");
		transfer = input.nextLine();
		
		System.out.println("How much do you want to transfer?");
		transferAmount = input.nextLine();
		
	}

	public static void main (String[] args) {
	
		getUserInput();

		Account jAccount = new Account(firstName, lastName);
		
		banker.addAccount(jAccount.getLastName());
		
		if(bankingType.equalsIgnoreCase("Withdraw")) {
			if(accountType.equalsIgnoreCase("Chequing")) {
				newBalance = myTasks.withdrawalChequing(jAccount, Integer.parseInt(amount));
				jAccount.setChequing(newBalance);
			}
			if (accountType.equalsIgnoreCase("Savings")) {
				newBalance = myTasks.withdrawalSavings(jAccount, Integer.parseInt(amount));
				jAccount.setSavings(newBalance);
			}
		}
		if (bankingType.equalsIgnoreCase("Deposit")) {
			if(accountType.equalsIgnoreCase("Chequing")) {
				newBalance = myTasks.depositChequing(jAccount, Integer.parseInt(amount));
				jAccount.setChequing(newBalance);
			}
			if (accountType.equalsIgnoreCase("Savings")) {
				newBalance = myTasks.depositSavings(jAccount, Integer.parseInt(amount));
				jAccount.setSavings(newBalance);
			}			
		}
		if (bankingType.equalsIgnoreCase("Check Balance")) {
			printBankingBalance(jAccount);

		}
		
		if(investmentAnswer.equalsIgnoreCase("Yes")) {
			BankingTasks investMoney = new BankingTasks(investmentTypeAnswer);
			investMoney.getFinancialAdvisorInformation("Jessica Hoang", "jessicahoang@bank.com", "4033458237");
			newBalance = investMoney.appliedRatesForInvestmentTypes(jAccount);
			jAccount.setSavings(newBalance);
			System.out.println("Your financial advisor is: " + investMoney.getAdvisor().getName() + ", Email: " + investMoney.getAdvisor().getEmail() + ", Phone #: " + investMoney.getAdvisor().getNumber());
		}	
		
		if(transfer.equalsIgnoreCase("Yes")) {
			Chequing cheq = new Chequing(firstName, lastName);
			cheq.setChequing(jAccount.getChequing());
			cheq.moneyTransferCheqToSav(Double.parseDouble(transferAmount));
			cheq.display();
			jAccount.setChequing(cheq.getChequing());
		}
		
		printBankingBalance(jAccount);
		
	}
}
