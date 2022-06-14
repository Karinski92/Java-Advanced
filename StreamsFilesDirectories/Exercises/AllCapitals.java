package Advanced.StreamsFilesDirectories.Exercises;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String output = "C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(input));
        PrintWriter writer = new PrintWriter(new FileWriter(output));

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.toUpperCase();
            writer.println(line);
        }
        writer.close();


    }
}
