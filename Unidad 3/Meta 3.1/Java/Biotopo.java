public class Biotopo {
	private String nombre;
	private Ecosistema ecosistema;

	public Biotopo(String nombre) {
		this.nombre = nombre;
	}

	public void setEcosistema(Ecosistema ecosistema) {
		this.ecosistema = ecosistema;
	}	

	public Ecosistema getEcosistema() {
		return ecosistema;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Biotopo{" + "nombre=" + nombre + '}';
	}

}