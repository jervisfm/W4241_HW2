import java.io.File;
import java.util.ArrayList;


/**
 * Main Program
 * @author Jervis
 *
 */
public class Main {

	
	public static void usage() {
		String msg = "Usage: \n" +
					 "java main [file-path]";
	}
	
	public static void main(String[] args) {
	
		if (args.length != 1) {
			System.out.println("Invalid argumetns");
			usage();
			System.exit(-1);
		}
		
		String path = args[0];
		File f = new File(path);
		String s = "";
		try {
			s = Util.readFileToMemory(f);
		} catch (Exception e) {
			System.out.println("Failed to read file " + f.getAbsolutePath());
			System.exit(-1);
		}
		Polynomial p = PolyReader.fromString(s);
		double x = PolyReader.getXValue(s);
		
		
		ArrayList<Double> derivatives = ShawTraub.getDerivatives(p, x);
		
		
		String msg = String.format("Given Polynomial: %s\n" +
								  "All *Normalized* Polynomial Derivatives of " +
								  "above polynomial are listed below:\n\n", p);
		
		System.out.println(msg);
		ShawTraub.printDerivatives(derivatives);
	}
}
