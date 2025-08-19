import java.io.File;

public class DirectoriesApp {
    public static void main(String[] args) {
        File booksDirect = new File("Ebooks\\Books");
        if(booksDirect.mkdirs()){
            System.out.println("The directory is created");
        } else {
            System.out.println("The directory already exists or could not be created");
        }    

        booksDirect.deleteOnExit();
    }
}