import java.io.Serializable;

public class Biosenosis implements Serializable{

	private String nombre;
	private Ecosistema ecosistema;

	public Biosenosis(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ecosistema getEcosistema() {
		return ecosistema;
	}

	public void setEcosistema(Ecosistema ecosistema) {
		this.ecosistema = ecosistema;
	}

	@Override
	public String toString() {
		return "Biosenosis [nombre=" + nombre + "]";
	}


}