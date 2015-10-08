
public abstract class Unidad 
{
	/* en el constructor, además de un nombre para la unidad, se inicializa la referencia
    que implementa la cadena de responsabilidad (_mando): en principio no hay sucesor */

 public Unidad(String nombre) { 
     _mando = null; 
     _nombre = nombre;
 }

 public String toString() { return _nombre; }

 // cambia el mando de una unidad (modifica cadena de responsabilidad)

 public void establecerMando(Unidad mando) { _mando = mando; }

 /* comportamiento por defecto de la cadena: delegar en el mando directo o, si se 
    alcanza el final de la cadena, utilizar una resolución por defecto (sin orden) */

 public String orden() {
     return (_mando != null ? _mando.orden() : "(sin orden)"); 
 }

 private Unidad _mando;
 private String _nombre;
}
