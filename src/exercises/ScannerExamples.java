package exercises;
import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	double number1 = sc.nextInt();
	double number2 = sc.nextInt();
	double answer = sc.nextInt();
		System.out.println( number1 + " + " + number2  + " = " + answer + " is " + 
			(number1 + number2 == answer));
	}
	

}
