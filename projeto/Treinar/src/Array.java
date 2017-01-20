
public class Array {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numero = new int [3];
		
		numero [0] = 10;
		numero [1] = 30;
		numero [2] = 6;
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
			
		}
		
		for (int valor : numero) {//forech
			
			System.out.println("Posiçao do vetor : " + valor);
		}
		
	
		
		
	}
	

}
