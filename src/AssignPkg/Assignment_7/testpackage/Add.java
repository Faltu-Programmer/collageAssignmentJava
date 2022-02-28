/*
    16. Write a Java code to create a package named “testpackage”, create a 
    class named “Add” under this package which contains a method named
    ”display”. Import this package in another Java program
 */
package AssignPkg.Assignment_7.testpackage;

public class Add
{
    public Add ()
    {
        display ();
    }
    public final void display ()
    {
        System.out.println("Inside Add class which is Inside of testpackage");
    }
}
