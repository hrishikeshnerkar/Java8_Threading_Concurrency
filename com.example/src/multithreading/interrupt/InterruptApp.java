package multithreading.interrupt;

public class InterruptApp {
    public static void main(String[] args) throws InterruptedException {
        Tank tank = new Tank(100);
        Pump pump1 = new Pump(tank, 5);
        Pump pump2 = new Pump(tank, 8);

        pump1.start();
        pump2.start();

        Thread.sleep(5000);

        pump1.interrupt();
        pump2.interrupt();

        pump1.join();
        pump2.join();

        System.out.println("Pumps have been stopped.");
    }
}
