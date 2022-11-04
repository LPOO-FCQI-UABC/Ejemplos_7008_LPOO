using System;

namespace Ecosistema
{
    public class Ecosistema {
        private string nombre;

        public Ecosistema(string nombre) {
            this.nombre = nombre;
        }

        public string Nombre {
            get { return this.nombre; }
            set { this.nombre = value; }
        }

        override public string ToString() {
            return "Ecosistema{" + "nombre=" + this.nombre + '}';
        }   
    }
}
