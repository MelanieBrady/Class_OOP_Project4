import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateCounter {
    Map<String, Integer> wordCounter;

    void count(File dataFile) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(dataFile.getCanonicalPath()));
        wordCounter = new HashMap<>();

        String word;
        while ((word = reader.readLine()) != null) {

            if (wordCounter.containsKey(word)) {
                wordCounter.put(word, wordCounter.get(word) + 1);
            } else {
                wordCounter.put(word, 1);
            }
        }
        reader.close();
    }

    void write(File outputFile) throws IOException {

        BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile.getCanonicalPath()));

        writer.write(wordCounter.toString());

        writer.close();

    }
}