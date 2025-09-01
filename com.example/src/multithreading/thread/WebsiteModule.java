package multithreading.thread;

public class WebsiteModule extends Thread{

    private String moduleName;

    public WebsiteModule(String moduleName){
        this.moduleName = moduleName;
    }

    @Override
    public void run() {
        for (int i = 5; i > 0 ; i--) {
            System.out.println(moduleName+"module will be loaded "+ i + "sec.");

            //If error occurs bw the thread then it doesn't stop other threads
            if(i==3 && "sales".equals(moduleName)){
                throw  new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
