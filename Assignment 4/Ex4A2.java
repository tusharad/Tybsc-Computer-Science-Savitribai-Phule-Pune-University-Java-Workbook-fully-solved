/*
Define a class SavingAccount (acNo, name, balance). Define appropriate constructors and
operations withdraw(), deposit() and viewBalance(). The minimum balance must be 500.
Create an object and perform operations. Raise user defined InsufficientFundsException when
balance is not sufficient for withdraw operation.
*/
import java.lang.Exception;

class InsufficientFundsException extends Exception{
    private static final long serialVersionUID = 1L;
    double balance;
    public InsufficientFundsException(double balance){
        this.balance = balance;
    }
}

class SavingAccount extends Exception{
    private static final long serialVersionUID = 1L;
    String name;
    int acNo;
    double balance;
    public SavingAccount(String name, int acNo, double balance) {
        try {
            if (balance < 500)
                throw new InsufficientFundsException(balance);
        } catch (InsufficientFundsException e) {
            System.out.println("Minimum Balance of Rs.500 is required!");
            System.exit(0);
        }
        this.name = name;
        this.acNo = acNo;
        this.balance = balance;
    }
    double withdraw(double amt){
        double withdraw_amount;
        try{
            if(balance < amt)
                throw new InsufficientBalanceException(balance);
        }
        catch(InsufficientBalanceException e){
            //No code
        }
        finally{
            withdraw_amount = balance - amt;
            balance = balance - amt;
        }
        return withdraw_amount;
    }
    void deposite(double amt){
        balance += amt;
        System.out.println("Amount deposited succesfully!");
    }
    void ViewBalance(){
        System.out.println("Balance: "+balance);
    }
}
public class Ex4A2 {
    public static void main(String[] args){
        SavingAccount obj = new SavingAccount("Tushar",1200000001,2400.0);
        obj.ViewBalance();
        obj.deposite(300);
        obj.ViewBalance();
        obj.withdraw(5000);
        obj.ViewBalance();
        
    }
}
