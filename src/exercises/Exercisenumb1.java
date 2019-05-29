package exercises;
import java.util.Scanner;
public class Exercisenumb1 {

	public static void main(String[] args) {
		double radius; // Declare radius
		double area; // Declare area
		
		// Assign a radius
		
		radius = 20; // radius is now 20
		
		// compute area 
		area = radius * radius * 3.14159;
		// Display Results
		System.out.println( " The area for the circle of radius "  + radius + " is " + area);
		  
///////////////
		
		
		System.out.println( " Introduction to Java Programming," + " by Y.Daniel Liang");
		
		
		///////////
		
		double i = 50.0;
		double k = i + 50.0;
		double j  = k + 1;
		System.out.println( " j is " + j + " and k is " + k);///Concatenation strings with numbers/
		/////////
		
		////////Rirst We Are Creating Scanner Object
		Scanner input = new Scanner(System.in);
		
		//// Prompt the user to enter the a radius
        System.out.println(" Enter a number for radius1 : ");
        double radius1 = input.nextDouble();
        /// Compute area 
        double area1 = radius1 * radius1 * 3.14159;
        System.out.println(" The area for circle of radius1 " + radius1 + " is " + area1);
	}
	} 


