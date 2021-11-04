package br.edu.uni7.jpa;

import javax.persistence.*;
import java.util.*;


@Entity
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String modelo;
	
	private String fabricante;
	
	private Double potencia;
	
	private String placa;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne
	private Vaga vaga;
	
	public Veiculo() {
		
	}

	public Veiculo(Long id, String modelo, String fabricante, Double potencia, String placa) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.potencia = potencia;
		this.placa = placa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
	
	
	
}
