package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String cont;

		System.out.println("Welcome to the Circle Tester");

		do {
			double radius = Validator.getDouble(scnr, "Please enter the radius: ", .01, 999999999);
			Circle circle = new Circle(radius);
			System.out.println(circle);

			System.out.println("Do you want to continue (y/n)");
			cont = scnr.nextLine();
		} while (cont.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");

		scnr.close();
	}

}
