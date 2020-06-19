package org.libertas.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idpessoa;
	
	@Column
	private String nome;
	
	@Column
	private String telefone;
	
	@Column
	private String email;
	
	@ManyToOne
	private Cidade cidade;
	
	@Column
	private String dataNascto;
	
	@ManyToOne
	private Profissao profissao;
	
	
	public int getIdpessoa() {
		return idpessoa;
	}
	public void setIdpessoa(int idpessoa) {
		this.idpessoa = idpessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getDataNascto() {
		return dataNascto;
	}
	public void setDataNascto(String dataNascto) {
		this.dataNascto = dataNascto;
	}
	public Profissao getProfissao() {
		return profissao;
	}
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	
	
}
