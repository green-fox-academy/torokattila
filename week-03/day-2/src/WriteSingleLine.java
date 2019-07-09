import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

    public static void main(String[] args) {

        writeSingleLine("C:/Users/atti_/Desktop/my-files.txt");

    }

    public static void writeSingleLine(String file) {
            List<String> content = new ArrayList<>();
            content.add("Attila Torok");
            try {
                Path filePath = Paths.get(file);
                if (Files.exists(filePath)) {
                    Files.write(filePath, content);
                } else {
                    throw new IOException("fail");
                }
            } catch (IOException ex) {
                System.out.println("Unable to write file: my-file.txt");
            }
        }
    }
