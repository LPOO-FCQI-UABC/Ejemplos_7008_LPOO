public class Ecosistema {
    private String nombre;

    public Ecosistema(String nombre) {
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
        return "Ecosistema{" + "nombre=" + nombre + '}';
    }   
}