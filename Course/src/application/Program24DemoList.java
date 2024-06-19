package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program24DemoList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marcos");// Adiciona elementos na lista
		System.out.println(list.size());// Tamanho da lista

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------------------------------------");
		list.remove("Ana");// Remover da lista a partir de comparação
		list.removeIf(x -> x.charAt(0) == 'M');// Remove todo o caractere que começa com a letra M
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		System.out.println("--------------------------------------------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());// Filtrar
																											// todos os
																											// nomes que
																											// começam
																											// com a
																											// letra A

		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("--------------------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);//Encontrar primeiro elemento que comeaça com a letra A
		System.out.println(name);

	}
}
