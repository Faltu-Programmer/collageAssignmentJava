package AssignPkg.TestKio;

/**
 *
 * @author Mama....
 */
public class AngriBirds
{
   private int m_angryBirds;
   
   public AngriBirds ()
   {
       
   }
   public AngriBirds (int t_count)
   {
       setAngryBirds (t_count);
   }
   
   public int getAngryBirds ()
   {
       return m_angryBirds;
   }
   public final void setAngryBirds (int t_num)
   {
       if ( t_num > 0)
       {
           m_angryBirds = t_num;
       }
   }
   
   public void show ()
   {
       System.out.println("Total angry birds present is " + getAngryBirds ());
   }
}
