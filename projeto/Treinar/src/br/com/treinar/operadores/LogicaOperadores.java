package br.com.treinar.operadores;

public class LogicaOperadores {
	public static void main(String[] args) {
		
		boolean maiorIdade = true;
		boolean possuiIngresso = false;
		
		boolean podeEntrar = maiorIdade && possuiIngresso;
		
		System.out.println(!podeEntrar);
	
	}
}
