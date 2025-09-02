package multithreading.sync;

public class SynchronizedApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread withdrawalmom = new Thread(()-> account.withDraw(800));
        Thread withdrawaldad = new Thread(()-> account.withDraw(400));

        Thread withdrawalmom1 = new Thread(()-> account.withDraw2(800));
        Thread withdrawaldad1 = new Thread(()-> account.withDraw2(400));

        BankAccount account2 = new BankAccount(2000);
        Thread withdrawalmom2 = new Thread(()-> account2.withDraw2(800));
        Thread withdrawaldad2 = new Thread(()-> account2.withDraw2(400));

        withdrawalmom2.start();
        withdrawaldad2.start();
    }
}
