package AssignPkg.Assignment_2;

public class Board
{
    private int m_length;
    private int m_width;
    
    public Board () {}
    public Board (int t_valueL, int t_valueW)
    {
        setLength(t_valueL);
        setWidth(t_valueW);
    }
    public final int getLength ()
    {
        return m_length;
    }
    public final void setLength (int t_value)
    {
        m_length = (t_value <= 0) ? 0 : t_value;
    }
    public final int getWidth ()
    {
        return m_width;
    }
    public final void setWidth (int t_value)
    {
        m_width = (t_value <= 0) ? 0 : t_value;
    }
    public int surfaceArea ()
    {
        return getLength()*getWidth();
    }
    public void show ()
    {
        System.out.println("\nThe surface area is "+ surfaceArea());
    }
}
