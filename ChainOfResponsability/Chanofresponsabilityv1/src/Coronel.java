
public class Coronel extends Unidad
{
	 // inicializa la parte de unidad e inicializa el estado propio del Coronel (_orden)

    public Coronel(String nombre, String orden) {
      super(nombre);
      _orden = orden;
    }

    /* refinamiento del servicio que utiliza la cadena de responsabilidad, resolviendo
       localmente si tiene órdenes específicas o comportándose convencionalmente en
       caso contrario */

    public String orden()    { return (_orden != null ? _orden : super.orden()); }

    public String toString() { return ("Coronel " + super.toString()); }

    private String _orden;
}
