/*
    12. Create a class with an inner class that has no default constructor
    (one that take arguments). Create a second class with an inner class 
    that inherits from the first inner class
 */
package AssignPkg.Assignment_5.Assignment_5_12;

public class InnerClass
{
    private int m_a;
    
//    public InnerClass ()
//    {
//        System.out.println("Inside of InnerClass Constructor");
//    }
    public InnerClass (int t_a)
    {
        setA(t_a);
        System.out.println("Inside of InnerClass Constructor");
    }
    
    public int getA ()
    {
        return m_a;
    }
    protected final void setA (int t_a)
    {
        m_a = t_a;
    }
    
    public void show ()
    {
        System.out.println("A = " + getA());
    }
}
