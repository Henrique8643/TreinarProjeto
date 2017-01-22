package AtividadeTreinar;

public class Cachorro {
	
	String nome;
	String raca;
	int numeroPatas;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroPatas;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cachorro other = (Cachorro) obj;
		if (numeroPatas != other.numeroPatas)
			return false;
		return true;
	}
	
	
	
	
	

}
