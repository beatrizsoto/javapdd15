
/**
 * Write a description of class Invoker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Invoker
{
    Stack commands;
    Command Command2;
    Command Command1;

    public Invoker() {
        commands = new Stack();
    }

    public void setIncCommand(Command command) {
        Command2 = command;
    }

    public void setDecCommand(Command command) {
        Command1 = command;
    }

    public void undoAll() {
        Command cmd = null;
        while (!commands.empty()) {
            cmd = commands.pop();
            cmd.undo();
        }
    }
}
