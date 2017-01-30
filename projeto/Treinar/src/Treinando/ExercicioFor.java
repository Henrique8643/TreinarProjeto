package Treinando;

import java.util.stream.IntStream;

public class ExercicioFor {
	public static void main(String[] args) {
		int numero = 0;
		int soma = 0 ;
		
		for (int i = 1; i < 1500; i++) {
			
			numero ++; 
			soma = soma + numero;
			
			System.out.println("Numero atual da contagem : " + numero + " Soma :" + soma);
			
			
		}
	}

}
