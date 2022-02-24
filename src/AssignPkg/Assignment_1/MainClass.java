package AssignPkg.Assignment_1;

public class MainClass
{
    
    public static void main(String[] args)
    {
        Assignment_1_functions refObj = new Assignment_1_functions ();
        
        String[] a = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] b = {"9", "8", "7", "6", "5", "4", "3", "2", "1"};
        String[] c = {"-5", "-4", "-7", "4", "2", "9", "-8", "1", "12"};
        
        System.out.println("reverse --> " + refObj.reverse(34567));
        System.out.println("sumOfSeries --> " + refObj.sumOfSeries(2,3));
        System.out.println("factorial --> " + refObj.factorial(5));
        
        refObj.sort(a);
        refObj.sort(b);
        refObj.sort(c);
        System.out.println("mone hoy assignment 1 is complete");
    }
    
}
