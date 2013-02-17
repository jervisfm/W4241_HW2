import java.util.ArrayList;


/**
 * Class to Represent a polynomial 
 * @author Jervis
 *
 */
public class Polynomial {

	/**
	 * stores the polynomial coefficients in the order
	 * 
	 * a_0 a_1 ... a_n 
	 * 
	 * with the polynomial itself being
	 * 
	 * a_0 x^n + a_1 + x^(n-1) + ... + a_n x^0
	 * 
	 */
	private ArrayList<Double> coeff;
	
	
	public Polynomial(int size) {
		this.coeff = new ArrayList<Double>(size);
	}
	
	public Polynomial(ArrayList<Double> coeff) {
		this.coeff = coeff;
	}
	
	public int getOrder() {
		return coeff.size() - 1;
	}
	
	/**
	 * Returns the coefficient of the given x pow
	 * @param pow
	 * @return
	 */
	public double getCoeffXPow(int pow) throws Exception {
		
		int n = getOrder();
		if (pow < 0 || pow > n)
			throw new Exception ("Power out of range: " + pow);
		
		int idx = n - pow;
		return coeff.get(idx);
	}
	
	public void setCoeffXPow(int pow, double val) throws Exception {
		
		int n = getOrder();
		if (pow < 0 || pow > n)
			throw new Exception ("Power out of range: " + pow);
		
		int idx = n - pow;
		coeff.set(idx, val);
	}
	
	public double getCoeffA(int n) {
		int order = getOrder();
		if (n < 0 || n > order)
			return 0;
		
		return coeff.get(n);
	}
	
	public void setCoeffA(int n, double val) throws Exception {
		int order = getOrder();
		if (n < 0 || n > order)
			throw new Exception ("'A_' index out of range: " + n);
		
		coeff.set(n, val);
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer(); 
		int x = getOrder();
		for (double a: coeff) {
			sb.append(a + "x^"+ x);
			if (x > 0)
				sb.append(" + ");
			--x;
		}
		return sb.toString();
	}
	
}
