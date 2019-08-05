import java.util.Arrays;

public class Exercise6 {

    public static void main(String[] args) {
        String string = "APpLe";
        String[] splitString = string.split("");
        Arrays.stream(splitString)
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .forEach(System.out::println);

    }
}
