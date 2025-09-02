package multithreading.interrupt;

public class Tank {

    private int capacity;
    private int Currlevel=0;

    public Tank(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void pumpWater(int pumpingRate) {
        Currlevel += pumpingRate;
        System.out.println("Pumping rate: "+ pumpingRate+ " liters of water. Current level: " + Currlevel);
    }
}
