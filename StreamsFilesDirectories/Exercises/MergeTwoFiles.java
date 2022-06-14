package Advanced.StreamsFilesDirectories.Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Path input1 = Paths.get("C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path input2 = Paths.get("C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
        Path result = Paths.get("C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\result.txt");

        List<String> fileLines = new ArrayList<>();
        fileLines.addAll(Files.readAllLines(input1));
        fileLines.addAll(Files.readAllLines(input2));
        Files.write(result, fileLines);
    }
}
