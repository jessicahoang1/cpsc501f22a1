import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonalBankingTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testWithDrawChequing() {
		double epsilon = 0.000001d;

		Account accountSimulator = new Account("Jessica", "Hoang");
		accountSimulator.chequing = 1000;
		
		PersonalBanking personalSimulator = new PersonalBanking();
		double actual = personalSimulator.withdrawalChequing(accountSimulator, 100);
		
		Assert.assertEquals(900.0, actual, epsilon);

		
	}

	@Test
	void testWithDrawSavings() {
		double epsilon = 0.000001d;

		Account accountSimulator = new Account("Jessica", "Hoang");
		accountSimulator.savings = 1000;
		
		PersonalBanking personalSimulator = new PersonalBanking();
		double actual = personalSimulator.withdrawalSavings(accountSimulator, 100);
		
		Assert.assertEquals(900.0, actual, epsilon);
	}
	
	@Test
	void testDepositChequing() {
		double epsilon = 0.000001d;

		Account accountSimulator = new Account("Jessica", "Hoang");
		
		PersonalBanking personalSimulator = new PersonalBanking();
		double actual = personalSimulator.depositChequing(accountSimulator, 100);
		
		Assert.assertEquals(100.0, actual, epsilon);
		
	}
	
	@Test
	void testDepositSavings() {
		double epsilon = 0.000001d;

		Account accountSimulator = new Account("Jessica", "Hoang");
		
		PersonalBanking personalSimulator = new PersonalBanking();
		double actual = personalSimulator.depositSavings(accountSimulator, 100);
		
		Assert.assertEquals(100.0, actual, epsilon);
		
	}
}
