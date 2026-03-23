// This is a child class
// It inherits from BankAccount

class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance); // calls parent constructor
    }

    // This is the withdraw method for savings account
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            deductBalance(amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }
}