public class Taller311 {
    public static void main(String[] args) {
        Ecosistema ecosistema = new Ecosistema("Ecosistema");
        Biotopo biotopo = new Biotopo("Biotopo");
        biotopo.setEcosistema(ecosistema);
        ecosistema.getBiotopos().add(biotopo);
        System.out.println(ecosistema);

        Biosenosis biosenosis = new Biosenosis("Biosenosis");
        biosenosis.setEcosistema(ecosistema);
        ecosistema.getBiosenosis().add(biosenosis);
        System.out.println(ecosistema);
    }
}
