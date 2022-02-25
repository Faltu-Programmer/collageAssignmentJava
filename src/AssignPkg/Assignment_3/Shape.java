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
    ///atea of tringle by heron's formula
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
