

/**
 * This a special kind of Matrix
 * that's used in computing polynomial derivatives
 * in Traub-Shaw Algorithm. 
 * 
 * A VMatrix of size N will have: 
 * -> n+2 ROWS
 * -> n+1 COLS
 *
 * It's specialty comes from the range of rows/cols used to 
 * refer to data in the matrix. 
 * 
 * Valid Range is as follows: 
 * ROWS: -1 to n
 * COLS: 0 to n
 * 
 * The reason for this is to be consistent with the Mathematical notation
 * used in Shaw-Traub Algorithm. 
 * @author Jervis
 *
 */
public class VMatrix {
	private double[][] data;
	
	public VMatrix(int n) {
		
		int rows = n + 2;
		int cols = n + 1;
		this.data = new double[rows][cols];
	}
}
