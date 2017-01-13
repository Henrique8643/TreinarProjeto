package br.com.treinar.operadores;

import java.util.Scanner;

public class AtividadeFor {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual o seu nome ? ");
		
		String nome = leitor.nextLine();
		
		System.out.print("Quantidade de vezes : ");
	
			int quantidade = leitor.nextInt();
			
			for(int i = 1; i <= quantidade; i++){
				System.out.println(i + nome);
			}
			leitor.close();
		
		
	}
}
