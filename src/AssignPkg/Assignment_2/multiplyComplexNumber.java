package AssignPkg.Assignment_2;

public class multiplyComplexNumber
{
    private int m_real;
    private int m_img;
    
    public multiplyComplexNumber () 
    { 
        
    }
    public multiplyComplexNumber (int t_real, int t_img) 
    { 
        setReal(t_real);
        setImg(t_img);
    }
    public multiplyComplexNumber (multiplyComplexNumber refObj) 
    { 
        setReal(refObj.m_real);
        setImg(refObj.m_img);
    }
    
    public final int getReal ()
    {
        return m_real;
    }
    public final void setReal (int t_real)
    {
        m_real = t_real;
    }
    
    public final int getImg ()
    {
        return m_img;
    }
    public final void setImg (int t_img)
    {
        m_img = t_img;
    }
}
