package basics;

import java.util.Random;

public class SuffleArray {
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
		shuffle(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	private static void shuffle(int[] ar) {
		Random ran = new Random();
		for (int i = 0; i < ar.length; i++) {
			int j = ran.nextInt(i + 1);
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
	}
}
