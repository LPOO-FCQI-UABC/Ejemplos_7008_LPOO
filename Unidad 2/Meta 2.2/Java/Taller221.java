public class Taller221 {
    public static void main(String[] args) {
        Biosenosis biosenosis = new Biosenosis("Biosenosis");
        Biotopo biotopo = new Biotopo("Biotopo");
        SistemaBiologico sistemaBiologico = new SistemaBiologico("SistemaBiologico");
        Ecosistema ecosistema = new Ecosistema("Ecosistema");
        System.out.println(biosenosis);
        System.out.println(biotopo);
        System.out.println(sistemaBiologico);
        System.out.println(ecosistema);

        
        ecosistema.getBiotopos().add(biotopo);
        ecosistema.getBiosenosis().add(biosenosis);
        biotopo.setEcosistema(ecosistema);
        biosenosis.setEcosistema(ecosistema);

        System.out.println(ecosistema);

    }
    
}
