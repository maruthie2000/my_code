package basics;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		String input = "The quick brown fox jumps over the lazy dog";
		String str=s.nextLine();
		boolean isPangram = isPangram(str);

		if (isPangram) {
			System.out.println("The input is a pangram.");
		} else {
			System.out.println("The input is not a pangram.");
		}
	}

	public static boolean isPangram(String input) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		input = input.toLowerCase();

		for (char ch : alphabet.toCharArray()) {
			if (input.indexOf(ch) == -1) {
				return false;
			}
		}

		return true;
	}
}
