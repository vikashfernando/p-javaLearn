// Main class
// Program starts from here

public class Main {
    public static void main(String[] args){

        // Create a savings account object
        SavingsAccount account1 = new SavingsAccount("Vikash", 5000);

        // Show first details
        System.out.println("---- Account Details ----");
        account1.displayDetails();

        System.out.println();

        // Deposit money
        account1.deposit(1000);

        // Withdraw money
        account1.withdraw(2000);

        System.out.println();

        // Show updated details
        System.out.println("---- Updated Account Details ----");
        account1.displayDetails();
    }
}