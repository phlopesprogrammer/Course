package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program6 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		Calculator calc = new Calculator();

		double c = calc.circunferemce(radius);
		double v = calc.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();

	}

	

}
