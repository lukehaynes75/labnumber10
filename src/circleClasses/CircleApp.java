package circleClasses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String enter = "yes";
		int counter = 0;

		do {

			System.out.println("Please enter the radius of your circle");
			double userCiricle = scan.nextDouble();

			Circle circle1 = new Circle(userCiricle);
			System.out.println(circle1.getRadius());
			System.out.println(circle1.getFormattedCircumference());
			System.out.println(circle1.getFormattedArea());
			System.out.println("Do you want to enter another circle's radius");

			try {

				enter = scan.next();
			} catch (InputMismatchException e) {
				System.out.println("User input not matching. So we thought you'd like to try again");
				continue;
			}
			counter++;
		} while (enter.equalsIgnoreCase("yes"));
		System.out.println("GoodBye");
		System.out.println("You checked " + counter + " circles nice!");
	}
}
