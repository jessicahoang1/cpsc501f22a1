import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Bank bankSimulator = new Bank();
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
