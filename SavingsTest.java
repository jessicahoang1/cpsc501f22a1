import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SavingsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMoneyTransfer() {
		double epsilon = 0.000001d;

		Savings savingsSimulator = new Savings("Jessica","Hoang");
		savingsSimulator.setSavings(1000.0);
		savingsSimulator.moneyTransferSavToCheq(100.0);
		double expected = 900.0;
		double actual = savingsSimulator.getSavings();
		
		Assert.assertEquals(expected, actual, epsilon);
	}

}
