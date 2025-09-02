package multithreading.join;

public class JoinApp {
    public static void main(String[] args) {
        RecipeStep onion = new RecipeStep("Dice 2 onions!", 2000);
        RecipeStep tomato = new RecipeStep("Dice 2 tomato!", 2000);
        RecipeStep pan = new RecipeStep("Get a pan and start frying!", 2000);
        RecipeStep water = new RecipeStep("Boil 1L of water!", 1000);
        RecipeStep pasta = new RecipeStep("Put the pasta in boiling water!", 500);

        Thread onionThread = new Thread(onion);
        Thread tomatoThread = new Thread(tomato);
        Thread panThread = new Thread(pan);
        Thread waterThread = new Thread(water);
        Thread pastaThread = new Thread(pasta);

        try {
            onionThread.start();
            onionThread.join();
            tomatoThread.start();
            tomatoThread.join();
            panThread.start();
            waterThread.start();
            waterThread.join();
            pastaThread.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
