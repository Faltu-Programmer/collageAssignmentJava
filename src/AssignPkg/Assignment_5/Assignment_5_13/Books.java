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

public class Books extends Media
{
    private int m_numberOfPages;
    
    public Books ()
    {
        super ();
        m_numberOfPages = 0;
    }
    public Books (String t_title, String t_publication, int t_noOfPage)
    {
        super (t_title, t_publication);
        setNoOfPage(t_noOfPage);
    }
    
    public int getNoOfPage ()
    {
        return m_numberOfPages;
    }
    private void setNoOfPage (int t_noOfPage)
    {
        if(t_noOfPage >= 1)
        {
            m_numberOfPages = t_noOfPage;
        }
    }
    
    
    public void read (String t_title, String t_publication, int t_noOfPage)
    {
        super.setTitle (t_title);
        super.setPublication (t_publication);
        setNoOfPage(t_noOfPage);
    }
    
    @Override
    public void show ()
    {
        System.out.println("Title of the Book is \"" + getTitle() + "\"");
        System.out.println("Publication of the Book is \"" + getPublication() + "\"");
        System.out.println("No of pages the Book have is \"" + getNoOfPage() + "\"");
        System.out.println();
    }
}
