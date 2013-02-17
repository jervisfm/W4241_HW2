
/**
 * 
 * A class for useful utility methods
 * @author Jervis
 *
 */
public class Util {

	/**
	 * Ensures that the given 'no' is between the given inclusive
	 * ranges. 
	 * @param no - number to check
	 * @param start - start range (inclusive)
	 * @param end - end range (inclusive)
	 * @return true - if the number is inrange
	 *         false otherwise. 
	 */
	public static boolean checkInRange(int no, int start, int end) {
		if (no >= start && no <= end)
			return true;
		else 
			return false;
	}
	
}
