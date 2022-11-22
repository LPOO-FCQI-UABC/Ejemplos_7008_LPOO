import java.io.Serializable;
import java.util.*;

public class Ecosistema extends SistemaBiologico implements Serializable{

	private String nombre;
	private Vector<Biosenosis> biosenosis;
	private Vector<Biotopo> biotopos;

	public Ecosistema(String nombre) {
		this.nombre = nombre;
		biosenosis = new Vector<Biosenosis>();
		biotopos = new Vector<Biotopo>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<Biosenosis> getBiosenosis() {
		return biosenosis;
	}

	public void setBiosenosis(Vector<Biosenosis> biosenosis) {
		this.biosenosis = biosenosis;
	}

	public Vector<Biotopo> getBiotopos() {
		return biotopos;
	}

	public void setBiotopos(Vector<Biotopo> biotopos) {
		this.biotopos = biotopos;
	}

	@Override
	public String toString() {
		return "Ecosistema [nombre=" + nombre + ", biosenosis=" + biosenosis
				+ ", biotopos=" + biotopos + "]";
	}

}