/*
    14. Create an abstract class Shape with two abstract methods, area() & disp(). Now design three concrete
        classes Rectangle, Circle & Triangle can compute area and display its separately.
 */
package AssignPkg.Assignment_6;

public class Circle extends Shape
{
    private double m_redius = 0;
    
    public Circle ()
    {
        
    }
    public Circle (double t_redius)
    {
        setRedius (t_redius);
    }
    
    public double getRedius ()
    {
        return m_redius;
    }
    public final void setRedius (double t_redius)
    {
        if (t_redius > 0)
        {
            m_redius = t_redius;
        }
    }
    
    
    @Override
    public  double area ()
    {
        return (Math.pow(m_redius, 2) * 3.1415);
    }
    
    @Override
    public void disp ()
    {
        System.out.println("Area of Circle is " + String.format("%.2f",area ()));
    }
}
