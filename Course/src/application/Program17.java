package application;

import java.util.Locale;
import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor ? ");
		int n = sc.nextInt();

		double[] vector = new double[n];
		double media = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextDouble();
			media += vector[i];
		}
		media = media / n;
		System.out.println("Média do Vetor: " + media);

		for (int i = 0; i < n; i++) {
			if (vector[i] < media) {
				System.out.println("Elementos abaixo da média: " + vector[i]);

			}

		}

		sc.close();
	}

}
