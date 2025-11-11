import java.util.Scanner;

class Account {
    String name, type;
    int accNo;
    double balance;

    // Constructor
    void account(String n, int no, String t) {
        name = n;
        accNo = no;
        type = t;
        balance = 0.0;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount deposited.");
    }

    void display() {
        System.out.println("Customer: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
    }
}

class Savings extends Account {
    void interest() {
        double i = balance * 0.05;
        balance += i;
        System.out.println("Interest added: " + i);
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance!");
    }
}

class Current extends Account {
    void withdraw(double amt) {
        balance -= amt;
        if (balance < 500) {
            balance -= 50;
            System.out.println("Service charge imposed.");
        }
    }
}

public class lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Savings s = new Savings();
        Current c = new Current();

        System.out.print("Enter customer name for savings account: ");
        String n1 = sc.next();
        System.out.print("Enter savings account number: ");
        int a1 = sc.nextInt();
        s.account(n1, a1, "Savings");

        System.out.print("Enter customer name for current account: ");
        String n2 = sc.next();
        System.out.print("Enter current account number: ");
        int a2 = sc.nextInt();
        c.account(n2, a2, "Current");

        int ch;
        do {
            System.out.println("\n1.Deposit  2.Withdraw  3.Interest  4.Display  5.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Account type (saving/current): ");
                    String t = sc.next();
                    System.out.print("Amount: ");
                    double d = sc.nextDouble();
                    if (t.equalsIgnoreCase("saving"))
                        s.deposit(d);
                    else
                        c.deposit(d);
                }
                case 2 -> {
                    System.out.print("Account type (saving/current): ");
                    String t = sc.next();
                    System.out.print("Amount: ");
                    double w = sc.nextDouble();
                    if (t.equalsIgnoreCase("saving"))
                        s.withdraw(w);
                    else
                        c.withdraw(w);
                }
                case 3 -> s.interest();
                case 4 -> {
                    System.out.print("Account type (saving/current): ");
                    String t = sc.next();
                    if (t.equalsIgnoreCase("saving"))
                        s.display();
                    else
                        c.display();
                }
                case 5 -> System.out.println("Thank you!");
                default -> System.out.println("Invalid choice!");
            }
        } while (ch != 5);

        sc.close();
    }
}
