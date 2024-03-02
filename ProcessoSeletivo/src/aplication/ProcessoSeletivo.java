package aplication;

import entities.Candidato;
import entities.ImprimirSelecionado;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.printf("Processo seletivo:\n");
		System.out.println();
		System.out.println("Canditados selecionados:");
		System.out.println();
		ImprimirSelecionado.imprimirSelecionados();
		System.out.println();
		ImprimirSelecionado.entrouEmContato();

	}
}
