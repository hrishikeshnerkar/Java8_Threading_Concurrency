package Java8.FileHandling;

import java.io.File;

public class FileHandlingApp {
    public static void main(String[] args) {
        File QuoteFile = new File("quotes.txt");
        try{
            if(QuoteFile.createNewFile()){
                System.out.println("The file is created");
            }
        }catch(Exception exception){
            exception.printStackTrace();
        }

        if(QuoteFile.renameTo(new File("QuotesFile.txt"))){
            System.out.println("The file is renamed");
        }
        
        if(QuoteFile.delete()){
            System.out.println("The file is deleted");
        }
    }
}
