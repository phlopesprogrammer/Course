package application;

import java.util.Locale;
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos número você vai digitar: ");
		int n = sc.nextInt();

		int[] vector = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextInt();
		}
		int pairNumbers = 0;
		System.out.println("Números pares: ");
		for (int i = 0; i < n; i++) {
			if (vector[i] % 2 == 0) {
				pairNumbers = vector[i];
				System.out.printf("%d  ",pairNumbers);
			}

		}

		sc.close();

	}

}
