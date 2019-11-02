import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        File dataFile = new File("problem1.txt");
        File outputFile = new File("unique_words.txt");

        try {
            duplicateRemover.remove(dataFile);
            duplicateRemover.write(outputFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
    }
}