package br.com.HenriqueSoftware;

public enum Operadora {
	
	OI(31,"Oi"),
	CLARO(21,"Claro"),
	VIVO(15, "Vivo"),
	TIM(41, "Tim");
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public abstract Double calcularTarifa(Integer tempo);



	

}
