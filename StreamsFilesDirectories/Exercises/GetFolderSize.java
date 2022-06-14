package Advanced.StreamsFilesDirectories.Exercises;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class GetFolderSize {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(folder);

        int bytesSum = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File [] filesNested = current.listFiles();
            for (File f : Objects.requireNonNull(filesNested)) {
                if (f.isDirectory()) {
                    dirs.offer(f);
                } else {
                    bytesSum += f.length();
                }
            }
        }
        System.out.println("Folder size: " + bytesSum);
    }
}
