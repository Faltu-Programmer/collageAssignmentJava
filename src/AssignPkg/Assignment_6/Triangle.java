/*
    14. Create an abstract class Shape with two abstract methods, area() & disp(). Now design three concrete
        classes Rectangle, Circle & Triangle can compute area and display its separately.
 */
package AssignPkg.Assignment_6;

public class Triangle extends Shape
{
    private double m_a = 0;
    private double m_b = 0;
    private double m_c = 0;
    
    public Triangle ()
    {
        
    }
    public Triangle (double t_base, double t_height)
    {
        setA (t_base);
        setB (t_height);
    }
    public Triangle (double t_a, double t_b, double t_c)
    {
        setA (t_a);
        setB (t_b);
        setC (t_c);
    }
    
    public final double getA ()
    {
        return m_a;
    }
    protected final void setA (double t_a)
    {
        if(t_a > 0)
        {
            m_a = t_a;
        }
    }
    
    public final double getB ()
    {
        return m_b;
    }
    protected final void setB (double t_b)
    {
        if(t_b > 0)
        {
            m_b = t_b;
        }
    }
    
    public final double getC ()
    {
        return m_c;
    }
    protected final void setC (double t_c)
    {
        if(t_c > 0)
        {
            m_c = t_c;
        }
    }
    
    public final void setData (double t_a, double t_b, double t_c)
    {
        setA (t_a);
        setB (t_b);
        setC (t_c);
    }
    public final void setData (double t_a, double t_b)
    {
        setA (t_a);
        setB (t_b);
    }
    
    
    
    
    /// area of tringle by (b*h)/2 formula and by heron's formula
    @Override
    public double area()
    {
        if(getC () == 0)
        {
            return (getA () * getB ())/2;
        }
        else
        {
            double s = (getA() + getB() + getC()) / 2;
            double tmpVar = s*(s + getA())*(s + getB())*(s + getC());
            return Math.sqrt(tmpVar);
        }
    }
    
    @Override
    public void disp ()
    {
        System.out.println("Area of Tringle is " + String.format("%.2f", area ()));
    }

   
}
