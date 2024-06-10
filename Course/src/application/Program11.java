package application;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos número você vai digitar?");
		int n = sc.nextInt();
		if (n < 1 || n > 10) {
			System.out.println("Número incorreto, digite de 1 a 10");
			n = sc.nextInt();
		}
		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número:");
			vect[i] = sc.nextInt();

		}
		System.out.println("Números Negativos: ");

		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();

	}

}
