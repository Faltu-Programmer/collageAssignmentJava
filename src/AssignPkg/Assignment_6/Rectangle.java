/*
    14. Create an abstract class Shape with two abstract methods, area() & disp(). Now design three concrete
        classes Rectangle, Circle & Triangle can compute area and display its separately.
 */
package AssignPkg.Assignment_6;

public class Rectangle extends Shape
{
    private double m_length = 0;
    private double m_bredth = 0;
    
    
    public Rectangle ()
    {
        
    }
    public Rectangle (double t_length, double t_bredth)
    {
        setLength (t_length);
        setBredth (t_bredth);
    }
    
    public final double getLength ()
    {
        return m_length;
    }
    protected final void setLength (double t_length)
    {
        if(t_length > 0)
        {
            m_length = t_length;
        }
    }
    
    public final double getBredth ()
    {
        return m_bredth;
    }
    protected final void setBredth (double t_bredth)
    {
        if(t_bredth > 0)
        {
            m_bredth = t_bredth;
        }
    }
    
    public final void setData (double t_a, double t_b)
    {
        setLength (t_a);
        setBredth (t_b);
    }
    
    @Override
    public  double area ()
    {
        return (getLength () * getBredth ());
    }
    
    @Override
    public void disp ()
    {
        System.out.println("Area of Rectangle is " + String.format("%.2f",area ()));
    }
}
