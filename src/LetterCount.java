/**
 * LetterCount.java  10/26/2015
 *
 *
 * Demonstrates the relationship between arrays and strings
 *
 */

import java.util.Scanner;

public class LetterCount {
	//---------------------------------------------------------------------
	//Reads a sentence from the user and counts the number of uppercase
	//and lowercase letters contained in it.
	//---------------------------------------------------------------------
	public static void main(String[] args) {
		final int NUMCHARS = 26;
		Scanner bobTheBuilder = new Scanner(System.in);

		int[] upper = new int[NUMCHARS];
		int[] lower = new int[NUMCHARS];

		char current; // current character being processed
		int other = 0;

		System.out.print("Enter a sentence: ");
		String line = bobTheBuilder.nextLine();

		// Count the number of each letter occurrence.
		for (int ch = 0;ch < line.length();ch++) {
			current = line.charAt(ch);

			if (current >= 'A' && current <= 'Z') {
				upper[current - 'A']++;
			}
			else if (current >= 'a' && current <= 'z') {
				lower[current - 'a']++;
			}
			else {
				other++;
			}
		}

		System.out.println();
		for (int letter = 0;letter < upper.length;letter++) {
			System.out.print((char)(letter + 'A'));
			System.out.print(": " + upper[letter]);
			System.out.print("\t\t" + (char)(letter + 'a'));
			System.out.println(": " + lower[letter]);
		}

		System.out.println("Non-alphabetic characters: " + other);
	}
}