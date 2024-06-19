package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Program25 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registred? ");

		// Instanciar uma lista/Instantiate a list

		List<Employee2> list = new ArrayList<>();

		// List(Interface) do tipo Employee2 com o nome da variável de list,
		// /List(Interface) of type Employee2 with the name of the list variable,

		// Para instanciar usa o list do tipo ArrayList/To instantiate, use the list of
		// type ArrayList

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

			// Criar um funcionário/create an employee
			Employee2 emp = new Employee2(id, name, salary);// Construtor com argumentos/Constructor with arguments

			// Inserir construtor na lista/Insert builder into list
			list.add(emp);
			// Ao receber construtor na lista(emp), os dados inseridos do
			// funcionário(id,name,salary) sao adicionados a list.add

		}
		System.out.println("Enter the employee id that will have salary increase: ");// "Insira o Id do funcionário que
																						// terá aumento salarial:"

		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary); // Recebe a função position que recebe como argumento a list(lista de
												// funcionários) e o id(id digitado)
		if (pos == null) {
			System.out.println("ID does not exist, type again: ");

		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent); // list.get(pos)Acessar na lista(list) o funcionário na posição(pos)
		} // .increaseSalary(percent)aumentar salário
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee2 emp : list) {
			System.out.println(emp);
		}

		sc.close();

	}

	public static Integer position(List<Employee2> list, int id) {// funçao position com argumentos list e id
		for (int i = 0; i < list.size(); i++) { // i começou com zero percorrendo lista até seu tamanho final
			if (list.get(i).getId() == id) {// list.get(i) posições do i dentro da lista(0,1,2...) .getId() numero do id
											// for igual ao id digitado
				return i; // Será retornado posição do i(0,1,2...) dentro da lista.
			}
		}
		return null; // caso contrário retorna null.
	}

}
