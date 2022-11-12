// See https://aka.ms/new-console-template for more information
using System;


class Taller211
{
    static void Main(string[] args)
    {
        Console.WriteLine("Hello, World!");
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
