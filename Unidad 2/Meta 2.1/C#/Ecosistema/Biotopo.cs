using System;



public class Biotopo
{
    private string nombre;

    public Biotopo(string nombre)
    {
        this.nombre = nombre;
    }

    public string Nombre
    {
        get { return this.nombre; }
        set { this.nombre = value; }
    }

    override public string ToString()
    {
        return "Biotopo{" + "nombre=" + this.nombre + '}';
    }
}

