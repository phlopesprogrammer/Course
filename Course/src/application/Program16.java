package application;

import java.util.Locale;
import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor ? ");
		int n = sc.nextInt();

		int[] vectorA = new int[n];
		int[] vectorB = new int[n];
		int[] vectorC = new int[n];

		System.out.println("Digite os valores do vetor A: ");

		for (int i = 0; i < n; i++) {
			vectorA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			vectorB[i] = sc.nextInt();

		}
		System.out.println("Vetor Resultante: ");
		for (int i = 0; i < n; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
			System.out.println(vectorC[i]);
		}

		sc.close();
	}

}
