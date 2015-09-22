package decoradores;
import componentes.Combo;

/**
 * (Decorator Concreto)
 * clase papas, siendo esta un adicional, cuenta 
 * con una descripcion y un precio
 * @author chenao
 *
 */
public class Papas extends AdicionalesDecorator{

	Combo combo;
	
	public Papas(Combo combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Papas";
	}

	@Override
	public int valor() {
		return 1500+combo.valor();
	}

}