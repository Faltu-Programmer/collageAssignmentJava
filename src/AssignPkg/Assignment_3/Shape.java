/*
    8. Create a class named Shape. Make Circle, Triangle and Rectangle as 
    object of the Shape class and calculate their area by concept of method 
    overloading(take input using scanner class).
*/

package AssignPkg.Assignment_3;

public class Shape
{
    /// area of circle 
    public double area(double t_redius)
    {
        return (t_redius*t_redius*3.1415);
    }
    
    /// area of tringle by (b*h)/2 formula
    public double area(double t_base, double t_height)
    {
        return (t_base*t_height)/2;
    }
    ///area of tringle by heron's formula
    public double area(double t_a, double t_b, double t_c)
    {
        double s = (t_a + t_b + t_c) / 2;
        double tmpVar = s*(s+t_a)*(s+t_b)*(s+t_c);
        return Math.sqrt(tmpVar);
    }
    
    /// area of a rentangle 
    public float area(float t_length, float t_bredth)
    {
        return (float)(t_length*t_bredth);
    }
}
