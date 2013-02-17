

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
	private int size; 
	/**
	 * Creates a VMatrix of the given size 'N'
	 * @param n - the size
	 */
	public VMatrix(int n) {
		
		int rows = n + 2;
		int cols = n + 1;
		this.data = new double[rows][cols];
		this.size = n;
	}
	
	public double get(int row, int col) throws Exception {
		/* Check inputs */
		verifyInput(row, col);
		
		/* 
		 * We need to add 1 to the row to make it 0-indexed
		 * but the col value is already 0-indexed. 
		 */
		
		int r = row + 1;
		int c = col; 
		return data[r][c];
	}
	
	/**
	 * Verifies that the given inputs for indexing into the 
	 * matrix are valid (same range as the mathematical notations). 
	 * @param row
	 * @param col
	 * @throws Exception if the inputs are not valid 
	 */
	private void verifyInput(int row, int col) throws Exception {
		int minRow = -1;
		int maxRow = this.size;
		
		int minCol = 0;
		int maxCol = this.size;
		
		if (!Util.checkInRange(row, minRow, maxRow))
			throw new Exception ("Row value out of range: " + row);
		if (!Util.checkInRange(col, minCol, maxCol))
			throw new Exception ("Col valu out of rnage: " + col);
	}
	
	public void set(int row, int col, double val) throws Exception {
		/* Check inputs */
		verifyInput(row, col);
		
		/* 
		 * We need to add 1 to the row to make it 0-indexed
		 * but the col value is already 0-indexed. 
		 */
		
		int r = row + 1;
		int c = col; 
		data[r][c] = val;
	}
}
