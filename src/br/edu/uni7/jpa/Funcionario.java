package br.edu.uni7.jpa;

import javax.persistence.*;

@Entity
public class Funcionario extends Usuario {

	private String cargo;
	
	private String setor;
	
	public Funcionario() {
		
	}
	
	public Funcionario(Long id, String username, String password, String cargo, String setor) {
		super(id,username,password);
		this.cargo = cargo;
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	

}
