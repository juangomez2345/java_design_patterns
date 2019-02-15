package prototype.simplified;

public class Persona implements Cloneable {
	private String nombre;
	private String nombrePadre;
	private String nombreMadre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombrePadre() {
		return nombrePadre;
	}

	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}

	public String getNombreMadre() {
		return nombreMadre;
	}

	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}

	public String toString() {
		return nombre + " " + nombrePadre + " " + nombreMadre;
	}

	/**
	 * el codigo main no forma parte del patron, solo se utiliza para aplicar el
	 * patron
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Persona juan = new Persona();
		juan.setNombre("juan");
		juan.setNombrePadre("pedro");
		juan.setNombreMadre("rosario");

		System.out.println(juan);

		Persona maria = (Persona) juan.clone();
		maria.setNombre("maria");
		System.out.println(maria);

	}

}
