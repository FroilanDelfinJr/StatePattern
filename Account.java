public class Account{
    private String accountNumber;
    private Double balance;
    private AccountState accountState;
    
    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState = new ActiveState();
    }
    
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber; 
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(Double balance){
        this.balance = balance; 
    }

    public Double getBalance(){
        return balance;
    }

    public void setAccountState(AccountState accountState){
        this.accountState = accountState;
    }

    public AccountState getAccountState(){
        return accountState;
    }
    
    public void deposit(Double depositAmount){
        getAccountState().deposit(depositAmount, this);
    }

    public void withdraw(Double withdrawAmount){
        getAccountState().withdraw(withdrawAmount, this);
    }
    
    public void suspend(){
        getAccountState().suspend(this);;
    }

    public void activate(){
        getAccountState().activate(this);
    }

    public void close(){
        getAccountState().close(this);
    }

    public String toString(){
        return "Account Number: " + accountNumber + "\nCurrent Balance: " + balance;
    }
}