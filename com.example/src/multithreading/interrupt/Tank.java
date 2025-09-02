package multithreading.interrupt;

public class Tank {

    private int capacity;
    private int Currlevel=0;

    public Tank(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void pumpWater(int pumpingRate) throws InterruptedException {

        if(Currlevel + pumpingRate > capacity){
            System.out.println("tank is fulled. Waiting for consumptions....");
            wait();
        }

        Currlevel += pumpingRate;
        System.out.println("Pumping rate: "+ pumpingRate+ " liters of water. Current level: " + Currlevel);
    }

    public synchronized void consumeWater(int amount){
        if(amount <= Currlevel){
            Currlevel -= amount;
            System.out.println("Consuming "+ amount+ " liters of water. Current level "+ Currlevel);
//            notify();// If we use this tank is full called for one thread
            notifyAll(); // But for this tank is full called for both threads
        }
    }
}
