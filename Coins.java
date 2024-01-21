/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		//Creates a new variable and inputs the first input into it
		int coins = Integer.parseInt(args[0]);
		// Checks for the numbers of quarters needed
		int quarters = coins/25;
		//Checks the number of cents needed
		int cents = coins - (quarters*25);
		// Prints the output
		System.out.println("Use " + quarters + " quarters and " + cents + " cents");
	}
}