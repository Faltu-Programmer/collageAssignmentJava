/*
    11. Show that static blocks are execute in order of inheritance.
 */
package AssignPkg.Assignment_5;

public class StaticBlockExicutionOnInheritence extends StaticBlockexicutionBeforeObj
{
    public StaticBlockExicutionOnInheritence ()
    {
        infoPrint();
    }
    private void infoPrint ()
    {
        System.out.println("2.Obj is successfully created (from StaticBlockExicutionOnInheritence)");
    }
    
    static 
    {
        System.out.println("2.Static block is exicuted successfully (from StaticBlockExicutionOnInheritence)");
    }
}
