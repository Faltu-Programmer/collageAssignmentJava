/*
    12. Create a class with an inner class that has no default constructor
    (one that take arguments). Create a second class with an inner class 
    that inherits from the first inner class
 */
package AssignPkg.Assignment_5.Assignment_5_12;

/**
 *
 * @author suman
 */
public class DemoClass 
{
    public class InnerClassInsideDemo extends InnerClass 
    {
        private int m_b;
        
        public InnerClassInsideDemo (int t_a, int t_b)
        {
            super(t_a);
            setB(t_b);
            System.out.println("Inside of InnerClassInsideDemo Constructor");
        }
        
        public final int getB ()
        {
            return m_b;
        }
        public final void setB (int t_b)
        {
            m_b = t_b;
        }
        
        @Override
        public void show ()
        {
            System.out.println("A = " + getA());
            System.out.println("B = " + getB());
        }
    }
    
/// ----------------------------------------------------------------------------
    
    private int m_c;
    private final InnerClassInsideDemo m_obj;
    
    public DemoClass (int t_a, int t_b, int t_c)  
    {
        m_obj = new InnerClassInsideDemo(t_a, t_b);
        setC(t_c);
        System.out.println("Inside of DemoClass Constructor");
    }
    
    public int getC ()
    {
        return m_c;
    }
    public final void setC (int t_c)
    {
        m_c = t_c;
    }
    
//    public final void setObj (int t_a, int t_b)
//    {
//        m_obj.setA(t_a);
//        m_obj.setB(t_b);
//    }
    public InnerClassInsideDemo getObj ()
    {
       return m_obj;
    }
    
    public void show ()
    {
        InnerClassInsideDemo tmpObj = getObj();
        System.out.println("A = " + tmpObj.getA());
        System.out.println("B = " + tmpObj.getB());
        System.out.println("C = " + getC ());
    }
    
    
    
    
    
    
}
