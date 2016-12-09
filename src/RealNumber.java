
public class RealNumber {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		
		String string = "5";
		double b;
		
		b = Double.parseDouble(string);
		
		System.out.println(b);
		
		a = Math.toRadians(a);
		System.out.println("Math.sin("+ a + ") = " +
		Math.sin(a));
	}

}
