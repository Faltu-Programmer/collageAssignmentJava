/*
    9. Assume that a bank maintains two kinds of account for its customers, 
    one called "savings account" and other called "current account".The savings 
    account provides compound interest and withdrawal facilities but no cheque 
    book facility. The current account provides cheque book facility but no 
    interest. Current account holders should also maintain a minimum balance 
    (say Rs. 1000) and if the balance falls below this level a service charge 
    is imposed (say Rs. 100).

    Create a class Account that stores customer name, account number and type 
    of account. From this class derive two classes Curr_Acct and Savn_Acct 
    respectively to make them more specific to their requirements. Include t
    he necessary methods to achieve the following tasks:
    Accept deposit from a customer and update the balance.
        Display the balance.
        Compute and deposit interest.
        Permit withdrawal and update the balance.
        Check for min. balance, impose penalty, 
        if necessary, and update the balance.

    Do not use any constructors. Use methods to initialize the class members.
*/
package AssignPkg.Assignment_4;

public class Account
{
    private String m_accountHolderName;
    private int m_accountNumber;
    private int m_accountBalance;
    private String m_typeOfAccount;

    public Account ()
    {
        m_accountHolderName = "";
        m_accountNumber = -1;
        m_accountBalance = 0;
        m_typeOfAccount = "";
    }
    
    public final String getAccountHolderName ()
    {
        return m_accountHolderName;
    }
    public final void setAccountHolderName (String t_acHolName)
    {
        if( m_accountHolderName.equals("") && !t_acHolName.equals(""))
        {
            m_accountHolderName = t_acHolName;
            System.out.println("\nYour Account is successfully created");
        }
    }
    
    public final int getAccountNumber ()
    {
        return m_accountNumber;
    }
    protected final void setAccountNumber (int t_acNumber)
    {
        if(getAccountNumber() < 0 && (t_acNumber > 1000))
        {
            m_accountNumber = t_acNumber;
        }
    }
    
    public final int getAccountBalance()
    {
        return m_accountBalance;
    }
    protected final void setAccountBalance(int t_acBal)
    {
        if(t_acBal > 0)
        {
            m_accountBalance = t_acBal;
        }
    }
    
    public final String getTypeOfAccount ()
    {
        return m_typeOfAccount;
    }
    protected void setTypeOfAccount (int t_check)
    {
        m_typeOfAccount = (t_check == 1) ? "Savings Account" : "Current Account";
    }
    
    public void deposite ( int t_depositeAmmount)
    {
        /// setBalance( (t_depositeAmmount <= 0) ? getBalance() : t_depositeAmmount);
        if(t_depositeAmmount > 0)
        {
            setAccountBalance (t_depositeAmmount+getAccountBalance());
            System.out.println("\nStatus::Successfully Deposite \u20B9" + t_depositeAmmount);
        }
    }
    
    public void withdraw (int t_withdrawlAmmount)
    {
        int tmpBalance = getAccountBalance ();
        
        if(tmpBalance >= t_withdrawlAmmount)
        {
            setAccountBalance ((tmpBalance-t_withdrawlAmmount));
            System.out.println("Successfully Withdrawl \u20B9" + t_withdrawlAmmount);
        }
        else
        {
           insufficientBalance ();
        }
    }
    
    public final void balance ()
    {
        System.out.println("Your Balance is \u20B9" + getAccountBalance () );
    }
    protected void insufficientBalance ()
    {
         System.out.println("Insufficient Balance");
    }
    
    
    public void showDetails ()
    {
        System.out.println();
        System.out.println("Name of the Account Holder is Mr./Mrs. " + getAccountHolderName ());
        System.out.println("The Account Number is " + getAccountNumber ());
    }
}
