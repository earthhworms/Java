package copProjects;
import java.util.Scanner;

public class quadraticEquations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, and c: ");
		
		double a = input.nextFloat(), b = input.nextFloat(), c = input.nextFloat();		
		
		double discriminant = (Math.sqrt(Math.pow(b, 2) - 4 * a * c));
		
		double r1 = (-b + discriminant) / (2 * a), r2 = (-b - discriminant) / (2 * a);
		
		if (discriminant == 0) {
			System.out.println("The equation has one root " + r1);
		} else if (discriminant > 0) {
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		} else {
			System.out.println("The equation has no real roots");
		}
	}

}
