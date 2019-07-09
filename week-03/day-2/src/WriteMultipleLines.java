import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {

    public static void main(String[] args) {

        writeMultipleLines("C:/Users/atti_/Desktop/my-file.txt", "apple", 10);

    }

    public static void writeMultipleLines(String path, String word, int number) {
        List<String> content = new ArrayList<>();
            for(int i = 0; i < number; i++) {
            content.add(word);
        }
            try {
                Path filePath = Paths.get(path);
                if(Files.exists(filePath)) {
                    Files.write(filePath, content);
                } else {
                    throw new IOException("fail");
                }
            } catch (IOException ex) {
                System.out.println("");
            }

    }

}
