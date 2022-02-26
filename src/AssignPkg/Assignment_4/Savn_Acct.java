/*
    The savings account provides compound interest and withdrawal facilities 
    but no cheque book facility.
*/
package AssignPkg.Assignment_4;

public class Savn_Acct extends Account
{
    private static int m_totalAccounts = 1001;
    
    public Savn_Acct ()
    {
        setTypeOfAccount(1);
        setAccountNumber(getTotalAccount());
        m_totalAccounts+=2;
    }
    
    public final int getTotalAccount ()
    {
        return m_totalAccounts;
    }
    
    
    
    @Override
    public void showDetails ()
    {
        System.out.print("\nAccount Details ---> \n");
        System.out.println("Name of the Account Holder is Mr./Mrs. " + getAccountHolderName ());
        System.out.println("The Account Number is " + getAccountNumber ());
        System.out.println("The Account Type is *" + getTypeOfAccount ());
        System.out.println("The Account Balance is \u20B9" + getAccountBalance ());
        System.out.print("The Benefits:: Your savings account provides you compound interest and withdrawal facilities\n");
        System.out.println("The Drawbacks:: Your savings account does not provides cheque book facility");
    }
}
