package clss;

import java.util.Objects;

public class Prueba {
	protected int prueba;

	public int getPrueba() {
		return prueba;
	}

	public void setPrueba(int prueba) {
		this.prueba = prueba;
	}

	@Override
	public String toString() {
		return "Prueba [prueba=" + prueba + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(prueba);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prueba other = (Prueba) obj;
		return prueba == other.prueba;
	}
	
	///HOLAAAAAA PRUEBA____________----____---___-
	
	
	
	

}