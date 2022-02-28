/*
    17. Create an interface with at least one method in its own package. 
    Create a class in a separate package. Add a protected inner class that 
    implements the interface. In a third package, inherit from your class 
    and inside a method, return an object of the protected inner class 
    up-casting to the interface during the return.
 */
package AssignPkg.Assignment_7.pkg2;
import AssignPkg.Assignment_7.pkg1.Interface1;

public class Class1
{
    protected class ClassX implements Interface1
    {
        @Override
        public void show ()
        {
            System.out.println("this is show method which is implemented by a class");
            System.out.println("which is a inner class of class1");
        }
    }
    
    public Class1 ()
    {
        System.out.println("Inside the Class1 constructor");
    }
    public ClassX getObj ()
    {
        ClassX abc = new ClassX();
        return abc;
    }
}
