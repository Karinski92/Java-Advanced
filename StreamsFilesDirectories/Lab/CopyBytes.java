package Advanced.StreamsFilesDirectories.Lab;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\karin\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";

        try (InputStream in = new FileInputStream(inputPath);
             OutputStream out = new FileOutputStream(outputPath)){

            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                if (oneByte ==10 || oneByte ==32) {
                    out.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        out.write(digits.charAt(i));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
