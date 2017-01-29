package Treinando;

public class BalancoTrimestral {
	public static void main(String[] args) {
		//Declarando variaveis e somando.
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco =  17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro +  gastosMarco;
		
		//Declarando variaveis de varios tipos e imprimindo.
		double d = 5.5;
		char c = 't';
		boolean b = true;
		int i = (int) d; //Neste caso estou fazendo um casting, poderia ser implementado assim tambem : int i = 10;
		float x = (float) 2.5;// ou poderia float x = 2.5f;
		int g = 10;
		float e = (float) d + x;
		System.out.print("Resultado : \n"+ i + "\n"+ d + "\n"+ c + "\n"+ b +"\n"+ g +"\n"+ e +"\n");
		
		System.out.println("Valor total de gastos :\t" + gastosTrimestre);
	}

}
