package br.edu.uni7.jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy =  InheritanceType.TABLE_PER_CLASS)
abstract public class  Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String username;
	
	private String password;
	
	public static enum StatusType{
		ATIVO,BLOQUEADO, DESATIVO, REMOVIDO
	}
	
	@Enumerated(EnumType.STRING)
	private StatusType status;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	@ManyToMany
		@JoinTable(name = "usuario_projeto",
		joinColumns = @JoinColumn(name="usuario_id"),
		inverseJoinColumns = @JoinColumn(name="projeto_id")
		)
	private List<Projeto> projetos = new ArrayList<Projeto>();

	public Usuario() {
		
	}

	public Usuario(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
	
	
	
}
