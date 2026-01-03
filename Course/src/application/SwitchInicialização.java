package application;

public class SwitchInicialização {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dia = "Domingo";

		String tipoDia = switch (dia) {
		case "Segunda", "Terça", "Quarta", "Quinta", "Sexta" -> "Dia util";
		case "Sábado", "Domingo" -> "Fim de Semana";
		default -> "Desconhecido";
		};
		System.out.println(tipoDia);

	}

}
