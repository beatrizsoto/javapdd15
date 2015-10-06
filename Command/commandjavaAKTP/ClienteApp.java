
/**
 * Write a description of class ClienteApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClienteApp
{
       public static void main(String[] args) {
		Receiver rec = new Receiver();
		Command Command2 = new ConcreteCommand2(rec);
		Command Command1 = new ConcreteCommand1(rec);
		Invoker invoker = new Invoker();
		invoker.setConcCommand1(Command1);
		invoker.setConcCommand2(Command2);
		invoker.addRequest();
		invoker.addRequest();
		invoker.removeRequest();
		System.out.println(rec.getValue());
	}
}
