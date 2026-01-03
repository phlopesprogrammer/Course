package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercícioDeterminandooNíveldeSatisfação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nivel = sc.nextInt();
		
		String satisfacao = switch(nivel) {
		case 1 -> "Extremamente Insatisfeito";
		case 2 -> "Insatisfeito";
		case 3 -> "Neutro";
		case 4 -> "Satisfeito";
		case 5 -> "Muito Satisfeito";
		default -> "Desconhecido";
		};
		System.out.println(satisfacao);
		
		
		sc.close();
	
		
	}

}
