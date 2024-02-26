public class ClosedState implements AccountState{
    String output;

    public void deposit(Double depositAmount, Account account){
        System.out.println("You cannot deposit on a closed account!");
        System.out.println();
    }

    public void withdraw(Double withdrawAmount, Account account){
        System.out.println("You cannot withdraw on a closed account!");
        System.out.println();
    }

    public void suspend(Account account){
        System.out.println("You cannot suspend a closed account!");
        System.out.println();
    }

    public void activate(Account account){
        System.out.println("You cannot activate a closed account!");
        System.out.println();
    }

    public void close(Account account){
        System.out.println("Account is already closed!");
        System.out.println();
    }
}