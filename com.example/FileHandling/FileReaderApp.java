import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {
    public static void main(String[] args) {
        String HAMLET = "Adv Java\\com.example\\src\\Hamlet.txt";

        char[] firstHundred = new char[100];
        try (FileReader hamletread = new FileReader(HAMLET)) {
            hamletread.read(firstHundred);
            System.out.println("First 100 characters of Hamlet: ");
            System.out.println(firstHundred);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}