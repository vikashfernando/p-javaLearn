public class Main{
    public static void main(String[] args) {

        BankAccount account1 = new SavingsAccount("Vikash", 1001, 5000);
        BankAccount account2 = new CurrentAccount("Nimal", 1002, 3000, 2000);

        System.out.println("---- Savings Account ----");
        account1.displayDetails();
        account1.deposit(1000);
        account1.withdraw(2000);
        System.out.println("Updated Balance: " + account1.getBalance());

        System.out.println();

        System.out.println("---- Current Account ----");
        account2.displayDetails();
        account2.deposit(500);
        account2.withdraw(4000);
        System.out.println("Updated Balance: " + account2.getBalance());
    }
}