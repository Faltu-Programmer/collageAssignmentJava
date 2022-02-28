/*
    17. Create an interface with at least one method in its own package. 
    Create a class in a separate package.  Add a protected inner class 
    that implements the interface. In a third package, inherit from your 
    class and inside a method, return an object of the protected inner 
    class up-casting to the interface during the return.
 */
package AssignPkg.Assignment_6.Assignment_6_15.concreteClass;

import AssignPkg.Assignment_6.Assignment_6_15.interfacePkg.*;

public class ImplementClass implements InheritedInterface
{
    @Override
    public void method1 ()
    {
        System.out.println("Method1 implements by concrete class (method1 is in Interface1)");
    }
    @Override
    public void method2 ()
    {
        System.out.println("Method2 implements by concrete class (method1 is in Interface2)");
    }
    @Override
    public void method3 ()
    {
        System.out.println("Method3 implements by concrete class (method3 is in InheritedInterface)");
    }
}
