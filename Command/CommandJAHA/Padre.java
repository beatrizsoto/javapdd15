
/**
 Esta es la clase principal de nuestro programa, donde contará con métodos específicos para poder realizar
 acciones sin necesidad de estar implementadas a la hora de correr el programa.
 */
public class Padre
{
    private String Nombre;
    private int Edad;
    
    public String GetNombre()
    {
        return this.Nombre;
    }
    
    public void SetNombre(String nombre)
    {
        this.Nombre = nombre;
    }
    
     public int GetEdad()
    {
        return this.Edad;
    }
    
    public void SetEdad(int edad)
    {
        this.Edad = edad;
    }
}
