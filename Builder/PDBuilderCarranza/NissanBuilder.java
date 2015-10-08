
/**
 * Write a description of class NissanBuilder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NissanBuilder extends AutoBuilder
{
    public void BuildMarca()
    {
        auto.setMarca("Nissan");
    }
    
    public void buildModelo()
    {
        auto.setModelo("sentra");
    }
    public void buildMotor()
    {
        Motor motor = new Motor();
        motor.setNumero(1234);
        motro.setPotencia("2.5");
        auto.setMotor(motor);
    }
    
    public void buildPuertas()
    {
        auto.setCantidadDePuertas(4);
    }
}
