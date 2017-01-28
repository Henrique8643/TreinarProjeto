package testandoCodigo;

import java.util.Scanner;



public class LoopFor {
	public static void main(String[] args) {
		
		int[] numero =new int[10] ;
		Scanner dado = new Scanner(System.in);
		//dado.numeronextInt() 
		
		System.out.println("Quantas vezes quer que repita o seu nome ?");
		for (int i = 0; i < args.length; i++) {
			if (i >= 10) {
				
				System.out.println("Obrigado");
			}else{
				System.out.println("Nao eh a quantidade permitida!");
			}
			
		}
		
	}
	

}
