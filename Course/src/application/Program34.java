package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter2;

public class Program34 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o valor do preço do dollar: ");
		CurrencyConverter2.priceDollar = sc.nextDouble();
		System.out.println("Quantos dolares serão comprados: ");
		CurrencyConverter2.dollar = sc.nextDouble();
		System.out.println("Qual o valor pago em reais: ");
		CurrencyConverter2.calcReal();

		sc.close();

	}

}
