
/**
 * Write a description of class ToyotaBuilder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToyotaBuilder extends AutoBuilder
{
    public void BuildMarca()
    {
        auto.setMarca("toyota");
    }
    
    public void buildModelo()
    {
        auto.setModelo("prius");
    }
    public void buildMotor()
    {
        Motor motor = new Motor();
        motor.setNumero(123);
        motro.setPotencia("1.5");
        auto.setMotor(motor);
    }
    
    public void buildPuertas()
    {
        auto.setCantidadDePuertas(2);
    }

}
