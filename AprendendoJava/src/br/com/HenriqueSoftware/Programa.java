package br.com.HenriqueSoftware;

public class Programa {
	
	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		
		minhaConta.dono = "Henrique";
		minhaConta.saldo = 1000.0;
		
		//sacar 200 reais.
		minhaConta.sacar(200);
		//depositar 500 reais.
		minhaConta.depositar(500);
		
		System.out.println(minhaConta.saldo);
		
		boolean conseguir = minhaConta.sacardinheiro(400);
		if (conseguir) {
			
			System.out.println("Conseguir sacar agora posso comprar um presente ");
			
		}else {
			System.out.println("Nao conseguir sacar ichi");
		}
		
		
		
		//System.out.println("Saldo Atual : " + minhaConta.saldo);
		
		
		
	}

}
