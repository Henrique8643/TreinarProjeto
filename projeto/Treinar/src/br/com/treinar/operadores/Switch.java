package br.com.treinar.operadores;

public class Switch {
	public static void main(String[] args) {
		 int opcao = 5;
		 
		 switch (opcao) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Quatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		

		default:
			System.out.println("Numero não encontrado !");
			break;
		}
		 
	}

}
