import java.util.Scanner;

class CheckingAccount extends Account {

    double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(double overdraftLimit, int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

}

class SavingsAccount extends Account {

    int creditCardNumber;

    public SavingsAccount(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public SavingsAccount(int creditCardNumber, int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        this.creditCardNumber = creditCardNumber;
    }

    public double getCreditBalance() {
        return getBalance() * 3;
    }

    public void display(SavingsAccount obj) {

        System.out.println("Credit Card Number : " + creditCardNumber);
        System.out.println("Credit Balance : " + this.getCreditBalance());

    }
}


