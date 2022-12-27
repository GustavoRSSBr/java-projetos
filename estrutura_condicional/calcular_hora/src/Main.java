import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		// jogo, sabendo que o mesmo pode
		// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
		// máxima de 24 horas.

		Scanner scan = new Scanner(System.in);
		int totalHoras;

		System.out.println("Digite a hora inicial do jogo");
		int horaInicial = scan.nextInt();
		System.out.println("Digite a hora final do jogo");
		int horaFinal = scan.nextInt();

		if ((horaInicial < 25 && horaInicial >= 0) && (horaFinal < 25 && horaFinal >= 0)) {
			if (horaInicial >= horaFinal) {
				totalHoras = (24 - horaInicial) + horaFinal;
				System.out.println("O jogo durou " + totalHoras + " hora(s)");
			} else {
				totalHoras = horaFinal - horaInicial;
				System.out.println("O jogo durou " + totalHoras + " hora(s)");
			}
		} else {
			System.out.println("Horário invalido");
		}

		scan.close();

	}

}
