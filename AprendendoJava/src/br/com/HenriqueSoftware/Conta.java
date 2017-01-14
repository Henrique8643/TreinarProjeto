package br.com.HenriqueSoftware;

public class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;
	
	//Metodo sem retorno.
	void sacar(double quantidade){
		//Uma nova variavel que recebe a subtracao de saldo e a variavel quantidade.
		double novoSaldo = saldo - quantidade;
		saldo = novoSaldo;
		
		System.out.println("Saldo Atual : " + novoSaldo);
	}
	void depositar(double quantidade){
		
		
		saldo += quantidade;
		
		System.out.println("Deposito Atual :" + quantidade);
	}
	
	//Metodo com retorno.
	boolean sacardinheiro(double valor) {
		
		if (saldo < valor ) {
			return false;
			}
		else {
			saldo = saldo - valor;
			return true;
		}
	}
	
	
}
