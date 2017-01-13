package br.com.treinar.operadores;

public class CalculaHora {
	public static void main(String[] args) {
		
		int minuto = 100;
		int hora;
		int minrestante;
		
		hora = minuto / 60;
		minrestante = minuto % 60;
		
		System.out.println(hora + " Hora" );
		System.out.println(minrestante + " minutos" );
	}

}

