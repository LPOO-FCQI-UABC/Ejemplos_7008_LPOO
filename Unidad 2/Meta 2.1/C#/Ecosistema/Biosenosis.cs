using System;

public class Biosenosis
{
    private string nombre;

    public Biosenosis(string nombre)
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
        return "Biosenosis{" + "nombre=" + this.nombre + '}';
    }
}

