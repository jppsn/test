import java.util.Scanner;

public class PointInCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1, y1, point; //Defines the variables x1 and x2
		
		//Prompts the user to enter first variable
		System.out.print("Enter first coordinate of your point: ");
		x1 = input.nextDouble();
		
		//Prompts the user to enter second variable
		System.out.print("Enter second coordinate of your point: ");
		y1 = input.nextDouble();
		
		//Computes where the point is
		point = (Math.sqrt(x1 * x1 + y1  *y1));
		System.out.println(point);
		
		//Prints whether the point is inside or outside the circle
		if (point <= 10)
			System.out.println("The point is inside the circle");
		else System.out.println("The point is outside the circle");	
		
	}

}
