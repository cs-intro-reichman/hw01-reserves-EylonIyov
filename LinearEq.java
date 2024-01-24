/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
    public static void main(String[] args) {
		// Generates 3 variables and inserts the inputs into them.
        double NumA = Double.parseDouble(args[0]);
        double NumB = Double.parseDouble(args[1]);
        double NumC = Double.parseDouble(args[2]);
        //Re-arranges the equation in order to find the X
        double NumD = (NumC-NumB)/NumA;
		//Prints the result
        System.out.println(NumA + " * x + " + NumB + " = " + NumC);
        System.out.println("x = " + NumD);
        
    }
}