
/**
 * Write a description of class ConcreteCommand1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteCommand1 implements Command 
{
	Receiver receiver;

	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;    
	}
  
	public void execute() {
		receiver.concCommand1Method();    
	}
}
