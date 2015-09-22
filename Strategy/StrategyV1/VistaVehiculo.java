
/**
 * Write a description of class VistaVehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VistaVehiculo
{
    protected String descripcion;
    
    public VistaVehiculo(String descripcion)
    {
        this.descripcion = descripcion;
    }
    
    public void dibuja()
    {
        System.out.print(descripcion);
    }
}
