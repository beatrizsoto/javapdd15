
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String[] args)
    {
        AutoDirector director = new AutoDirector();
        director.setAutoBuilder(new NissanBuilder());
        director.constructAuto();
        Auto auto = director.getAuto();
        
        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
    }

}
