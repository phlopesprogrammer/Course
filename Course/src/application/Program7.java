package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price ? ");
		double quota = sc.nextDouble();

		System.out.println("How many dollars will be bought? ");
		double dollar = sc.nextDouble();

		double values = CurrencyConverter.valueInReal(dollar, quota);

		System.out.printf("Amount to be paid in reais: %.2f ", values);

		sc.close();
		
		
	}

}
