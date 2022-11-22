import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Taller51 {
    public static void main(String[] args) throws ClassNotFoundException {
        Ecosistema ecosistema = new Ecosistema("Ecosistema");
        BiotopoTerrestre bt = new BiotopoTerrestre("Biotopo Terrestre");
        BiotopoAcuatico ba = new BiotopoAcuatico("Biotopo Acuatico");


        ecosistema.getBiotopos().add(bt);
        ecosistema.getBiotopos().add(ba);
        bt.setEcosistema(ecosistema);
        ba.setEcosistema(ecosistema);

   
            FileOutputStream fileOutputStream;
            ObjectOutputStream objectOutputStream;
            try {
                fileOutputStream = new FileOutputStream("ecosistema.data");
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(ecosistema);
                objectOutputStream.close();
                System.out.println(ecosistema);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


            FileInputStream fileInputStream;
            ObjectInputStream objectImputStream;
            try {
                fileInputStream = new FileInputStream("ecosistema.data");
                objectImputStream = new ObjectInputStream(fileInputStream);
                ecosistema = (Ecosistema) objectImputStream.readObject();
                objectImputStream.close();
                System.out.println(ecosistema);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        




    }
}
