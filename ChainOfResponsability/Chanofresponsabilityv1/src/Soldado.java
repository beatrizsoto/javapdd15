
public class Soldado extends Unidad 
{
	// el constructor s�lo tiene que inicializar la parte correspondiente a la superclase

    public Soldado(String nombre) {
        super(nombre);
    }
    
    public String toString() { return ("Soldado " + super.toString()); }
}
