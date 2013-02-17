import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class ShawTraubTest {

	@Test
	public void test() {
		
		/* x^2 + 2x + 1 */
		ArrayList<Double> dl  = new ArrayList<Double>(
									Arrays.asList(1.0,2.0,1.0));
		Polynomial p = new Polynomial(dl);
		double x = 2;
		double err = Math.pow(10,-9);
		System.out.println(p);
		
		double expected_d0 = 1 + 2*x + x*x;
		double expected_d1 = 2*x + 2*x*x;
		double expected_d2 = 1;
		
		ArrayList<Double> actual = ShawTraub.getDerivatives(p, x);
		System.out.println("Actual size ==" + actual.size());
		assertEquals(expected_d0, actual.get(0), err);
		assertEquals(expected_d1, actual.get(1), err);
		assertEquals(expected_d2, actual.get(2), err);
		
	}

}
