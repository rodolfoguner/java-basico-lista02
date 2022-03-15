package br.fai.ex01;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		
		HashMap<Integer, Candidato> candidatos = new HashMap<Integer, Candidato>();
		candidatos.put(1, new Candidato(1, "Joao"));;
		candidatos.put(2, new Candidato(2, "Maria"));
		candidatos.put(3, new Candidato(3, "Jose"));
		candidatos.put(4, new Candidato(4, "Antonio"));
		candidatos.put(5, new Candidato(5, "Tibursinho"));

		Scanner scanner = new Scanner(System.in);		
		
		while (true) {
			int voto;
			
			System.out.println("Lista de candidatos: ");
			for (Candidato candidato: candidatos.values()) {
				System.out.print(candidato.getId() + ". " + candidato.getNome()+ "\t");
			}
			
			System.out.print("\nDigite seu voto ou 0 para encerrar votação: ");
			voto = scanner.nextInt();
			
			if (voto == 0) {
				break;
			}
			
			switch (voto) {
			case 1: {
				candidatos.get(voto).setVotos(1);
				break;
			}
			case 2: {
				candidatos.get(voto).setVotos(1);
				break;
			}
			case 3: {
				candidatos.get(voto).setVotos(1);
				break;
			}
			case 4: {
				candidatos.get(voto).setVotos(1);
				break;
			}
			case 5: {
				candidatos.get(voto).setVotos(1);
				break;
			}
			default:
				System.out.println("Candidato inválido.");
			}
		}
		
		exibeGanhador(candidatos);
		
		
	}
	
	private void exibeGanhador(HashMap<Integer, Candidato> candidatos) {
		
		List<Candidato> candidatoGanhador = Candidato.verificaGanhador(candidatos);
		int i = 0;
		
		System.out.println("O candidato eleito é o " + candidatoGanhador.get(0).getNome());
		
		for (Candidato candidato: candidatoGanhador) {
			i += 1;
			System.out.println("Lugar " + i + ": Candidato " + candidato.getNome() + " - " + candidato.getVotos() + " votos");
		}
		
	}
}
