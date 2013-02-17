import java.util.ArrayList;


/**
 * An implementation of the Shaw-Traub Algorithm. 
 * This implementation comes from a description of the algorithm
 * in the following source: 
 * "Algorithms: Their Complexity and Efficiency. 2nd Edition. 
 * Lydia Kronsjo. 
 * Univeristy of Birmingham. (Page 37)." 
 * 
 * @author Jervis
 *
 */
public class ShawTraub {

	public static ArrayList<Double> getDerivatives(Polynomial p, double x) {
		int polyOrder = p.getOrder(); 
		int n = polyOrder;
		VMatrix V = new VMatrix(polyOrder);
		
		try {
			for (int i = 0; i <= n - 1; ++i) {
				double t1 = p.getCoeffA(i + 1);
				double t2 = Math.pow(x, n - i - 1);
				double val = t1 * t2;
				V.set(-1, i, val);
			}
			
			for (int j = 0; j <= n; ++j) {
				double t1 = p.getCoeffA(0);
				double t2 = Math.pow(x, n);
				double val = t1 * t2;
				V.set(j, j, val);
			}
			
			for (int j = 0; j <= n-1; ++j) {
				for (int i = j + 1; i <= n; ++i) {
					double t1 = V.get(j-1, i-1);
					double t2 = V.get(j, i-1);
					double val = t1 + t2;
					V.set(j, i, val);
				}
			}
		} catch (Exception e) {
			System.out.println("An error occured: " + e);
			e.printStackTrace();
		}
		
		return getDerivativesFromVMatrix(V);
	}
	
	private static ArrayList<Double> getDerivativesFromVMatrix(VMatrix v) {
		
		int polyOrder = v.size();
		ArrayList<Double> result = new ArrayList<Double>(polyOrder);
		try {
			for (int i = 0; i < polyOrder; ++i) {
				double val = v.get(i, polyOrder);
				result.add(val);
			}
		} catch (Exception e) {
			System.out.println("An error occured: " + e);
			e.printStackTrace();
			return null;
		}
		return result;
	}
}