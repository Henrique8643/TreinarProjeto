package br.com.HenriqueSoftware;

import java.util.Date;

public class Cliente {

	private String nome;
	private String endereco;
	private Date dataNascimento;//Importado do pacote java util
	private Integer documento;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {// Set atribui valor.
		this.nome = nome;
	}
	public String getEndereco() {// acessa a variavel.
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getDocumento() {
		return documento;
	}
	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento
				+ ", documento=" + documento + "]";
	}
	
	
	
}
