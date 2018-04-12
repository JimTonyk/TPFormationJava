package org.formation.fonctionnelle;

import java.util.Scanner;

/**
 * This work is able to realize basic operations between two integers and the
 * sum of all digits for a 3-digit integer
 * 
 * @author JM. Hiltbrunner
 *
 */
public class Fonct0 {

	/**
	 * x and y are 2 integers chosen by user.
	 */
	static int x, y;

	/**
	 * Realize sum, substract, multiply and Euclidian division of integers x and y
	 */
	public static void ElementalOperations() {
		// Step 1: asks user for entering two integers.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any integer");
		x = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter the second integer");
		y = sc.nextInt();
		System.out.println("You have chosen integers " + x + " and " + y);

		// Step 2: Realizing all operations
		int sum = x + y;
		int substract = x - y;
		int product = x * y;
		int division = 0;
		int rest = 0;
		if (y != 0) {
			division = x / y;
			rest = x % y;
		} else
			System.out.println("You can't divide by 0");

		// Step 3: Display results
		System.out.println("Sum of " + x + " and " + y + ": " + sum);
		System.out.println("Substaction of " + x + " and " + y + ": " + substract);
		System.out.println("Product of " + x + " and " + y + ": " + product);
		System.out.println("Division of " + x + " and " + y + ": " + division + " and rest: " + rest);

		// Step 4: closing all resources
		sc.close();
	}

	public static void SumOfDigits() {
		// Step 1: asks user for entering two integers.
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any integer");
		x = s.nextInt();

		// Step 2: Realizing the sum of digits by using modulo operator
		int div1 = x / 10;
		int rest1 = x % 10;
		int div2 = div1 / 10;
		int rest2 = div1 % 10;

		int result = rest1 + div2 + rest2;
		System.out.println("The sum of digits of " + x + " is " + result);

		// Step 3: closing all resources
		s.close();

	}

	public static void main(String[] args) {
		//ElementalOperations();
		SumOfDigits();

	}

}
