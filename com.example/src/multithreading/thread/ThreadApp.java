package multithreading.thread;

public class ThreadApp {
    public static void main(String[] args) {
        WebsiteModule offers = new WebsiteModule("offers");
        WebsiteModule sales = new WebsiteModule("sales");
        WebsiteModule recentSearch = new WebsiteModule("recentSearch");

        /*
        //If we use run then first offers will run and then sales will run
        offers.run();
        sales.run();
         */

        //But if we use start here then both the offers and sale will run simultaneously
        offers.start();
        sales.start();
        recentSearch.start();

    }
}
