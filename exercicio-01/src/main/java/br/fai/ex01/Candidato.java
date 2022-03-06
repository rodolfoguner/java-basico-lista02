package br.fai.ex01;

import java.util.ArrayList;
import java.util.List;

public class Candidato {

	private int id;
	private String nome;
	private List<Candidato> candidatos = new ArrayList<Candidato>();
	
	public Candidato(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	
}
