// This is the parent abstract class
// It has common data and common methods for all bank accounts

abstract class BankAccount {

    // private = cannot access directly from outside
    private String accountHolderName;
    private double balance;

    // Constructor
    // This runs when we create a new object
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter method to read account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter method to read balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    // Adds money to balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // This method helps child classes reduce balance
    // protected = child class can use it
    protected void deductBalance(double amount) {
        balance = balance - amount;
    }

    // Abstract method
    // Child class MUST write its own withdraw logic
    public abstract void withdraw(double amount);

    // Show account details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}