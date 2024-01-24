/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Inputs upper and lower border
		double upper = Double.parseDouble(args[0]);
        double lower = Double.parseDouble(args[1]);
		// Generating 3 random numbers in the borders.
		int num1 = (int)((upper-lower) * Math.random() + lower);
		System.out.println(num1);
		int num2 = (int)((upper-lower) * Math.random() + lower);
		System.out.println(num2);
		int num3 = (int)((upper-lower) * Math.random() + lower);
		System.out.println(num3);
		// Checks for the min number
		int min = Math.min(num1, num2);
		min = Math.min(min, num3);
		System.out.println("The minimal generated number was " + min);
	}
}
