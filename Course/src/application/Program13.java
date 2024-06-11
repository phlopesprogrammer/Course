package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people:");
		int n = sc.nextInt();
		Person[] vect = new Person[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Whats your name: ");
			String name = sc.nextLine();
			System.out.print("How old are you: ");
			int age = sc.nextInt();
			System.out.print("How tall are you: ");
			double height = sc.nextDouble();
			vect[i] = new Person(name, age, height);

		}
		double mediaHeight = 0;

		for (int i = 0; i < n; i++) {
			mediaHeight += vect[i].getHeight() / n;

		}
		System.out.printf("Average height:%.2f ", mediaHeight);

		double minor16 = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i].getAge() < 16) {
				minor16 += i;
			}

		}

		double percentageAge = (minor16 / n) * 100;
		System.out.println();
		System.out.print("Percentage: " + percentageAge + "%");
		System.out.println();

		String nameMinor16 = "";
		for (int i = 0; i < n; i++) {

			if (vect[i].getAge() < 16) {
				nameMinor16 += vect[i].getName() + "\n";

			}
		}
		System.out.printf(nameMinor16);

		sc.close();

	}

}
