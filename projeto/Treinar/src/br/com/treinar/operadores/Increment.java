package br.com.treinar.operadores;

public class Increment {
	public static void main(String[] args) {
		
		int contador = 10;
		System.out.println(contador);
		contador = contador + 1;
		System.out.println(contador);
		contador ++;
		System.out.println(contador);
		
		int maium = contador++;
		System.out.println(maium);
		System.out.println(contador++);
		System.out.println(++contador);// pós encremento.//
		
		
		for(int i = 0;i < 10;i ++){
		System.out.println(i);
		
		
		}
	
	}
}
