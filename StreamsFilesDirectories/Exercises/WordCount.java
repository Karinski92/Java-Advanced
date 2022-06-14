package Advanced.StreamsFilesDirectories.Exercises;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Path words = Paths.get("C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Path text  = Paths.get("C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        String result = "C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\result.txt";

        PrintWriter writer = new PrintWriter(new FileWriter(result));
        Map<String, Integer> fileWords = new HashMap<>();
        Arrays.stream(Files.readString(words).split("\\s+")).forEach(w -> fileWords.put(w, 0));
        Arrays.stream(Files.readString(text).split("\\s+")).forEach(t -> {
            if (fileWords.containsKey(t)) {
                fileWords.put(t, fileWords.get(t) + 1);
            }
        });
        fileWords.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(s -> writer.println(s.getKey() + " - " + s.getValue()));
        writer.close();
    }
}
