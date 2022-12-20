import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvestmentsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSavingRatesGICMethod() {
		double epsilon = 0.000001d;

		Investments investmentGICSimulator = new Investments("GIC");
		Account accountSimulator = new Account("Jessica", "Hoang");
		accountSimulator.savings = 1000;
		double actual = investmentGICSimulator.savingsRates(accountSimulator);
		
		Assert.assertEquals(1056.0, actual, epsilon);
	}
	
	@Test
	void testSavingRatesBondsMethod() {
		double epsilon = 0.000001d;

		Investments investmentBondsSimulator = new Investments("Mutual Bonds");
		Account accountSimulator = new Account("Jessica", "Hoang");
		accountSimulator.savings = 1000;
		double actual = investmentBondsSimulator.savingsRates(accountSimulator);
		
		Assert.assertEquals(1049.0, actual, epsilon);
	}

	@Test
	void testSavingRatesSecurityMethod() {
		double epsilon = 0.000001d;

		Investments investmentSecuritySimulator = new Investments("Security");
		Account accountSimulator = new Account("Jessica", "Hoang");
		accountSimulator.savings = 1000;
		double actual = investmentSecuritySimulator.savingsRates(accountSimulator);
		
		Assert.assertEquals(1023.0, actual, epsilon);
	}
	
	@Test
	void testSavingRatesNoneMethod() {
		double epsilon = 0.000001d;

		Investments investmentSecuritySimulator = new Investments("");
		Account accountSimulator = new Account("Jessica", "Hoang");
		accountSimulator.savings = 1000;
		double actual = investmentSecuritySimulator.savingsRates(accountSimulator);
		
		Assert.assertEquals(1000, actual, epsilon);
	}
	
	@Test
	void testAdvisor() {
		Investments investmentSimulator = new Investments("");
		Account accountSimulator = new Account("Jessica", "Hoang");
		String expected = "Jessica";
		investmentSimulator.setFinancialAdvisor("Jessica");
		String actual = investmentSimulator.getAdvisor();
		
		Assert.assertEquals(expected, actual);
	}


}
