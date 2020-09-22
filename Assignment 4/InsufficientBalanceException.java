import java.lang.Exception;
public class InsufficientBalanceException extends Exception{
    private static final long serialVersionUID = -2830654035809855739L;

    public InsufficientBalanceException(final double balance) {
        System.out.println("Your Balance is Not Sufficient to withdraw that amount\n Your Balance "+balance);
    }
}
