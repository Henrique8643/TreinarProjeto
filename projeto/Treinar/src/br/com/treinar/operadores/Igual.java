package br.com.treinar.operadores;

public class Igual {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c = 12;
		
		System.out.println(a == b);
		System.out.println(a == c);
		
		Caneta bic = new Caneta();
		bic.cor = "Vermelho";
		bic.preco = 1.5;
		
		Caneta pena = new Caneta();
		pena.cor = "Preto";
		pena.preco = 8.0;
		
		System.out.println(bic == pena);
		
		Caneta copia = pena;
		
		System.out.println(copia == pena);
		System.out.println(copia.cor);
		
		copia = new Caneta();
		System.out.println(copia == pena);
		
		
		
	}

}
