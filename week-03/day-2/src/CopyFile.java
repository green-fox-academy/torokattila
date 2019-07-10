import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) {
        System.out.println(copyFiles("C:/Users/atti_/Desktop/file.txt", "C:/Users/atti_/Desktop/another-file.txt"));
    }

    public static boolean copyFiles(String file, String anotherFile) {
        try {
            Path filePath = Paths.get(file);
            List<String> lines = Files.readAllLines(filePath);
            Path copyPath = Paths.get(anotherFile);
            Files.write(copyPath, lines);
            return true;
        } catch (IOException ex) {
            System.out.println("Unable to copy!");
        }
        return false;
    }

}
