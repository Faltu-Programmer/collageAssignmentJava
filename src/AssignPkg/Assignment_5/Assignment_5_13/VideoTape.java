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

public class VideoTape extends Media
{
    private int m_playTime;
    
    public VideoTape ()
    {
        super ();
        m_playTime = 0;
    }
    public VideoTape (String t_title, String t_publication, int t_playTime)
    {
        super (t_title, t_publication);
        setPlayTime(t_playTime);
    }
    
    public int getPlayTime ()
    {
        return m_playTime;
    }
    private void setPlayTime (int t_playTime)
    {
        if(t_playTime >= 1)
        {
            m_playTime = t_playTime;
        }
    }
    
    
    public void read (String t_title, String t_publication, int t_playTime)
    {
        super.setTitle (t_title);
        super.setPublication (t_publication);
        setPlayTime(t_playTime);
    }
    
    @Override
    public void show ()
    {
        System.out.println("Title of the Video Tape is \"" + getTitle() + "\"");
        System.out.println("Publication of the Video Tape is \"" + getPublication() + "\"");
        System.out.println("Total time of Video Tape is \"" + String.format("%.2f",(float)(getPlayTime()/60.0)) + " hours\"");
        System.out.println();
    }
}
