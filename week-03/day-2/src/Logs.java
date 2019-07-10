import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Logs {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try {
            Path filePath = Paths.get("C:/Users/atti_/Desktop/log.txt");
            lines = Files.readAllLines(filePath);
        } catch (Exception ex) {

        }

        System.out.println(Arrays.toString(getIpAddress(lines)));

    }

    public static String[] getIpAddress(List<String> file) {
        HashSet<String> unique = new HashSet<>();
        for(int i = 0; i < file.size(); i++) {
            String[] split = file.get(i).split("   ");
            unique.add(split[1]);
        }
        String[] strArray = unique.toArray(new String[unique.size()]);
        return  strArray;
    }



}
