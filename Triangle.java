/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// Creates 3 variables, and inserts the input into them.
		int NumA = Integer.parseInt(args[0]);
        int NumB = Integer.parseInt(args[1]);
        int NumC = Integer.parseInt(args[2]);
		// Creates a new number from the 2 sides of the triangle.
		int NumD = NumA + NumB;
		// Checks if the sum of two sides of the triangle are bigger than the 3rd side.
		boolean Flag = NumD > NumC;
		//Prints the answer.
		System.out.println("The conclousion that the numbers" + NumA + " " + NumB + " " + NumC +" can form a triangle" );
		System.out.println("is: " + Flag);
		
	}
}