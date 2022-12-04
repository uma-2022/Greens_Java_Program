package org.for2.prac;

public class pyramid {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {

				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 4; i >= 0; i--) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 0; k--) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}
}

		


