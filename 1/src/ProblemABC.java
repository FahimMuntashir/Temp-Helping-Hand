import java.util.Scanner;

public class ProblemABC {

    public static void main(String[] args) {

        Account ob1 = new Account(1122, 20000, 4.5);
        ob1.withdraws(2500);
        ob1.deposite(3000);
        System.out.println(ob1);
        System.out.println(ob1.getMonthlyInterestAmount(20500.0));

        SavingsAccount ob2 = new SavingsAccount(112233, 1122, 20500.0, 4.5);
        ob2.display(ob2);

        System.out.println("Press (1) for creating a Check Account");
        System.out.println("Press (2) for creating a Save Account");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        switch (n) {
            case 1: {
                System.out.println("This is a Checking Account");
                Account a1[] = new Account[4];

                a1[0] = new CheckingAccount(5000, 750, 5000, 4.5);
                a1[0].withdraws(1500);
                a1[0].deposite(2000);
                System.out.println(a1[0]);

                a1[1] = new CheckingAccount(5000, 750, 5000, 4.5);
                a1[1].withdraws(1500);
                a1[1].deposite(2000);
                System.out.println(a1[1]);

                a1[2] = new CheckingAccount(5000, 750, 5000, 4.5);
                a1[2].withdraws(1500);
                a1[2].deposite(1000);
                System.out.println(a1[2]);

                a1[2] = new CheckingAccount(5000, 750, 5000, 4.5);
                a1[2].withdraws(1000);
                a1[2].deposite(2000);
                System.out.println(a1[2]);
                break;
            }
            case 2: {
                System.out.println("This is a Savings Account");
                Account a1[] = new Account[4];

                a1[0] = new SavingsAccount(1000, 2000, 2.5, 18000);
                ((SavingsAccount) a1[0]).display((SavingsAccount) a1[0]);

                a1[1] = new SavingsAccount(1000, 2000, 2.5, 18000);
                ((SavingsAccount) a1[1]).display((SavingsAccount) a1[1]);

                a1[2] = new SavingsAccount(1000, 2000, 2.5, 18000);
                ((SavingsAccount) a1[2]).display((SavingsAccount) a1[2]);

                a1[3] = new SavingsAccount(1000, 2000, 2.5, 18000);
                ((SavingsAccount) a1[3]).display((SavingsAccount) a1[3]);

                break;
            }
        }
    }
}