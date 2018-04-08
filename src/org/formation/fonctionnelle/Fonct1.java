package org.formation.fonctionnelle;

import java.util.Scanner;

/**
 * This class will be divided into two parts: The first one will demand to enter
 * any integer on keyboard and multiply id by an approach of Pi. The second one
 * will calculate the area of this circle and the volume of the cylinder by
 * entering the height of the last one.
 * 
 * @author jim
 *
 */
public class Fonct1 {

	public static void main(String[] args) {
		// TODO Calculate the circumference of a circle by entering its radius

		// Requesting user for entering a radius
		System.out.println("Please enter a radius");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();

		double perimeter = radius * Math.PI;
		System.out.println("The perimeter of a circle with radius " + radius + " is " + perimeter);

		// TODO Calculate the area and the volume of a cylinder
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("The perimeter of a circle with radius " + radius + " is " + area);

		System.out.println("Please enter a height for the cylinder");
		double height = sc.nextDouble();
		double volume = area * height;
		System.out
				.println("The perimeter of a circle with radius " + radius + "and height " + height + " is " + volume);
		sc.close();

	}

}
