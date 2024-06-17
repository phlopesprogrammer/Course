package application;

import java.util.Locale;
import java.util.Scanner;

import entities.GeneroPessoas;

public class Program21 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();

		GeneroPessoas[] vector = new GeneroPessoas[n];

		double maiorAltura = 0;
		double SomaAltura = 0;
		int contadorMulheres = 0;
		int contadorHomens = 0;
		double mediaAlturaF;

		for (int i = 0; i < n; i++) {
			int cont = (n - (n - (i + 1)));

			System.out.print("Altura da " + cont + " pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Gênero da " + cont + " pessoa: ");
			char genero = sc.next().charAt(0);

			vector[i] = new GeneroPessoas(altura, genero);
		}

		for (int i = 0; i < n; i++) {
			if (vector[i].getAltura() > maiorAltura) {
				maiorAltura = vector[i].getAltura();
			}

		}
		double menorAltura = vector[0].getAltura();
		for (int i = 0; i < n; i++) {

			if (vector[i].getAltura() < menorAltura) {
				menorAltura = vector[i].getAltura();
			}

		}

		for (int i = 0; i < n; i++) {

			if (vector[i].getGenero() == 'F' || vector[i].getGenero() == 'f') {
				contadorMulheres++;

			}

		}
		for (int i = 0; i < n; i++) {

			if (vector[i].getGenero() == 'M' || vector[i].getGenero() == 'm') {
				contadorHomens++;

			}

		}
		for (int i = 0; i < n; i++) {
			if (vector[i].getGenero() == 'F' || vector[i].getGenero() == 'f') {
				SomaAltura += vector[i].getAltura();

			}
		}

		mediaAlturaF = SomaAltura / contadorMulheres;

		System.out.println("Menor Altura: " + menorAltura);
		System.out.println("Maior Altura: " + maiorAltura);
		System.out.printf("Média das alturas das mulheres:%.2f%n", mediaAlturaF);
		System.out.print("Número de homens = " + contadorHomens);

		sc.close();

	}

}
