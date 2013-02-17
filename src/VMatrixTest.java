import static org.junit.Assert.*;

import org.junit.Test;


public class VMatrixTest {

	@Test
	public void VMatrix() {
		VMatrix mat = new VMatrix(2);
		try {
			double err = Math.pow(10, -9);
			mat.set(-1, 2, 3);
			mat.set(1, 2, 6);
			
			assertEquals(3, mat.get(-1, 2), err);
			assertEquals(6, mat.get(1, 2), err);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("error occured");
		}
	}
	
	
	

}
