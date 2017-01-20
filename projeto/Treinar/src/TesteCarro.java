import java.util.Scanner;

public class TesteCarro {
	
	public static void main(String[] args) {
	
		CarroEquals veiculo1 = new CarroEquals();
		CarroEquals veiculo2 = new CarroEquals();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Marca do carro :");
		
		veiculo1.setmarca(leitor.nextLine());
		System.out.print("Modelo :" );

		veiculo1.setModelo(leitor.nextLine());
		System.out.print("Placa :");

		veiculo1.setPlaca(leitor.nextLine());
		System.out.print("Marca do carro :");
		
		veiculo2.setmarca(leitor.nextLine());
		System.out.print("Modelo :" );
		
		veiculo2.setModelo(leitor.nextLine());
		System.out.print("Placa :");
		
		veiculo2.setPlaca(leitor.nextLine());
		
		
		if (veiculo1.equals(veiculo2)) {
			
			System.out.println("Eles são iguais");
			
		} else {
			System.out.println("Diferentes");
		}
		
		
	}

}
