class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, int accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            deductBalance(amount);
            System.out.println("Withdrawn from Savings Account: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance in Savings Account");
        }
    }
}