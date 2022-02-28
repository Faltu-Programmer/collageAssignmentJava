/*
    17. Create an interface with at least one method in its own package. 
    Create a class in a separate package. Add a protected inner class that 
    implements the interface. In a third package, inherit from your class 
    and inside a method, return an object of the protected inner class 
    up-casting to the interface during the return.
 */
package AssignPkg.Assignment_7.pkg3;
import AssignPkg.Assignment_7.pkg2.Class1;

public class Class2 extends Class1
{
    public Class2 ()
    {
        System.out.println("Inside the Class2 constructor");
    }
    public Class1.ClassX method ()
    {
        Class1 abc = new Class1();
        
        return (abc.getObj());
    }
}
