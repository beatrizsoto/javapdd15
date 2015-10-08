
/**
 * Write a description of class EjemploBridge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjemploBridge
{
    public static void main(String[] args)
    {
        Abstraccion[] abstracciones = new Abstraccion[2];
        abstracciones[0] = new AbstraccionRefinada(new ImplementacionA());
        abstracciones[1] = new AbstraccionRefinada(new ImplementacionB());
        for(Abstraccion abstraccion:abstracciones)
            abstraccion.operacion();
    }
}
