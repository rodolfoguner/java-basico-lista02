package br.fai.ex01;

import java.util.ArrayList;
import java.util.List;

public class Candidato {

	private int id;
	private String nome;
	private int votos = 0;
	
	public Candidato(int id, String nome) {
		this.id = id;
		this.nome = nome;
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
	
}
