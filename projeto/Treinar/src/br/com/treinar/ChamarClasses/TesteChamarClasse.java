package br.com.treinar.ChamarClasses;

import AtividadeTreinar.Pessoa;

public class TesteChamarClasse {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Henrique";
		p.idade = 33;
		p.endereco = "Rua kkkk";
		
		System.out.print(p.nome +"\n"+ p.idade +"\n"+ p.endereco +"\n");
		System.out.println("Funciounou corretamente!");
	}

}
