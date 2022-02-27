/*
    10. Show that static block execute before any object creation.
 */
package AssignPkg.Assignment_5;

public class StaticBlockexicutionBeforeObj
{
    public StaticBlockexicutionBeforeObj ()
    {
        infoPrint();
    }
    private void infoPrint ()
    {
        System.out.println("1.Obj is successfully created (StaticBlockexicutionBeforeObj)");
    }
    
    static 
    {
        System.out.println("1.Static block is exicuted successfully (StaticBlockexicutionBeforeObj)");
    }
}
