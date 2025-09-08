package multithreading.volatilekeyword;

public class VolatileApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        BalanceReader balanceReader = new BalanceReader(bankAccount);
        balanceReader.start();

        bankAccount.deposit(1000);
        bankAccount.deposit(2000);
        bankAccount.deposit(3000);
        bankAccount.deposit(2500);
        bankAccount.deposit(1500);

        System.out.println("Final balance: $" + bankAccount.getBalance());
    }
}
