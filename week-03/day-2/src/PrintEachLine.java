import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {

    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("C:/Users/atti_/Documents/Files.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines);
        } catch (IOException ex) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
