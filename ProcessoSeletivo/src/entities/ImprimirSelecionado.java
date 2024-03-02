package entities;




import java.util.Random;

public class ImprimirSelecionado {

	// Este método irá imprimir os primeiros 5 candidatos do array candidatos.
	private static String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio",
			"Mirela" };

	public static void imprimirSelecionados() {

		for (int i = 0; i < 5; i++) {

			System.out.printf("O candidato de n° %d é o %s\n", (i + 1), candidatos[i]);
		}

	}

	// Este método tenta estabelecer contato com um determinado candidato. Ele
	// tentará até 3 vezes ou até que o candidato "atenda". A "resposta" do
	// candidato é simulada pelo método atender(), que retorna um booleano
	// aleatório. Se o candidato "atender" (ou seja, se atender() retornar true),
	// ele imprimirá uma mensagem informando que o contato foi bem-sucedido e
	// quantas tentativas foram necessárias. Se o candidato não "atender" após 3
	// tentativas, ele imprimirá uma mensagem informando que o candidato não
	// atendeu.
	public static void entrandoEmContato(String candidato) {

		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.printf("Contato realizado com sucesso:\n");
			}
		} while (continuarTentando && tentativasRealizadas < 3);
		if (atendeu) {
			System.out.printf("Conseguimos contato com %s na %d° tentativa:\n", candidato, tentativasRealizadas);
		} else {
			System.out.printf("Não não conseguimos contato com %s, número maximo de tentativas %d:\n", candidato,
					tentativasRealizadas);
		}

	}

	// Este método irá percorrer todos os candidatos do array candidatos e tentará
	// estabelecer contato com cada um deles.
	public static void entrouEmContato() {
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}

	}

	// Este método
	// retorna um
	// valor booleano aleatório,
	// simulando se
	// um candidato
	// atende ou
	// não.A chance
	// de um candidato"atender"
	// é de 1 em 3.
	public static boolean atender() {

		return new Random().nextInt(3) == 1;
	}

}
