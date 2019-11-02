import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemover {
    public Set<String> uniqueWords;

    public void remove(File dataFile) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(dataFile.getCanonicalPath()));

        uniqueWords = new HashSet<>();

        String word;
        while ((word = reader.readLine()) != null) {
            uniqueWords.add(word);
        }

        reader.close();
    }


    public void write(File outputFile) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile.getCanonicalPath()));

        writer.write(uniqueWords.toString());

        writer.close();
    }
}


















//        File f;
//        FileWriter fw = null;
//
//        f = new File(outputFile);
////If file already exists then write data to the existing file
//        if(f.exists()) {
//            fw=new FileWriter(f,true);
//            Iterator itr=uniqueWords.iterator();
//
//            while(itr.hasNext())
//            {
//                String str=(String)itr.next();
//                fw.write(str+"\n");
//            }
//            fw.close();
//            System.out.println("Data Written to File");
//
//        }
//        else
//        {
////If no file already exists.Create new File
//            f.createNewFile();
//            fw=new FileWriter(f);
//            Iterator itr=uniqueWords.iterator();
//
//            while(itr.hasNext())
//            {
//                String str=(String)itr.next();
//                fw.write(str+"\n");
//            }
//            fw.close();
//            System.out.println("Data Written to File");
//        }
//
//    }
//
//}

//static vs instance methods?

//takes a single parameter called dataFile (representing the path to a text file) and uses a Set of Strings to eliminate duplicate words from dataFile.
//The remove method shall terminate the program and alert the user when an exceptional IO event occurs
//The remove method shall clean up any and all resources allocated during method execution


//Create an instance method called write that takes a single parameter called outputFile (representing the path to a text file) and writes the words contained in uniqueWords to the file pointed to by outputFile.
//Given a text file, outputFile, the write method shall print the current collection of unique words to outputFile
//The write method shall terminate the program and alert the user when an exceptional IO event occurs
//The write method shall clean up any and all resources allocated during method execution

/* input file must be called problem1.txt and your output file must be called unique_words.txt.
You will not receive credit if you use different file names, as my graders will not modify your code to make it work with their test files.
The unique words should be stored in an instance variable called uniqueWords.
The output file should be overwritten if it already exists, and created if it does not exist.
Your program should work on any text file. The TA's will provide their own version of problem1.txt when they run your code.
Given a text file, dataFile, the remove method shall determine the unique words contained in dataFIle and store those unique words in the associated DuplicateRemover object */

