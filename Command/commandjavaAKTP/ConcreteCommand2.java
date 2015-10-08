
/**
 * Write a description of class ConcreteCommand2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteCommand2 implements Command  {
  	Receiver receiver;  

	Public ConcreteCommand2(Receiver rec) {
		receiver = rec;
	}

	public void execute() {
		receiver.concCommand2Method();
	}
	
	public void undo() {
		
	}
}
