package AtividadeTreinar;

public class TesteClasses {
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		dog.nome = "Bidu";
		dog.raca = "Poodle";
		dog.numeroPatas = 4;
		
		Cachorro dog1 = new Cachorro();
		dog1.nome = "Bidu";
		dog1.raca = "Poodle";
		dog1.numeroPatas = 4;
		
		
		Gato gat = new Gato();
		gat.nome = "Snoop";
		gat.raca = "Angor�";
		gat.numeroPatas= 4;
		
		Gato gat1 = new Gato();
		gat1.nome = "Snoop";
		gat1.raca = "Angor�";
		gat1.numeroPatas= 4;
		
		System.out.println(dog.equals(dog1));
		System.out.println(gat.equals(gat1));
		System.out.println("Ent�o s�o quadrupedes!");
		
		
	}

}
