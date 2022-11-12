using System;


public class SistemaBiologico
{
    private string nombre;

    public SistemaBiologico(string nombre)
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
        return "SistemaBiologico{" + "nombre=" + this.nombre + '}';
    }

}

