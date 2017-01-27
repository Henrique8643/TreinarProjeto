package br.com.HenriqueSoftware;

import java.util.List;

public class Agenda {
	private List<Contato> contatos;
	private List<Contato> getcontatos(){
		
		return contatos;
	}
	
	public void setContatos(List<Contato> contatos){
		this.contatos = contatos;
	}

}
