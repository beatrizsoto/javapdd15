package decoradores;
import componentes.Combo;


/**
 * (Decorator)
 * Clase abstracta de los productos adicionales,
 * cuenta con una descripcion del producto
 * @author chenao
 *
 */
public abstract class AdicionalesDecorator extends Combo{

	public abstract String getDescripcion();
}
