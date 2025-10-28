import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriting {
    public static void main(String[] args) throws IOException {

        //How to write a file in java? There are 4 ways.

        //FileWriter == A file writer object is good for small and medium size files.
        //BufferWriter == A file writer good large amount of text.
        //PrintWriter == A file writer for structured data, like reports, or logs.
        //FileOutputStream == Best for binary files ( e.g., images, audio files)

        String filePath = "./text.txt";
        String poem = """
                Roses are Red
                Violets are Blue
                
                """;

        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(poem);
            System.out.println("File has been written");
        }
        catch (IOException ex){
            System.out.println("Error writing to file");
        }
    }
}