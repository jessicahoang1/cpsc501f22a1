import java.util.Scanner;

public class Main {

	public static String answer;

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first name: ");
		String firstName = input.nextLine();

		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter last name: ");
		String lastName = input2.nextLine();

		Bank banker = new Bank();

		Account jAccount = new Account(firstName, lastName);
		banker.addAccount(jAccount.lastName);
		
		PersonalBanking myTasks = new PersonalBanking();
			
		Scanner personalBankingInput = new Scanner(System.in);
		System.out.println("What do you want to do? [Withdraw/Deposit/Check Balance]");
	
		answer = personalBankingInput.nextLine();
		
		if(answer.equalsIgnoreCase("Withdraw")) {
			Scanner personalBankingAccountInput = new Scanner(System.in);
			System.out.println("From Chequing or Savings?");	
			answer = personalBankingAccountInput.nextLine();
			if(answer.equalsIgnoreCase("Chequing")) {
				Scanner howMuchMoney = new Scanner(System.in);
				System.out.println("How much do you want to withdraw from your Chequing account? (Enter and integer)");	
				answer = howMuchMoney.nextLine();
				double decreaseMoney = myTasks.withdrawalChequing(jAccount, Integer.parseInt(answer));
				jAccount.chequing = decreaseMoney;
				System.out.println("Your balance is: ");
				System.out.println("Chequing Account:" + jAccount.chequing);
				System.out.println("Savings Account:" + jAccount.savings);
			} else if (answer.equalsIgnoreCase("Savings")) {
				Scanner howMuchMoney = new Scanner(System.in);
				System.out.println("How much do you want to withdraw from your Savings account? (Enter and integer)");	
				answer = howMuchMoney.nextLine();
				double decreaseMoney = myTasks.withdrawalSavings(jAccount, Integer.parseInt(answer));
				jAccount.savings = decreaseMoney;
				System.out.println("Your balance is: ");
				System.out.println("Chequing Account:" + jAccount.chequing);
				System.out.println("Savings Account:" + jAccount.savings);

			}
		} else if (answer.equalsIgnoreCase("Deposit")) {
			Scanner personalBankingAccountInput = new Scanner(System.in);
			System.out.println("From Chequing or Savings?");	
			answer = personalBankingAccountInput.nextLine();
			if(answer.equalsIgnoreCase("Chequing")) {
				Scanner howMuchMoney = new Scanner(System.in);
				System.out.println("How much do you want to withdraw from your Chequing account? (Enter and integer)");	
				answer = howMuchMoney.nextLine();
				double addMoney = myTasks.depositChequing(jAccount, Integer.parseInt(answer));
				jAccount.chequing = addMoney;
				System.out.println("Your balance is: ");
				System.out.println("Chequing Account:" + jAccount.chequing);
				System.out.println("Savings Account:" + jAccount.savings);

			} else if (answer.equalsIgnoreCase("Savings")) {
				Scanner howMuchMoney = new Scanner(System.in);
				System.out.println("How much do you want to deposit from your Savings account? (Enter and integer)");	
				answer = howMuchMoney.nextLine();
				double addMoney = myTasks.depositSavings(jAccount, Integer.parseInt(answer));
				jAccount.savings = addMoney;
				System.out.println("Your balance is: ");
				System.out.println("Chequing Account:" + jAccount.chequing);
				System.out.println("Savings Account:" + jAccount.savings);

			}			
		} else if (answer.equalsIgnoreCase("Check Balance")) {
			System.out.println("Chequing Account:" + jAccount.chequing);
			System.out.println("Savings Account:" + jAccount.savings);
		}
		
		Scanner investInput = new Scanner(System.in);
		System.out.println("Do you want to make any investments? [Yes/No]");
		
		answer = investInput.nextLine();
		
		if(answer.equalsIgnoreCase("Yes")) {
			Scanner investInputType = new Scanner(System.in);
			System.out.println("Which type of investment do you want to make? [GIC/Mutual Bonds/Security]");
			answer = investInputType.nextLine();
			Investments investMoney = new Investments(answer);
			double addedMoney = investMoney.savingsRates(jAccount);
			jAccount.savings = addedMoney;
			investMoney.setFinancialAdvisor("Jessica Hoang");
			System.out.println("Your financial advisor is: " + investMoney.getAdvisor());
			System.out.println("Your balance after you invested is now: ");
			System.out.println("Savings Account:" + jAccount.savings);
		}		
		
	}
}
