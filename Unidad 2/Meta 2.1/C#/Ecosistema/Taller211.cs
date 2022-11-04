using System;

namespace Ecosistema
{
    internal class Taller211
    {
        public static void Main(string[] args)
        {
            Biosenosis biosenosis = new Biosenosis("Biosenosis");
            Console.WriteLine(biosenosis);
            SistemaBiologico sistemaBiologico = new SistemaBiologico("SistemaBiologico");
            Console.WriteLine(sistemaBiologico);
            Ecosistema ecosistema = new Ecosistema("Ecosistema");
            Console.WriteLine(ecosistema);
            Biotopo biotopo = new Biotopo("Biotopo");
            Console.WriteLine(biotopo);
        }
    }
}