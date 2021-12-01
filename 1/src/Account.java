class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(double annualInterestRate) {

        return (annualInterestRate / 100) / 12;

    }

    public double getMonthlyInterestAmount(double balance) {

        return (balance * this.getMonthlyInterestRate(annualInterestRate));
    }

    public void withdraws(int amount) {

        if (balance <= amount) {
            System.out.println("Sorry, insufficient balance.");
        } else {
            balance = balance - amount;
        }
    }

    public void deposite(int amount) {
        balance = balance + amount;
    }

    @Override
    public String toString() {
        return "Account : " + "id = " + id + ", balance = " + balance + ", annualInterestRate = " + annualInterestRate;
    }

}
