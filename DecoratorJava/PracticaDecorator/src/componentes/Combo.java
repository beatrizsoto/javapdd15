package componentes;

/**
 * Clase combo, esta clase indica la clase 
 * padre del tipo de combo disponible, cuenta con una 
 * descripcion y un precio
 * @author chenao
 *
 */
public abstract class Combo {
	
	String descripcion = "";
	
	public String getDescripcion() 
	{
		return descripcion;
	}

	public abstract int valor();

}
