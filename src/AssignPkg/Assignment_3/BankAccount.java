/*
    7. Design a class to represent a Bank Account. Include the following things:

    Fields
        Name of the depositor
        Account number
        Type of account
        Balance amount in the account.

    Constructor
        To assign initial values

    Methods
        To deposit an amount
        To withdraw an amount after checking balance
        To display the name and balance

*/
package AssignPkg.Assignment_3;

public class BankAccount
{
    private final String  m_accountHolderName;
    private static int m_accountNumber = -1; /// for testing purpose account number take between 100 to 150 means three digits only ..
    private String m_typeOfAccount;  /// 1 type is savings and 2 is current 
    private int m_balance = -1; 
    
    public BankAccount () 
    {
        m_accountNumber = -1;
        m_accountHolderName = "void";
        m_typeOfAccount = "void";
        m_balance = -1;
    }
    public BankAccount (String t_depositorName,  int t_initialBal ) 
    {
       m_accountHolderName = t_depositorName;
        m_typeOfAccount = "Savings";
        m_balance = t_initialBal;
        m_accountNumber = (m_accountNumber <= 0)? 100 : ++m_accountNumber;
    }
    public BankAccount (String t_depositorName, String t_typeOfAccount, int t_initialBal ) 
    {
       m_accountHolderName = t_depositorName;
        m_typeOfAccount = t_typeOfAccount;
        m_balance = t_initialBal;
        m_accountNumber = (m_accountNumber <= 0)? 100 : ++m_accountNumber;
    }
    /*
    /// this feature can not be implemented beacause one accountHolder can have
    /// one account only
    public BankAccount (BankAccount t_refObj) 
    {
        m_accountHolderName = t_refObj.m_accountHolderName;
        /// m_accountNumber = t_refObj.m_accountNumber;
        m_typeOfAccount = t_refObj.m_typeOfAccount;
        m_balance = t_refObj.m_balance;
        m_accountNumber = (m_accountNumber <= 0)? 100 : ++m_accountNumber;
    }
    */
   
    public String getAccountHolderName ()
    {
        return m_accountHolderName;
    }
    public int getAccountNumber ()
    {
        return m_accountNumber;
    }
    public String getTypeOfAccount ()
    {
        return m_typeOfAccount;
    }
    
    
    /// this feature will be added after the completion of the class
    /// this feature will use when account holder want to change their account
    /// type . it will cost him 100 rupees only...
    private void setTypeOfAccount ()
    {
        m_typeOfAccount = (m_typeOfAccount.equals("Current")) ? "Savings" : "Current";
    }
    
    public int getBalance ()
    {
        return m_balance;
    }
    private void setBalance (int t_balance)
    {
        m_balance = (m_balance < 0) ? 0 : t_balance;
    }
    
    public void showAccountDetails ()
    {
        System.out.println();
        System.out.println("Name of the Account Holder is Mr./Mrs. " + getAccountHolderName ());
        System.out.println("Type of Account is *" + getTypeOfAccount () + " account");
        System.out.println("The Account Number is " + getAccountNumber ());
        System.out.println("The Account Balance is " + getBalance ());
    }

    public void deposite ( int t_depositeAmmount)
    {
        /// setBalance( (t_depositeAmmount <= 0) ? getBalance() : t_depositeAmmount);
        if(t_depositeAmmount > 0)
        {
            setBalance (t_depositeAmmount);
            System.out.println("Successfully Deposite \u20B9" + t_depositeAmmount);
        }
    }
    
    public void withdraw (int t_withdrawlAmmount)
    {
        int tmpBalance = getBalance ();
        
        if(tmpBalance >= t_withdrawlAmmount)
        {
            setBalance (tmpBalance-t_withdrawlAmmount);
            System.out.println("Successfully Withdrawl \u20B9" + t_withdrawlAmmount);
        }
        else
        {
           insufficientBalance ();
        }
    }
    
    public final void balance ()
    {
        System.out.println("Your Balance is \u20B9" + getBalance () );
    }
    
    public void changeAccountType ()
    {
        if(getBalance() > 100)
            setTypeOfAccount ();
        insufficientBalance ();
        
        ///(getBalance() > 100) ? setTypeOfAccount (): insufficientBalance ();
    }
    private void insufficientBalance ()
    {
         System.out.println("Insufficient Balance");
    }
}



