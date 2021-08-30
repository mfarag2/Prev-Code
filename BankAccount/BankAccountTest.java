public class BankAccountTester { 
    public static void main(String[] args) { 
        BankAccount one = new BankAccount(0);
        BankAccount two = new BankAccount (500); 
        BankAccount three = new BankAccount (200); 
 
        System.out.println("Bank Account one Balance: $"+one.getBalance()); 
        System.out.println("Bank Account two Balance: $"+two.getBalance()); 
        System.out.println("Bank Account three Balance: $"+three.getBalance()); 
 
        one.deposit(500); 
        two.withdraw(50); 
        three.withdraw(100); 
        
      //  public void displayData() {
           System.out.println("Bank Account new one Balance: $"+one.getBalance()); 
        System.out.println("Bank Account new two Balance: $"+two.getBalance()); 
        System.out.println("Bank Account new three Balance: $"+three.getBalance()); 
          
    //    }
 
       
 
        System.out.println("Bank Account one number ID: "+one.getAccount()); 
        System.out.println("Bank Account two number ID: "+two.getAccount()); 
        System.out.println("Bank Account three number ID: "+three.getAccount()); 
 
        System.out.println("Bank Account one interest rate: "+one.getInterestRate()); 
        System.out.println("Bank Account two interest rate: "+two.getInterestRate()); 
        System.out.println("Bank Account three interest rate: "+three.getInterestRate()); 
 
 
    } 
}
/* 
> run BankAccountTester
Bank Account one Balance: $0.0
Bank Account two Balance: $500.0
Bank Account three Balance: $200.0

Bank Account new one Balance: $500.0
Bank Account new two Balance: $450.0
Bank Account new three Balance: $100.0

Bank Account one number ID: 10000
Bank Account two number ID: 10001
Bank Account three number ID: 10002

Bank Account one interest rate: 0.0025
Bank Account two interest rate: 0.0025
Bank Account three interest rate: 0.0025
> */