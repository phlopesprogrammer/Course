package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program19 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar: ");
		int n = sc.nextInt();

		Pessoas[] vectorA = new Pessoas[n];
		Pessoas[] vectorB = new Pessoas[n];
		int maiorIdade = 0;
		String maiorNome = "";

		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados da " + (n - (n - (i + 1))) + "º " + "pessoa: ");
			System.out.print("Digite o nome: ");
			String name = sc.next();

			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();

			vectorA[i] = new Pessoas(name);
			vectorB[i] = new Pessoas(idade);
		}
		for (int i = 0; i < n; i++) {
			if (vectorB[i].getIdade() > maiorIdade) {
				maiorIdade = vectorB[i].getIdade();
				maiorNome = vectorA[i].getName();
			}
		}
		System.out.println("Pessoas mais velha: " + maiorNome);

		sc.close();

	}

}
