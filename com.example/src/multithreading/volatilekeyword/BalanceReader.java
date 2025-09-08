package multithreading.volatilekeyword;

public class BalanceReader extends Thread {
    private BankAccount bankAccount;

    public BalanceReader(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        double balance = bankAccount.getBalance();
        while(balance < 10000){
            if(balance != bankAccount.getBalance()){
                System.out.println("Balance is changed: "+bankAccount.getBalance());
                balance = bankAccount.getBalance();
            }
        }
    }
}
