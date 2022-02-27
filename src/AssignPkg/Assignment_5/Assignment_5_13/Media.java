/*
    13. Consider an example of book shop which sells books and video tapes. 
    These two classes inherited from the super class called media. The media 
    class has data member such as title and publications.The book class has 
    data members for storing number of pages in a book and the tape class 
    has the playing time in tape. Each class will have member function such 
    as read() and show().Write a programs which models the class hierarchy 
    for book shop.
 */
package AssignPkg.Assignment_5.Assignment_5_13;

public class Media
{
    private String m_title = "";
    private String m_publication = "";
    
    public Media (){}
    public Media (String t_title, String t_publication)
    {
        setTitle (t_title);
        setPublication (t_publication);
    }
    
    
    public final String getTitle ()
    {
        return m_title;
    }
    protected final void setTitle (String t_title)
    {
        if (m_title.equals("") && !t_title.equals(""))
        {
            m_title = t_title;
        }
    }
    
    public final String getPublication ()
    {
        return m_publication;
    }
    protected final void setPublication (String t_publication)
    {
        if (m_publication.equals("") && !t_publication.equals(""))
        {
            m_publication = t_publication;
        }
    }
    
    public void read (String t_title, String t_publication)
    {
        setTitle (t_title);
        setPublication (t_publication);
    }
    public void show ()
    {
        System.out.println("Title is " + getTitle());
        System.out.println("Publication is " + getPublication());
    }
}
