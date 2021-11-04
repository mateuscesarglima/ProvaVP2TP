package br.edu.uni7.jpa;

import javax.persistence.*;
import java.util.*;


@Entity
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	public static enum ProjetoAreaType{
		INFRA,DEV,UX,PRODUTO
	}
	
	public Projeto() {
		
	}
	
	@Enumerated(EnumType.STRING)
	private ProjetoAreaType area;
	
	@ManyToMany(mappedBy = "projetos")
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	public Projeto(Long id, String nome, ProjetoAreaType area) {
		super();
		this.id = id;
		this.nome = nome;
		this.area = area;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ProjetoAreaType getArea() {
		return area;
	}

	public void setArea(ProjetoAreaType area) {
		this.area = area;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
}
