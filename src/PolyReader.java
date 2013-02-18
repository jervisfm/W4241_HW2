import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Reads a Polynomial From a text file
 * @author Jervis
 *
 */
public class PolyReader {

	
	public static Polynomial fromFile(File f) throws Exception {
		String s = Util.readFileToMemory(f);
		return fromString(s);
	}
	
	
	public static Polynomial fromString(String s) {
		/**
		 * Format is: 
		 * [Polynomial Order]
		 * [Coefficeints separated by space]
		 * [the x - value to evaluate]  
		 */
		
		Scanner in = new Scanner(s);
		
		int polyOrder = in.nextInt(); 
		ArrayList<Double> coeff = new ArrayList<Double>(polyOrder + 1);
		
		for (int i = 0; i <=polyOrder; ++i) {
			double val = in.nextDouble();
			coeff.add(val);
		}
		Polynomial p = new Polynomial(coeff);
		return p;
	}
	
	public static double getXValue(String s) {
		s = s.trim();
		Scanner in = new Scanner(s); 
		in.nextLine(); 
		in.nextLine(); 
		return in.nextDouble();
	}
}
