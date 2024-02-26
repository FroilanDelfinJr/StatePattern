public class ActiveState implements AccountState{

    public void deposit(Double depositAmount, Account account){
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println(account.toString());
        System.out.println();
    }

    public void withdraw(Double withdrawAmount, Account account){
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println(account.toString());
        System.out.println();
    }

    public void suspend(Account account){
        System.out.println("Account is suspended!");
        System.out.println();
        account.setAccountState(new SuspendedState());
    }

    public void activate(Account account){
        System.out.println("Account is already activated!");
        System.out.println();
    }

    public void close(Account account){
        System.out.println("Account is closed!");
        System.out.println();
        account.setAccountState(new ClosedState());
    }
}