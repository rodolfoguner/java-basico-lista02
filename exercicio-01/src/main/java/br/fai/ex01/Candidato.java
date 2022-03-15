package br.fai.ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Candidato {

	private int id;
	private String nome;
	private int votos;
	
	public Candidato() {}
	
	public Candidato(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.votos = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos += votos;
	}
	
	public static List<Candidato> verificaGanhador(HashMap<Integer, Candidato> candidatos) {
		List<Candidato> ranking = Candidato.tranformaCandidatosLista(candidatos);
		for (int i = 0; i < (ranking.size() - 1); i++) {
			Candidato aux;
			for (int j = 0; (j < ranking.size() - 1); j++) {
				if (ranking.get(i).getVotos() < ranking.get(j + 1).getVotos()) {
					aux = ranking.get(i);
					ranking.set(i, ranking.get(j + 1));
					ranking.set(j + 1, aux);
				}
			}
		}
		
		return ranking;
	}
	
	public static List<Candidato> tranformaCandidatosLista(HashMap<Integer, Candidato> candidatos) {
		
		List<Candidato> rankingCandidatos = new ArrayList<Candidato>();
		
		for (Candidato candidato: candidatos.values()) {
			rankingCandidatos.add(candidato);
		}
		
		return rankingCandidatos;
		
	}
 	
}
