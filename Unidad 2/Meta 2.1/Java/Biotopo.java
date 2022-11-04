public class Biotopo {
    private String nombre;

    public Biotopo(String nombre) {
        this.nombre = nombre;
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