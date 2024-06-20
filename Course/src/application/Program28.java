package application;

import java.util.Locale;
import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					int position = i;
					int position2 = j;
					System.out.println("Position: " + position + ", " + position2);

					if (j > 0) {
						int left = mat[i][j - 1];
						System.out.println("Left: " + left);
						if (j < mat.length - 1) {
							int right = mat[i][j + 1];
							System.out.println("Right: " + right);
						}
						if (i > 0) {
							int up = mat[i - 1][j];
							System.out.println("Up: " + up);
						}
						if (i < mat.length - 1) {
							int down = mat[i + 1][j];
							System.out.println("Down: " + down);
						}

					}

				}

			}

		}

		sc.close();
	}

}
