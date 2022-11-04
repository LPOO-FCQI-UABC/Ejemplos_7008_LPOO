import java.util.*;

public class Ecosistema extends SistemaBiologico {

	private Vector<Biosenosis> biosenosis;
	private Vector<Biotopo> biotopos;

	public Ecosistema(String nombre) {
		super(nombre);
		biosenosis = new Vector<Biosenosis>();
		biotopos = new Vector<Biotopo>();
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
		return "Ecosistema{" + "nombre=" + getNombre() + ", biosenosis=" + biosenosis + ", biotopos=" + biotopos + '}';
	}

}