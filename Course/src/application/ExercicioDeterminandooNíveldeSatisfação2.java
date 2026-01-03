package application;

public class ExercicioDeterminandooNíveldeSatisfação2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nivel = 3;

		String feedback;

		switch (nivel) {
		case 1 -> feedback = "Muito Insatisfeito";
		case 2 -> feedback = "Insatisfeito";
		case 3 -> feedback = "Neutro";
		case 4 -> feedback = "Satisfeito";
		case 5 -> feedback = "Muito Satisfeito";
		default -> feedback = "Valor inválido";
		}
		System.out.println(feedback);
	}

}
