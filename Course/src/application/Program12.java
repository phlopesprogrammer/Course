package application;

import java.util.Locale;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		double[] vector = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite os números: ");
			vector[i] = sc.nextDouble();

		}
		System.out.print("Valores: ");

		for (int i = 0; i < n; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
		System.out.print("Soma: ");
		double soma = 0;

		for (int i = 0; i < n; i++) {

			soma += vector[i];

		}
		System.out.printf("%.2f%n", soma);

		System.out.print("Média: ");
		double media = 0;
		for (int i = 0; i < n; i++) {
			media = soma / n;
		}
		System.out.printf("%.2f%n",media);
		sc.close();

	}

}
