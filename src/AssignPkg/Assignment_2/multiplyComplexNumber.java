/*
    6.Write a java program to find out the multiplication of two complex number
    (take input using Scanner class).

*/
package AssignPkg.Assignment_2;

public class multiplyComplexNumber
{
    private int m_real;
    private int m_img;
    
    public multiplyComplexNumber () 
    { 
        setReal(0);
        setImg(0);
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
    private void setReal (int t_real)
    {
        m_real = t_real;
    }
    
    public final int getImg ()
    {
        return m_img;
    }
    private void setImg (int t_img)
    {
        m_img = t_img;
    }
    public void multiply (int t_real, int t_img)
    {
        calculationOfMultiplication (t_real, t_img);
    }
    public void multiply ( multiplyComplexNumber t_refObj )
    {
        calculationOfMultiplication (t_refObj.m_real, t_refObj.m_img);
    }
    
    private void calculationOfMultiplication (int t_real, int t_img)
    {
        int a = getReal ();
        int bi = getImg ();
        int c = t_real;
        int di = t_img;
        
        int tmpRoot1, tmpRoot2;
        
        /// ==> (a+bi) * (c + di) 
        /// ==> ac+adi+bci-bd;
        /// ==> (ac-bd)+(adi+bci)
        
        int ac = a*c;
        int adi = a*di;
        int bci = bi*c;
        int bdi2 = -(bi*di);
        
        tmpRoot1 = ac + bdi2;
        tmpRoot2 = (adi+bci);
        
        show (tmpRoot1, tmpRoot2);
        setReal (tmpRoot1);
        setImg (tmpRoot2);
    }
    
    public final void show ()
    {
        int t_real = getReal ();
        int t_img = getImg ();
        System.out.println("Result is " + t_real + "" + (t_img > 0 ? ("+" + t_img + "i") : (t_img + "i")));
    }
    
    public void show (int t_real, int t_img)
    {
        System.out.println("Result is " + t_real + "" + (t_img > 0 ? ("+" + t_img + "i") : (t_img + "i")));
    }
    
}
