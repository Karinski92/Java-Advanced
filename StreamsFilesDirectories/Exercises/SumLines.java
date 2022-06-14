package Advanced.StreamsFilesDirectories.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SumLines {
    public static void main(String[] args) throws IOException {
        Path input = Paths.get("C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        BufferedReader reader = Files.newBufferedReader(input);
        String line;

        while ((line = reader.readLine()) != null) {
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                sum += line.charAt(i);
            }
            System.out.println(sum);
        }

    }
}
