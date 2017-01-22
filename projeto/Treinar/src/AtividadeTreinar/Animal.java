package AtividadeTreinar;

public class Animal {
	
	 String especie;
	 String numerosPatas;
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numerosPatas == null) ? 0 : numerosPatas.hashCode());
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
		Animal other = (Animal) obj;
		if (numerosPatas == null) {
			if (other.numerosPatas != null)
				return false;
		} else if (!numerosPatas.equals(other.numerosPatas))
			return false;
		return true;
	}
	 
	 
	 

}
