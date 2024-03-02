package entities;


public class Candidato {

	// Este método analisa se um candidato deve ser considerado com base no salário
	// pretendido.
	// Ele compara o salário pretendido com um salário base.
	// Se o salário pretendido for menor que o salário base, uma mensagem para ligar
	// para o candidato é impressa.
	// Se o salário pretendido for igual ao salário base, uma mensagem para ligar
	// para o candidato com uma contra proposta é impressa.
	// Se o salário pretendido for maior que o salário base, uma mensagem para
	// aguardar o resultado dos demais candidatos é impressa.
	public static void analisarCandtido(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase < salarioPretendido) {
			System.out.println("Ligar para os candidatos:");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		} else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
}