
/**
 * Write a description of class piterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class piterator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class piterator
     */
    public piterator()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
import java.util.*; 
class IteratorDemo { 
public static void main(String args[]) { 
// create an array list 
ArrayList al = new ArrayList(); 
// add elements to the array list 
al.add("C"); 
al.add("A"); 
al.add("E"); 
al.add("B"); 
al.add("D"); 
al.add("F"); 
// use iterator to display contents of al 
System.out.print("Original contents of al: "); 
Iterator itr = al.iterator(); 
while(itr.hasNext()) {

    Object element = itr.next(); 
    System.out.print(element + " ");

} 
System.out.println(); 
// modify objects being iterated 
ListIterator litr = al.listIterator(); 
while(litr.hasNext()) {

    Object element = litr.next(); 
    litr.set(element + "+");

} 
System.out.print("Modified contents of al: "); 
itr = al.iterator();
while(itr.hasNext()) {

    Object element = itr.next(); 
    System.out.print(element + " ");

} 
System.out.println(); 
// now, display the list backwards 
System.out.print("Modified list backwards: "); 
while(litr.hasPrevious()) {

    Object element = litr.previous(); 
    System.out.print(element + " ");

} 
System.out.println(); 
} 
}