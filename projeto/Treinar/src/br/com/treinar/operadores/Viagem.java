package br.com.treinar.operadores;

public class Viagem {
	String cidade;
	double valor;
	String origemfinal;
	
	public String recuperarorigem(){
		
		String lugar = cidade + origemfinal;
		return lugar;
		
		
	}
	public void receber(double saldo){
		saldo = valor;
		
	
	}

}
