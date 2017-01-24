package AtividadeTreinar;

public class OrdenandoVetor {

	public static void main(String[] args) {

		int[] vetor = { 1000, 200, 55, 999, 700, 1 };
		int auxiliar = 0;

		System.out.println("Vetor Desordenado !");

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < 5; j++) {

				if (vetor[j] > vetor[j + 1]) {

					auxiliar = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = auxiliar;

				}

			}
		}
		System.out.println("Vetor Ordenado !");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
