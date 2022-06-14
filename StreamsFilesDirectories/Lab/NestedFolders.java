package Advanced.StreamsFilesDirectories.Lab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class NestedFolders {
    public static void main(String[] args) {
        File root = new File("C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);

        System.out.println(root.getName());
        int count = 1;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File [] filesNested = current.listFiles();
            for (File f : Objects.requireNonNull(filesNested)) {
                if (f.isDirectory()) {
                    dirs.offer(f);
                    System.out.println(f.getName());
                    count ++;
                }
            }
        }
        System.out.println(count + " folders");
    }
}
