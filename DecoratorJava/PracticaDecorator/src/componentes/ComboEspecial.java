package componentes;
/**
 * Indica un tipo de combo Especial, 
 * heredando de la clase padre Combo
 * @author chenao
 *
 */
public class ComboEspecial extends Combo{

	public ComboEspecial()
	{
		descripcion="Doble Porcion de Papas Fritas,3 tipos " +
				"de salsa,doble queso, amburgueza Especial " +
				"Doble Carne, Doble tomate, gaseosa";
	}
	
	@Override
	public int valor() {
		return 10400;
	}
	
	
}
