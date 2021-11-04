package br.edu.uni7.jpa;

import javax.persistence.*;


@Entity
public class Professor extends Usuario {

	private String titulacao;
	
	private Double cargaHoraria;
	
	public Professor() {
		
	}
	
	public Professor(Long id, String username, String password, String titulacao, Double cargaHoraria) {
		super(id, username, password);
		this.titulacao = titulacao;
		this.cargaHoraria = cargaHoraria;
	}


	public String getTitulacao() {
		return titulacao;
	}


	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}


	public Double getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	
}
