import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private List<INotifier> notifiers;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.notifiers = new ArrayList<>();
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }
    
    public void registerNotifier(INotifier notifier) {
        this.notifiers.add(notifier);
    }

    public void unregisterNotifier(INotifier notifier) {
        this.notifiers.remove(notifier);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("\nDeposited " + amount + " to Account " + accountNumber);
        for (INotifier notifier : notifiers) {
            notifier.notifyUser(this);
        }
    }

    public void withdraw(double amount) throws ExceptionTest {
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("\nWithdrawn " + amount + " from Account " + accountNumber);
            for (INotifier notifier : notifiers) {
                notifier.notifyUser(this);
            }
        } else {
            throw new ExceptionTest("Error: Insufficient balance in Account " + accountNumber);
        }
    }

    @Override
    public String toString() {
        return "Account " + accountNumber + ": " + name + " (Balance: " + balance + ")";
    }
}