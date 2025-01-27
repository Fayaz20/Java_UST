package Bank;

public class Main {
    public static void main(String []args){
        BankAccount savingsAccount = new SavingsAccount(3000, 850);
        BankAccount checkingAccount = new CheckingAccount(2000, 200);

        withdrawFromAccount(savingsAccount, 300);
        withdrawFromAccount(checkingAccount, 250);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }

    public static void withdrawFromAccount(BankAccount account, double amount) {
        account.withdraw(amount);
    }
}
