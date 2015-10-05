
/**
 * Write a description of class AutoDirector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutoDirector
{
    private AutoBuilder autoBuilder;
    
    public void constructAuto()
    {
        autoBuilder.crearAuto();
        autoBuilder.buildMarca();
        autoBuilder.buildModelo();
        autoBuilder.buildMotor();
        autoBuilder.buildPuertas();
    }
    public void setAutoBuilder(AutoBuilder ab)
    {
        autoBuilder = ab;
    }
    
    public Auto getAuto()
    {
        return autoBuilder.getAuto();
    }

}
