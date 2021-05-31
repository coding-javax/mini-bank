package Bank;

public class Account {
    String customerName;
    String customerID;
    int balance = 0;
    int previousTransaction = 0;

    Account(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println("Amount Deposited Sucessfully.");
            System.out.println("New Balance is: " + balance);
        } else {
            System.out.println("Please enter amount greater than 0");
        }
    }

    void withdraw(int amount) {
        if (amount < balance) {
            if (amount > 0) {
                balance = balance - amount;
                previousTransaction = -amount;
                System.out.println("Withdrawal Successful");
                System.out.println("New Balance is: " + balance);
            } else {
                System.out.println("Please enter amount greater than 0");
            }
        } else {
            System.out.println("Insufficient Funds, Cannot Withdraw");
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + previousTransaction);
        } else {
            System.out.println("No transaction occurred");
        }
    }

    void calculateInterest(int years) {
        double interestRate = .0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, you balance will be: " + newBalance);
    }
}