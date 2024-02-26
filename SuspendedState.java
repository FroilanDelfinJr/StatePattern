public class SuspendedState implements AccountState{

    public void deposit(Double depositAmount, Account account){
        System.out.println("You cannot deposit while the account is suspended!");
        System.out.println();
        System.out.println(account.toString());
        System.out.println();
    }

    public void withdraw(Double withdrawAmount, Account account){
        System.out.println("You cannot withdraw while the account is suspended!");
        System.out.println();
        System.out.println(account.toString());
        System.out.println();
    }

    public void suspend(Account account){
        System.out.println("Account is already suspended!");
        System.out.println();
    }

    public void activate(Account account){
        System.out.println("Account is activated!");
        System.out.println();
        account.setAccountState(new ActiveState());
    }

    public void close(Account account){
        System.out.println("Account is closed!");
        System.out.println();
        account.setAccountState(new ClosedState());
    }
}