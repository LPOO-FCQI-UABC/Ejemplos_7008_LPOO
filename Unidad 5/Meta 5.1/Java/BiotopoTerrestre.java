
public class BiotopoTerrestre extends Biotopo{

    public BiotopoTerrestre(String name) {
        super(name);
    }

    public String getName() {
        return super.getNombre();
    }

    public void setName(String name) {
        super.setNombre(name);;
    }

    @Override
    public String toString() {
        return "BiotopoTerrestre [name=" + super.getNombre() + "]";
    }

    
}