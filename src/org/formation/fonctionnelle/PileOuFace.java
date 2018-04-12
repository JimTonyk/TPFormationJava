package org.formation.fonctionnelle;

import java.util.Scanner;

/**
 * This class is a simulation of "Heads or Tails" game using a random generator.
 * JVM choose a integer (0: heads or 1: tails) and user enter an integer. If
 * result of machine is similar to the user one, user wins.
 * 
 * @author JM. Hiltbrunner
 *
 */
public class PileOuFace {

	public static void main(String[] args) {
		int choose;

		System.out.println("Please enter 0 (heads) or 1 (tails)");
		Scanner sc = new Scanner(System.in);
		choose = sc.nextInt();

		int random = (int) (Math.random() * 2);
		if (random == choose)
			System.out.println("You win!");
		else if (random == 1 && choose == 0)
			System.out.println("Bad luck, it was tails!");
		else
			System.out.println("Bad luck, it was heads!");

		sc.close();

	}

}
