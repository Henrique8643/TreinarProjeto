package br.com.treinar.operadores;

public class TesteViagem {
	public static void main(String[] args) {
		
		Viagem praia = new Viagem();
		
		praia.cidade = "Belo Horizonte";
		praia.origemfinal ="Ribeirao das Neves";
		
		System.out.println("Cidade :" + praia.cidade + "\tMunicipio " + praia.origemfinal );
		
	}

}
