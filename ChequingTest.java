import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChequingTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMoneyTransfer() {
		double epsilon = 0.000001d;

		Chequing chequingSimulator = new Chequing("Jessica","Hoang");
		chequingSimulator.setChequing(1000.0);
		chequingSimulator.moneyTransferCheqToSav(100.0);
		double expected = 900.0;
		double actual = chequingSimulator.getChequing();
		
		Assert.assertEquals(expected, actual, epsilon);
	}

}
