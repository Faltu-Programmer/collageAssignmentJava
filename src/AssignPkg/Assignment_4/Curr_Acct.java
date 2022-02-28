/*
    The current account provides cheque book facility but no 
    interest. Current account holders should also maintain a minimum balance 
    (say Rs. 1000) and if the balance falls below this level a service charge 
    is imposed (say Rs. 100).
*/
package AssignPkg.Assignment_4;

public class Curr_Acct extends Account
{
    private static int m_totalAccounts = 1002;
    
    
    public Curr_Acct ()
    {
        setTypeOfAccount(2);
        setAccountNumber(getTotalAccount());
        m_totalAccounts+=2;
    }
    
    public final int getTotalAccount ()
    {
        return m_totalAccounts;
    }
    
    @Override
    public void withdraw (int t_withdrawlAmmount)
    {
        int tmpBalance = getAccountBalance ();
        
        if(tmpBalance >= t_withdrawlAmmount+100)
        {
            if(tmpBalance <= 1000)
            {
                setAccountBalance ((tmpBalance-t_withdrawlAmmount-100));
                System.out.println("Due to insufficient Minimum Balance");
                System.out.println("Service charge \u20B9100 is deducted from your account");
            }
            else
                setAccountBalance ((tmpBalance-t_withdrawlAmmount));
            System.out.println("Successfully Withdrawl \u20B9" + t_withdrawlAmmount);
        }
        else
           insufficientBalance ();
    }
    
    @Override
    public void showDetails ()
    {
        System.out.println();
        System.out.println("Name of the Account Holder is Mr./Mrs. " + getAccountHolderName ());
        System.out.println("The Account Number is " + getAccountNumber ());
        System.out.println("The Account Type is *" + getTypeOfAccount ());
        System.out.println("The Account Balance is " + getAccountBalance ());
        System.out.print("The Benefits:: Your savings account provides you cheque book facility\n");
        System.out.println("The Drawbacks:: Your savings account does not provides you compound interest");
    }
}
