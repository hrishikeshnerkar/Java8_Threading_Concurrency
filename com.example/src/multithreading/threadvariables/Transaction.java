package multithreading.threadvariables;

import java.util.Random;

public class Transaction implements Runnable{

    private volatile double balance = 100;

    @Override
    public void run() {
//        balance = new Random().nextDouble()*100;
        double transactionAmount = new Random().nextDouble()*100;
        balance += transactionAmount;
        System.out.println("Balance "+ balance+" Transaction Amount "+ transactionAmount);
    }
}
