import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankingTasksTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSavingRatesGICMethod() {
		double epsilon = 0.000001d;

		BankingTasks investmentGICSimulator = new BankingTasks("GIC");
		Account accountSimulator = new Account("Jessica", "Hoang");
		accountSimulator.setSavings(1000);
		double actual = investmentGICSimulator.appliedRatesForInvestmentTypes(accountSimulator);
		
		Assert.assertEquals(1056.0, actual, epsilon);
	}
	
	@Test
	void testSavingRatesBondsMethod() {
		double epsilon = 0.000001d;

		BankingTasks investmentBondsSimulator = new BankingTasks("Mutual Bonds");
		Account accountSimulator = new Account("Jessica", "Hoang");
		accountSimulator.setSavings(1000);
		double actual = investmentBondsSimulator.appliedRatesForInvestmentTypes(accountSimulator);
		
		Assert.assertEquals(1049.0, actual, epsilon);
	}

	@Test
	void testSavingRatesSecurityMethod() {
		double epsilon = 0.000001d;

		BankingTasks investmentSecuritySimulator = new BankingTasks("Security");
		Account accountSimulator = new Account("Jessica", "Hoang");
		accountSimulator.setSavings(1000);
		double actual = investmentSecuritySimulator.appliedRatesForInvestmentTypes(accountSimulator);
		
		Assert.assertEquals(1023.0, actual, epsilon);
	}
	
	@Test
	void testSavingRatesNoneMethod() {
		double epsilon = 0.000001d;

		BankingTasks investmentSecuritySimulator = new BankingTasks("");
		Account accountSimulator = new Account("Jessica", "Hoang");
		accountSimulator.setSavings(1000);
		double actual = investmentSecuritySimulator.appliedRatesForInvestmentTypes(accountSimulator);
		
		Assert.assertEquals(1000, actual, epsilon);
	}
	
	@Test
	void testAdvisorName() {
		BankingTasks investmentSimulator = new BankingTasks("");
		Account accountSimulator = new Account("Jessica", "Hoang");
		String expected = "Jessica Hoang";
		investmentSimulator.getFinancialAdvisorInformation("Jessica Hoang", "jessicahoang@bank.com", "4033458237");
		String actual = investmentSimulator.getAdvisor().getName();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	void testAdvisorEmail() {
		BankingTasks investmentSimulator = new BankingTasks("");
		Account accountSimulator = new Account("Jessica", "Hoang");
		String expected = "jessicahoang@bank.com";
		investmentSimulator.getFinancialAdvisorInformation("Jessica Hoang", "jessicahoang@bank.com", "4033458237");
		String actual = investmentSimulator.getAdvisor().getEmail();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	void testAdvisorNumber() {
		BankingTasks investmentSimulator = new BankingTasks("");
		Account accountSimulator = new Account("Jessica", "Hoang");
		String expected = "4033458237";
		investmentSimulator.getFinancialAdvisorInformation("Jessica Hoang", "jessicahoang@bank.com", "4033458237");
		String actual = investmentSimulator.getAdvisor().getNumber();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test() {
		BankingTasks bankSimulator = new BankingTasks("");
		bankSimulator.addAccount("Hoang");
		
		ArrayList<String> expected = new ArrayList<String>();
	
		expected.add("Hoang");

		boolean equal;
		if (expected.equals(bankSimulator.getArray())) {
			equal = true;
		} else {
			equal = false;
		}
		Assert.assertTrue(equal);
	}


}
