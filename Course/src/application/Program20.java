package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AlunosNotas;

public class Program20 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serão digitados: ");
		int n = sc.nextInt();

		AlunosNotas[] vector = new AlunosNotas[n];
		double media = 0;
		String aprovados = "";
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome: ");
			String name = sc.nextLine();
			System.out.print("Digite a 1º nota: ");
			double nota1 = sc.nextDouble();
			System.out.print("Digite a 2º nota: ");
			double nota2 = sc.nextDouble();

			vector[i] = new AlunosNotas(name, nota1, nota2);

		}

		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {

			media = (vector[i].getNota1() + vector[i].getNota2()) / 2;

			if (media >= 6.0) {
				aprovados += vector[i].getName() + "\n";
			}

		}
		System.out.printf(aprovados);

		sc.close();

	}

}
