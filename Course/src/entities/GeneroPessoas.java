package entities;

public class GeneroPessoas {

	private double altura;
	private char genero;

	public GeneroPessoas(double altura, char genero) {
		this.altura = altura;
		this.genero = genero;

	}

	public double getAltura() {
		return altura;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {

		if (genero == 'M' || genero == 'm') {
			this.genero = genero;
		}
		if (genero == 'F' || genero == 'f') {
			this.genero = genero;
		}

	}

}
