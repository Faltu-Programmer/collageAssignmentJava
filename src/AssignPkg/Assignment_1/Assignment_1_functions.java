package AssignPkg.Assignment_1;

public class Assignment_1_functions
{
    
    /*
        1. Write a JAVA Program of Sum of Series for a given x and n 
            (1+x+x2+x3+x4+……up to nth terms)
    */
    public final int sumOfSeries (int t_x, int t_n)
    {
        if(t_x <= 0 || t_n <= 0)
        {
            return 1;
        }
        int ans = 1;
        for(int itr = 1; itr <= t_n; ++itr)
        {
            ans += (int) (Math.pow(t_x,itr));
        }  
        return ans;
    }
    
    
    /*
        2. Write a program in Java to find the reverse of a given integer 
        number(take input using command-line argument)
    */
    public final int reverse (int t_num)
    {
        if(t_num <= 0)
        {
            return 0;
        }
        int rev = 0;
        while(t_num >= 1)
        {    
            int temp = t_num%10;
            t_num /= 10;
            rev = rev*10+temp;
        }
        return rev;
    }
    
    /*
        3. Write a program in Java to find the factorial of a given integer 
        number using Recursion (take input using command-line argument).
    */
    public final int factorial (int t_number)
    {
        if(t_number == 0)
            return 1;
        else
            return factorial (t_number-1) * t_number;
    }
    
    /*
        4. Write a JAVA program to sort n numbers
        (take input using command-line argument)
    */
    public final String[] sort (String [] t_arg)
    {
        int tmpLen = t_arg.length;
        
        int[] tmpArg = new int[tmpLen];
        
        int itr;
        /// converting all string value to int value . tmpArg[] <-- t_arg[]
        for(itr = 0; itr < tmpLen; ++itr)
        {
            tmpArg[itr] = Integer.parseInt(t_arg[itr]);
        }
        
        /// sorting the integer array namely tmpArg[]
        for(int i = 0; i < tmpLen-1; ++i)
        {
            for(int j = i+1; j < tmpLen; ++j)
            {
                if(tmpArg[i] > tmpArg[j])
                {
                    int tmpVar = tmpArg[i];
                    tmpArg[i] = tmpArg[j];
                    tmpArg[j] = tmpVar;
                }
            }
        }
        
        /// converting all int value to string value .   t_arg[] <-- tmpArg[]
        for(itr = 0; itr < tmpLen; ++itr)
        {
            t_arg[itr] = String.valueOf(tmpArg[itr]);
        }
        
        
       /// showing the sorted array tmpArg[]
       System.out.print("the sort is assending order->  ");
       for(itr = 0; itr < tmpLen; ++itr)
        {
            System.out.print(tmpArg[itr] + " ");
        }
        System.out.println();
        return t_arg;
    }
    
    
}
