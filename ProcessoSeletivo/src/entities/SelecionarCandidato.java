package entities;


import java.util.concurrent.ThreadLocalRandom;

public class SelecionarCandidato {

	// Este método seleciona candidatos com base no salário pretendido.
	// Ele percorre a lista de candidatos e, para cada candidato, verifica o salário
	// pretendido.
	// Se o salário pretendido for menor que um salário base, o candidato é
	// selecionado.
	// O processo continua até que 5 candidatos sejam selecionados ou a lista de
	// candidatos se esgote.
	public static void selecaoCanditado() {
		String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
				"Daniela", "Jorge" };
		int candidatosSelecionados = 0;
		int canditosAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && canditosAtual < candidatos.length) {
			String candidato = candidatos[canditosAtual];
			double salarioPretendido = valorPretendido();

			System.out.printf("O candito %s solicitou este valor de salário: %.2f\n", candidato, salarioPretendido);

			// Seleciona o candidato se o salário pretendido for menor que o salário base
			if (salarioBase > salarioPretendido) {
				System.out.printf("O candidato %s foi selecionado para a vaga:\n", candidato);
				candidatosSelecionados++;
			}
			canditosAtual++;
		}
	}

	// Este método gera um valor aleatório entre 1800.0 e 2200.0, representando o
	// salário pretendido pelo candidato.
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
	}
}