package multithreading.interrupt;

public class InterruptApp {
    public static void main(String[] args) throws InterruptedException {
        Tank tank = new Tank(100);
        Pump pump1 = new Pump(tank, 15);
        Pump pump2 = new Pump(tank, 18);

        pump1.start();
        pump2.start();

        Thread.sleep(5000);

        tank.consumeWater(60);

        Thread.sleep(5000);

        pump1.interrupt();
        pump2.interrupt();

        pump1.join();
        pump2.join();

        System.out.println("Pumps have been stopped.");
    }
}
