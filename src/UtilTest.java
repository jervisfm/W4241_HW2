import static org.junit.Assert.*;

import org.junit.Test;


public class UtilTest {

	@Test
	public void factorial() {
		
		double err = Math.pow(10,-9);
		double e1 = 2; // 2!
		double e2 = 6; // 3!
		double e3 = 120; // 5!
		double e4 = 3628800; // 10!
		
		try {
			assertEquals(e1, Util.factorial(2), err);
			assertEquals(e2, Util.factorial(3), err);
			assertEquals(e3, Util.factorial(5), err);
			assertEquals(e4, Util.factorial(10), err);
		} catch(Exception e) {
			fail("An error occured:  " + e);
		}
	}

}
