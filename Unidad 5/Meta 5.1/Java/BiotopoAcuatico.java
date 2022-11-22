public class BiotopoAcuatico extends Biotopo {


    public BiotopoAcuatico(String name) {
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
        return "BiotopoAcuatico [name=" + super.getNombre() + "]";
    }

    
}