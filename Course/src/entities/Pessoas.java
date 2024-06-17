package entities;

public class Pessoas {

	private String name;
	private int idade;

	public Pessoas(String name) {
		this.name = name;
		
	}
	public Pessoas(int idade) {
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public int getIdade() {
		return idade;
	}

}
