package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangle retangle = new Retangle();

		System.out.println("Enter rectangle width and height: ");
		System.out.print("Width: ");
		retangle.width = sc.nextDouble();

		System.out.print("Hight: ");
		retangle.height = sc.nextDouble();

		System.out.printf("Area: " + "%.2f%n",retangle.area());
		retangle.area();

		System.out.printf("Perimeter: " + "%.2f%n", retangle.perimeter());

		System.out.printf("Diagonal: " + "%.2f%n", retangle.diagonal());

		sc.close();

	}

}
