package Treinando;

//import java.util.stream.IntStream;

public class ExerciciosMultiplo {
	public static void main(String[] args) {
		
//		IntStream.range(1, 100)
//		.filter(numero -> (numero % 3 == 0)/*|| ( numero % 5 == 0 )*/)// poderia fazer de 5. 
//		.forEach(numero -> System.out.println(numero));
//		System.out.println(num + " eh multiplo de 3 !");
		for (int i = 1; i < 100; i++) {
			
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
