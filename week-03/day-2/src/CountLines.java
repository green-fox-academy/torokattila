import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {

        System.out.println(countLines("C:/Users/atti_/Documents/Files.txt"));

    }

    public static int countLines(String file) {
        try {
            Path filePath = Paths.get(file);
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (IOException ex) {
            return 0;
        }
    }

}
