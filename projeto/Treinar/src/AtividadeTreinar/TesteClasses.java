package AtividadeTreinar;

public class TesteClasses {
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		dog.nome = "Bidu";
		dog.raca = "Poodle";
		dog.numeroPatas = 4;
		
		
		Gato gat = new Gato();
		gat.nome = "Snoop";
		gat.raca = "Angor�";
		gat.numeroPatas= 4;
		
		System.out.println(dog.nome.equals(gat.numeroPatas));
		System.out.println("Ent�o s�o quadrupedes!");
		
		
	}

}
