public class SistemaBiologico {
    private String nombre;

    public SistemaBiologico(String nombre) {
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
        return "SistemaBiologico{" + "nombre=" + nombre + '}';
    }
}