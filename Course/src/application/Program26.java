package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Program26 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registred? ");

		List<Employee2> list = new ArrayList<>();

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");

			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee2 emp = new Employee2(id, name, salary);

			list.add(emp);

		}
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("ID does not exist, type again");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee2 emp : list) {
			System.out.println(emp);
		}

		sc.close();

	}

	public static Integer position(List<Employee2> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {

				return i;
			}
		}
		return null;
	}

}
