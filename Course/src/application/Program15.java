package application;

import java.util.Locale;
import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();

		int[] vector = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextInt();
		}

		int numeroMaior = 0;
		int posicaoMaior = 0;
		for (int i = 0; i < n; i++) {
			if (vector[i] > numeroMaior) {
				numeroMaior = vector[i];
				posicaoMaior = i;

			}
		}

		System.out.println("MAIOR NÚMERO: " + numeroMaior);
		System.out.println("POSIÇÃO DO MAIOR NÚMERO: " + posicaoMaior);

		sc.close();

	}
}
