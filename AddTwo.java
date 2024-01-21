/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// Declaration of 2 new integers.
		int num1, num2;
		// Inputting numbers into the variables
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		// Creating a new variable and putting the sum of num1,num2 into it
		int num3 = num1+num2;
		// Prints the output
		System.out.println(num1 + " + " + num2 + " = "+ num3);
	}
}
