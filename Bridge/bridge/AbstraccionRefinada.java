
/**
 * Write a description of class AbstraccioneRefinida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AbstraccionRefinada implements Abstraccion
{
    private Implementador implementador;
    public AbstraccionRefinada(Implementador implementador)
    {
        this.implementador = implementador;
    }
    public void operacion()
    {
        implementador.operacion();
    }
}
