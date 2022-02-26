package AssignPkg.Assignment_3;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CurrentDateTime
{
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/d HH:mm:ss");
    private LocalDateTime m_currentDateTime;
    
    public CurrentDateTime ()
    {
        m_currentDateTime = LocalDateTime.now();
    }
    public LocalDateTime getCurrentDateTime ()
    {
        return m_currentDateTime;
    }
    public void updateCurrentDateTime ()
    {
        m_currentDateTime = LocalDateTime.now();
    }
    public void showCurrentDateTime()
    {    
        System.out.println(dtf.format(getCurrentDateTime ()));
    }
}
