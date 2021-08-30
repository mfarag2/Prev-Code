/**
 * @author Mary Farag
 * @version 1.1
 * Creates a simple and easy to use bank account
 */

public class BankAccount {
    private double balance;
    private int account=10000;
    private double apr = .0025 ;
    static int numAccs;

    /**
     * Creates a new bank account object with an assigned initial balance and assigned account number
     * PreCondition: amount must be positive
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance) {
      
        balance = initialBalance;
        account = account+getNumAcc();
    }
    
    /**
     * Created a new bank account object with an initial balance of 0 and assigned account number
     */ 
     public BankAccount() {
      
        balance = 0;
        account = account+getNumAcc();
    }
    
    /**
     * Returns the number of accounts created 
     * @return number of accounts
     */
     
     public int getNumAcc() { return numAccs++; }
     
    /**
     * Returns the account number
     * @return account number
     */ 
     
      public int getAccount() { return account; }
       
    /**
     * Returns the balance
     * @return balance
     */
      
    public double getBalance() { return balance; }
    
    /**
     * Returns the interest rate
     * @return interest rate
     */
    
    public double getInterestRate() { return apr; }

    /**
     * Adds money to the bank account
     * PreCondition: amount must be positive
     * @param amount to deposit
     *
     */
    
    public void deposit(double amount) { balance = balance +amount; }


    /**
     * Withdraws money from bank account
     * PreCondition: amount must be positive
     * @param amount to withdraw
     */
    public void withdraw (double amount){
        if (amount < 0)
            System.out.print("Error, negative amount:"+ amount);
        else if (balance - amount < 0)
            System.out.println("Error, overdrawn");
        else
            balance = balance - amount;
    }

}