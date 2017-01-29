package Treinando;

public class ExercicioFor {
	public static void main(String[] args) {
		int numero = 0;
		int soma = 0 ;
//		Somando de 1 até 1500.
		for (int i = 1; i < 1500; i++) {
			
			numero ++; 
			soma = soma + numero;
			
			System.out.println("Numero atual da contagem : " + numero + " Soma :" + soma);
			
			
		}
	}

}
