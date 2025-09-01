package multithreading.runnable;

public class RunnableApp {
    public static void main(String[] args) {
        WebsiteModule offers = new WebsiteModule("offers");
        WebsiteModule sales = new WebsiteModule("sales");
        WebsiteModule recentSearches = new WebsiteModule("recentSearches");

        Thread offersThread = new Thread(offers);
        offersThread.start();

        Thread salesThread = new Thread(sales);
        salesThread.start();

        Thread recentSearchThread = new Thread(recentSearches);
        recentSearchThread.start();
    }
}
