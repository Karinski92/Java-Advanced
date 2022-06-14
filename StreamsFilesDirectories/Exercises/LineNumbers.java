package Advanced.StreamsFilesDirectories.Exercises;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String output = "C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output1.txt";

        BufferedReader reader = new BufferedReader(new FileReader(input));
        PrintWriter writer = new PrintWriter(new FileWriter(output));

        String line;
        int count = 1;
        while ((line = reader.readLine()) != null) {
            writer.println(count + ". " + line);
            count ++;
        }
        writer.close();
    }
}
