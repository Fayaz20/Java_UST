package Bank;

public class SavingsAccount extends BankAccount{

    public double withdraw_limit;

    public SavingsAccount(double initialBalance,double withdraw_limit){
        super(initialBalance);
        this.withdraw_limit=withdraw_limit;
    }
    @Override
    public void withdraw(double amount){
        if(amount<=withdraw_limit){
            super.withdraw(amount);
        }
        else{
            System.out.println("Withdrawl limit exceeded");
        }
    }
}
