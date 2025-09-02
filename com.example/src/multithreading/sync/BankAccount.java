package multithreading.sync;

public class BankAccount {
    private static int balance; // changed to static keyword for other remove this static

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposit of $"+amount+" successfully. New balance: $"+balance);
    }

    public void withDraw(int amount) {

        // This is synchronized block
        synchronized (this) {
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                try {
                    System.out.println("3DS verification in progress");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                balance -= amount;
                System.out.println("Withdraw of $" + amount + " successfully. New balance: $" + balance);
            }
        }
    }

    // We have use synchronized keyword
    public synchronized  void withDraw2(int amount){
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            try {
                System.out.println("3DS verification in progress");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println("Withdraw of $" + amount + " successfully. New balance: $" + balance);
        }
    }

    //Now we used static keyword before synchronized
    public static synchronized void withDraw3(int amount){
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            try {
                System.out.println("3DS verification in progress");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println("Withdraw of $" + amount + " successfully. New balance: $" + balance);
        }
    }
}
