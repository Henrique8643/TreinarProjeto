package br.com.HenriqueSoftware;

import java.util.Date;

public class Pessoa {

	private String nome;
	private String sexo;
	private Date dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return sexo;
	}

	public void setEndereco(String endereco) {
		this.sexo = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
