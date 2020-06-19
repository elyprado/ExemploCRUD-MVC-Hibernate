package org.libertas.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profissao")
public class Profissao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idProfissao;
	
	@Column
	private String nomeProfissao;
	
	@Column
	private double salario;

	public int getIdProfissao() {
		return idProfissao;
	}

	public void setIdProfissao(int idProfissao) {
		this.idProfissao = idProfissao;
	}

	public String getNomeProfissao() {
		return nomeProfissao;
	}

	public void setNomeProfissao(String nomeProfissao) {
		this.nomeProfissao = nomeProfissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
