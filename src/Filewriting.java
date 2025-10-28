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
                The Road Not Taken
                by Robert Frost
                
                Two roads diverged in a yellow wood,
                And sorry I could not travel both
                And be one traveler, long I stood
                And looked down one as far as I could
                To where it bent in the undergrowth;
                
                Then took the other, as just as fair,
                And having perhaps the better claim,
                Because it was grassy and wanted wear;
                Though as for that the passing there
                Had worn them really about the same,
                
                And both that morning equally lay
                In leaves no step had trodden black.
                Oh, I kept the first for another day!
                Yet knowing how way leads on to way,
                I doubted if I should ever come back.
                
                I shall be telling this with a sigh
                Somewhere ages and ages hence:
                Two roads diverged in a wood, and I—
                I took the one less traveled by,
                And that has made all the difference.
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