package com.tiy.references;

import java.util.Scanner;

public class Nerd
{

	private static boolean stillPlaying = true;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (stillPlaying)
			{
				System.out.println("Oh god, why did you come to this story? It sucks. Quick, pick a better one.");

				myFirstMethod();

			}
	}

	private static void myFirstMethod() {
		System.out.println("Pop culture nerd reference engaged!\n" + "\tD D&D\n" + "\tW Star Wars\n"
				+ "\tT Star Trek\n" + "\tG Extra Jeff Goldblum Round!");

		String whichToPick = sc.nextLine();

		whichPicked(whichToPick);
	}

	public static boolean whichPicked(String theCulturePicked) {
		switch (theCulturePicked.toLowerCase()) {
		case "d":
			whatDndDoes();
			break;

		case "w":
			whatStarWarsDoes();
			break;

		case "t":
			whatStarTrekDoes();
			break;

		case "g":
			jeffBonus();
			break;
		default:
			System.out.println("You chose poorly. You get Glee now.");
			stillPlaying = false;

		}
		return stillPlaying;

	}

	public static void whatDndDoes() {
		System.out.println("You are Galstaff, Sorcerer of Light." + "\nThere are 7 ogres surrounding you."
				+ "\n\tA Cast Magic Missile." + "\n\tB Get a Mountain Dew.");

		String whichToPick = sc.nextLine();

		sorcererPicked(whichToPick);

	}

	public static void sorcererPicked(String ogres) {
		switch (ogres.toLowerCase()) {
		case "a":
			castMagicMissile();
			break;
		case "b":
			getMountainDew();
			break;
		}
	}

	public static void castMagicMissile() {
		System.out.println("I attack the Darkness!");
		System.out.println("Do you want to continue?" + "\n\tY Yes" + "\n\tN No");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
	}

	public static void getMountainDew() {
		System.out.println("Find a knife with +9 to ogre slaying");
		System.out.println("Do you want to continue?" + "\n\tY Yes" + "\n\tN No");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
	}

	public static void whatStarWarsDoes() {
		System.out.println("You are a nerf herder." + "\nHow do you feel?." + "\n\tA Have a bad feeling about this."
				+ "\n\tB Feel a great disturbance in the Force.");

		String whichToPick = sc.nextLine();

		feelPicked(whichToPick);
	}

	public static void feelPicked(String feel) {
		switch (feel.toLowerCase()) {
		case "a":
			ewokStew();
			break;
		case "b":
			fireDeathStar();
			break;
		}
	}

	public static void ewokStew() {
		System.out.println("YUB NUB!");
		System.out.println("Do you want to continue?" + "\n\tY Yes" + "\n\tN No");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
	}

	public static void fireDeathStar() {
		System.out.println("Lasers don't work that way though.");
		System.out.println("Do you want to continue?" + "\n\tY Yes" + "\n\tN No");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
	}

	public static void whatStarTrekDoes() {
		System.out.println("You are a red shirt." + "\nWhat is the Stardate?" + "\n\tA 1312.4" + "\n\tB 23634.1");

		String whichToPick = sc.nextLine();

		redShirtPicked(whichToPick);
	}

	public static void redShirtPicked(String beam) {
		switch (beam.toLowerCase()) {
		case "a":
			kirk();
			break;
		case "b":
			picard();
			break;
		}
	}

	public static void kirk() {
		System.out.println("Kirk sleeps with your mom.");
		System.out.println("Do you want to continue?" + "\n\tY Yes" + "\n\tN No");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
	}

	public static void picard() {
		System.out.println("Picard bores your mom with diplomacy.");
		System.out.println("Do you want to continue?" + "\n\tY Yes" + "\n\tN No");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
	}

	public static void jeffBonus() {
		System.out.println("You hear the voice of Jeff Goldblum." + "\n'Must go faster'." + "\n\tA Jurassic Park."
				+ "\n\tB Independence Day.");

		String whichToPick = sc.nextLine();

		jeffPicked(whichToPick);

	}

	public static void jeffPicked(String chaos) {
		switch (chaos.toLowerCase()) {
		case "a":
			poop();
			break;
		case "b":
			fatLady();
			break;
		}
	}

	public static void poop() {
		System.out.println("That is one big pile of shit");
		System.out.println("Do you want to continue?" + "\n\tY Yes" + "\n\tN No");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
	}

	public static void fatLady() {
		System.out.println("Forget the fat lady. You're obsessed with fat lady. Just get us out of here!");
		System.out.println("Do you want to continue?" + "\n\tY Yes" + "\n\tN No");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
	}

	private static boolean theFinalMethod(String stayOrGo) {
		// TODO Auto-generated method stub

		switch (stayOrGo.toLowerCase()) {
		case "y":
			return stillPlaying;
		case "n":
			stillPlaying = false;
			break;

		default:
			stillPlaying = false;
			break;

		}
		return stillPlaying;

	}

}

