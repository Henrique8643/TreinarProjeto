package Testando_Codigo;

import AtividadeTreinar.Cliente;

public class ClienteTeste {   // Acessando os dados da classe cliente que se encontra privada.
	public static void main(String[] args) {
		
		Cliente dado = new Cliente();
		dado.setNome("Henrique de Jesus");
		dado.setDocumento(10789654);
		dado.setEndereco("Rua dos Goitacazes");
		
		System.out.println("Meu nome eh :\t" + dado.getNome());
		System.out.println("Numero de identidade :\t" +dado.getDocumento());
		System.out.println("Endereço : \t" + dado.getEndereco());
		
		
	}
	 

}
