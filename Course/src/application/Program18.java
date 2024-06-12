package application;

import java.util.Locale;
import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();

		int[] vector = new int[n];
		double pares = 0;
		double mediaPares;
		double cont = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {

			if (vector[i] % 2 == 0) {
				pares += vector[i];
				cont = i - 1;

			}

		}
		if (pares != 0) {
			mediaPares = pares / cont;
			System.out.println("Média dos pares: " + mediaPares);
		}

		if (pares == 0) {
			System.out.println("Nenhum número par");
		}

		sc.close();
	}
}
