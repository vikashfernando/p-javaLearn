class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, int accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            deductBalance(amount);
            System.out.println("Withdrawn from Current Account: " + amount);
        } else {
            System.out.println("Amount exceeds overdraft limit");
        }
    }
}