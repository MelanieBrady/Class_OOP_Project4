import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        File dataFile = new File("problem2.txt");
        File outputFile = new File("unique_word_counts.txt");
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        try {
            duplicateCounter.count(dataFile);
            duplicateCounter.write(outputFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(-1);
        }

    }


}
